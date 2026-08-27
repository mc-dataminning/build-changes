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

public class ajg {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vd.b("commands.fill.toobig", $$0, $$1));
   static final fh b = new fh(cwl.a.o(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vd.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("from", fm.a())
                  .then(
                     dt.a("to", fm.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                "block", fj.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ds)$$0x.getSource(), dyr.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ajg.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dt.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            dyr.a(fm.a($$0x, "from"), fm.a($$0x, "to")),
                                                            fj.a($$0x, "block"),
                                                            ajg.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("filter", fi.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               dyr.a(fm.a($$0x, "from"), fm.a($$0x, "to")),
                                                               fj.a($$0x, "block"),
                                                               ajg.a.a,
                                                               fi.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          dt.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      dyr.a(fm.a($$0x, "from"), fm.a($$0x, "to")),
                                                      fj.a($$0x, "block"),
                                                      ajg.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       dt.a("outline")
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), dyr.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ajg.a.b, null)
                                          )
                                    ))
                                 .then(
                                    dt.a("hollow")
                                       .executes(
                                          $$0x -> a((ds)$$0x.getSource(), dyr.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ajg.a.c, null)
                                       )
                                 ))
                              .then(
                                 dt.a("destroy")
                                    .executes($$0x -> a((ds)$$0x.getSource(), dyr.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ajg.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, dyr $$1, fh $$2, ajg.a $$3, @Nullable Predicate<dje> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().Z().c(cte.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<hx> $$7 = Lists.newArrayList();
         amz $$8 = $$0.e();
         int $$9 = 0;

         for (hx $$10 : hx.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dje($$8, $$10, true))) {
               fh $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dgo $$12 = $$8.c_($$10);
                  bjm.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (hx $$13 : $$7) {
            cwj $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> vd.a("commands.fill.success", $$15), true);
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
               ? ajg.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final akr.a e;

      private a(akr.a $$0) {
         this.e = $$0;
      }
   }
}
