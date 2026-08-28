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

public class amw {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wz.b("commands.fill.toobig", $$0, $$1));
   static final gk b = new gk(dga.a.o(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("commands.fill.failed"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("from", gp.a())
                  .then(
                     eu.a("to", gp.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a(
                                                "block", gm.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((et)$$0x.getSource(), ejj.a(gp.a($$0x, "from"), gp.a($$0x, "to")), gm.a($$0x, "block"), amw.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)eu.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(),
                                                            ejj.a(gp.a($$0x, "from"), gp.a($$0x, "to")),
                                                            gm.a($$0x, "block"),
                                                            amw.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   eu.a("filter", gl.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               ejj.a(gp.a($$0x, "from"), gp.a($$0x, "to")),
                                                               gm.a($$0x, "block"),
                                                               amw.a.a,
                                                               gl.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          eu.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      ejj.a(gp.a($$0x, "from"), gp.a($$0x, "to")),
                                                      gm.a($$0x, "block"),
                                                      amw.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       eu.a("outline")
                                          .executes(
                                             $$0x -> a((et)$$0x.getSource(), ejj.a(gp.a($$0x, "from"), gp.a($$0x, "to")), gm.a($$0x, "block"), amw.a.b, null)
                                          )
                                    ))
                                 .then(
                                    eu.a("hollow")
                                       .executes(
                                          $$0x -> a((et)$$0x.getSource(), ejj.a(gp.a($$0x, "from"), gp.a($$0x, "to")), gm.a($$0x, "block"), amw.a.c, null)
                                       )
                                 ))
                              .then(
                                 eu.a("destroy")
                                    .executes($$0x -> a((et)$$0x.getSource(), ejj.a(gp.a($$0x, "from"), gp.a($$0x, "to")), gm.a($$0x, "block"), amw.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(et $$0, ejj $$1, gk $$2, amw.a $$3, @Nullable Predicate<dtg> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().ab().c(dcs.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<jd> $$7 = Lists.newArrayList();
         aqu $$8 = $$0.e();
         int $$9 = 0;

         for (jd $$10 : jd.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dtg($$8, $$10, true))) {
               gk $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dqh $$12 = $$8.c_($$10);
                  bqi.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.j());
                     $$9++;
                  }
               }
            }
         }

         for (jd $$13 : $$7) {
            dfy $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> wz.a("commands.fill.success", $$15), true);
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
               ? amw.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aoh.a e;

      private a(final aoh.a $$0) {
         this.e = $$0;
      }
   }
}
