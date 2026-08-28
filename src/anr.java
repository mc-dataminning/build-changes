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

public class anr {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xl.b("commands.fill.toobig", $$0, $$1));
   static final gn b = new gn(dil.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("from", gs.a())
                  .then(
                     ex.a("to", gs.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a(
                                                "block", gp.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ew)$$0x.getSource(), elt.a(gs.a($$0x, "from"), gs.a($$0x, "to")), gp.a($$0x, "block"), anr.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ex.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ew)$$0x.getSource(),
                                                            elt.a(gs.a($$0x, "from"), gs.a($$0x, "to")),
                                                            gp.a($$0x, "block"),
                                                            anr.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ex.a("filter", go.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               elt.a(gs.a($$0x, "from"), gs.a($$0x, "to")),
                                                               gp.a($$0x, "block"),
                                                               anr.a.a,
                                                               go.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ex.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      elt.a(gs.a($$0x, "from"), gs.a($$0x, "to")),
                                                      gp.a($$0x, "block"),
                                                      anr.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ex.a("outline")
                                          .executes(
                                             $$0x -> a((ew)$$0x.getSource(), elt.a(gs.a($$0x, "from"), gs.a($$0x, "to")), gp.a($$0x, "block"), anr.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ex.a("hollow")
                                       .executes(
                                          $$0x -> a((ew)$$0x.getSource(), elt.a(gs.a($$0x, "from"), gs.a($$0x, "to")), gp.a($$0x, "block"), anr.a.c, null)
                                       )
                                 ))
                              .then(
                                 ex.a("destroy")
                                    .executes($$0x -> a((ew)$$0x.getSource(), elt.a(gs.a($$0x, "from"), gs.a($$0x, "to")), gp.a($$0x, "block"), anr.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, elt $$1, gn $$2, anr.a $$3, @Nullable Predicate<dvs> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().ac().c(dfb.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<jh> $$7 = Lists.newArrayList();
         arq $$8 = $$0.e();
         int $$9 = 0;

         for (jh $$10 : jh.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dvs($$8, $$10, true))) {
               gn $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dsr $$12 = $$8.c_($$10);
                  bry.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.j());
                     $$9++;
                  }
               }
            }
         }

         for (jh $$13 : $$7) {
            dij $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> xl.a("commands.fill.success", $$15), true);
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
               ? anr.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final apc.a e;

      private a(final apc.a $$0) {
         this.e = $$0;
      }
   }
}
