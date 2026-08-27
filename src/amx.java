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

public class amx {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.fill.toobig", $$0, $$1));
   static final fy b = new fy(dfe.a.n(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.fill.failed"));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ei.a("from", gd.a())
                  .then(
                     ei.a("to", gd.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a(
                                                "block", ga.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((eh)$$0x.getSource(), ejl.a(gd.a($$0x, "from"), gd.a($$0x, "to")), ga.a($$0x, "block"), amx.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ei.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (eh)$$0x.getSource(),
                                                            ejl.a(gd.a($$0x, "from"), gd.a($$0x, "to")),
                                                            ga.a($$0x, "block"),
                                                            amx.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ei.a("filter", fz.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               ejl.a(gd.a($$0x, "from"), gd.a($$0x, "to")),
                                                               ga.a($$0x, "block"),
                                                               amx.a.a,
                                                               fz.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ei.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (eh)$$0x.getSource(),
                                                      ejl.a(gd.a($$0x, "from"), gd.a($$0x, "to")),
                                                      ga.a($$0x, "block"),
                                                      amx.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ei.a("outline")
                                          .executes(
                                             $$0x -> a((eh)$$0x.getSource(), ejl.a(gd.a($$0x, "from"), gd.a($$0x, "to")), ga.a($$0x, "block"), amx.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ei.a("hollow")
                                       .executes(
                                          $$0x -> a((eh)$$0x.getSource(), ejl.a(gd.a($$0x, "from"), gd.a($$0x, "to")), ga.a($$0x, "block"), amx.a.c, null)
                                       )
                                 ))
                              .then(
                                 ei.a("destroy")
                                    .executes($$0x -> a((eh)$$0x.getSource(), ejl.a(gd.a($$0x, "from"), gd.a($$0x, "to")), ga.a($$0x, "block"), amx.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eh $$0, ejl $$1, fy $$2, amx.a $$3, @Nullable Predicate<dtg> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().ab().c(dbw.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<ir> $$7 = Lists.newArrayList();
         aqt $$8 = $$0.e();
         int $$9 = 0;

         for (ir $$10 : ir.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dtg($$8, $$10, true))) {
               fy $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dqc $$12 = $$8.c_($$10);
                  bpr.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (ir $$13 : $$7) {
            dfc $$14 = $$8.a_($$13).b();
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
               ? amx.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aoj.a e;

      private a(aoj.a $$0) {
         this.e = $$0;
      }
   }
}
