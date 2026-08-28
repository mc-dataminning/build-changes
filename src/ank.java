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

public class ank {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.fill.toobig", $$0, $$1));
   static final gl b = new gl(dho.a.n(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.fill.failed"));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ev.a("from", gq.a())
                  .then(
                     ev.a("to", gq.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a(
                                                "block", gn.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((eu)$$0x.getSource(), eky.a(gq.a($$0x, "from"), gq.a($$0x, "to")), gn.a($$0x, "block"), ank.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ev.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (eu)$$0x.getSource(),
                                                            eky.a(gq.a($$0x, "from"), gq.a($$0x, "to")),
                                                            gn.a($$0x, "block"),
                                                            ank.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ev.a("filter", gm.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               eky.a(gq.a($$0x, "from"), gq.a($$0x, "to")),
                                                               gn.a($$0x, "block"),
                                                               ank.a.a,
                                                               gm.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ev.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (eu)$$0x.getSource(),
                                                      eky.a(gq.a($$0x, "from"), gq.a($$0x, "to")),
                                                      gn.a($$0x, "block"),
                                                      ank.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ev.a("outline")
                                          .executes(
                                             $$0x -> a((eu)$$0x.getSource(), eky.a(gq.a($$0x, "from"), gq.a($$0x, "to")), gn.a($$0x, "block"), ank.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ev.a("hollow")
                                       .executes(
                                          $$0x -> a((eu)$$0x.getSource(), eky.a(gq.a($$0x, "from"), gq.a($$0x, "to")), gn.a($$0x, "block"), ank.a.c, null)
                                       )
                                 ))
                              .then(
                                 ev.a("destroy")
                                    .executes($$0x -> a((eu)$$0x.getSource(), eky.a(gq.a($$0x, "from"), gq.a($$0x, "to")), gn.a($$0x, "block"), ank.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eu $$0, eky $$1, gl $$2, ank.a $$3, @Nullable Predicate<duw> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().ac().c(def.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<jf> $$7 = Lists.newArrayList();
         arj $$8 = $$0.e();
         int $$9 = 0;

         for (jf $$10 : jf.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new duw($$8, $$10, true))) {
               gl $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  drv $$12 = $$8.c_($$10);
                  brj.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.j());
                     $$9++;
                  }
               }
            }
         }

         for (jf $$13 : $$7) {
            dhm $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> xe.a("commands.fill.success", $$15), true);
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
               ? ank.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aov.a e;

      private a(final aov.a $$0) {
         this.e = $$0;
      }
   }
}
