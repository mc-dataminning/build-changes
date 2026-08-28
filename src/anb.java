import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anb {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.fill.toobig", $$0, $$1));
   static final go b = new go(djp.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wp.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("from", gt.a())
                  .then(
                     ey.a("to", gt.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                                "block", gq.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ex)$$0x.getSource(), enf.a(gt.a($$0x, "from"), gt.a($$0x, "to")), gq.a($$0x, "block"), anb.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ey.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            enf.a(gt.a($$0x, "from"), gt.a($$0x, "to")),
                                                            gq.a($$0x, "block"),
                                                            anb.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("filter", gp.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               enf.a(gt.a($$0x, "from"), gt.a($$0x, "to")),
                                                               gq.a($$0x, "block"),
                                                               anb.a.a,
                                                               gp.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ey.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      enf.a(gt.a($$0x, "from"), gt.a($$0x, "to")),
                                                      gq.a($$0x, "block"),
                                                      anb.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ey.a("outline")
                                          .executes(
                                             $$0x -> a((ex)$$0x.getSource(), enf.a(gt.a($$0x, "from"), gt.a($$0x, "to")), gq.a($$0x, "block"), anb.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ey.a("hollow")
                                       .executes(
                                          $$0x -> a((ex)$$0x.getSource(), enf.a(gt.a($$0x, "from"), gt.a($$0x, "to")), gq.a($$0x, "block"), anb.a.c, null)
                                       )
                                 ))
                              .then(
                                 ey.a("destroy")
                                    .executes($$0x -> a((ex)$$0x.getSource(), enf.a(gt.a($$0x, "from"), gt.a($$0x, "to")), gq.a($$0x, "block"), anb.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, enf $$1, go $$2, anb.a $$3, @Nullable Predicate<dxc> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().O().c(dgf.A);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<ji> $$7 = Lists.newArrayList();
         ard $$8 = $$0.e();
         int $$9 = 0;

         for (ji $$10 : ji.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dxc($$8, $$10, true))) {
               go $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dua $$12 = $$8.c_($$10);
                  bsc.a($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.j());
                     $$9++;
                  }
               }
            }
         }

         for (ji $$13 : $$7) {
            djn $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> wp.a("commands.fill.success", $$15), true);
            return $$9;
         }
      }
   }

   static enum a {
      a(($$0, $$1, $$2, $$3) -> $$2),
      b(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? null
               : $$2
      ),
      c(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? anb.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aoo.a e;

      private a(final aoo.a $$0) {
         this.e = $$0;
      }
   }
}
