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

public class aha {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> tn.a("commands.fill.toobig", $$0, $$1));
   static final ff b = new ff(csy.a.n(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tn.c("commands.fill.failed"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               du.a("from", fk.a())
                  .then(
                     du.a("to", fk.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a(
                                                "block", fh.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((dt)$$0x.getSource(), dvc.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aha.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)du.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            dvc.a(fk.a($$0x, "from"), fk.a($$0x, "to")),
                                                            fh.a($$0x, "block"),
                                                            aha.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   du.a("filter", fg.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               dvc.a(fk.a($$0x, "from"), fk.a($$0x, "to")),
                                                               fh.a($$0x, "block"),
                                                               aha.a.a,
                                                               fg.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          du.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (dt)$$0x.getSource(),
                                                      dvc.a(fk.a($$0x, "from"), fk.a($$0x, "to")),
                                                      fh.a($$0x, "block"),
                                                      aha.a.a,
                                                      $$0xx -> $$0xx.c().t($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       du.a("outline")
                                          .executes(
                                             $$0x -> a((dt)$$0x.getSource(), dvc.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aha.a.b, null)
                                          )
                                    ))
                                 .then(
                                    du.a("hollow")
                                       .executes(
                                          $$0x -> a((dt)$$0x.getSource(), dvc.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aha.a.c, null)
                                       )
                                 ))
                              .then(
                                 du.a("destroy")
                                    .executes($$0x -> a((dt)$$0x.getSource(), dvc.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aha.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, dvc $$1, ff $$2, aha.a $$3, @Nullable Predicate<dfp> $$4) throws CommandSyntaxException {
      int $$5 = $$1.c() * $$1.d() * $$1.e();
      int $$6 = $$0.e().X().c(cpt.x);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<gw> $$7 = Lists.newArrayList();
         aks $$8 = $$0.e();
         int $$9 = 0;

         for (gw $$10 : gw.b($$1.g(), $$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l())) {
            if ($$4 == null || $$4.test(new dfp($$8, $$10, true))) {
               ff $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dcx $$12 = $$8.c_($$10);
                  bgr.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (gw $$13 : $$7) {
            csx $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> tn.a("commands.fill.success", $$15), true);
            return $$9;
         }
      }
   }

   static enum a {
      a(($$0, $$1, $$2, $$3) -> $$2),
      b(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.g()
                  && $$1.u() != $$0.j()
                  && $$1.v() != $$0.h()
                  && $$1.v() != $$0.k()
                  && $$1.w() != $$0.i()
                  && $$1.w() != $$0.l()
               ? null
               : $$2
      ),
      c(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.g()
                  && $$1.u() != $$0.j()
                  && $$1.v() != $$0.h()
                  && $$1.v() != $$0.k()
                  && $$1.w() != $$0.i()
                  && $$1.w() != $$0.l()
               ? aha.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final ail.a e;

      private a(ail.a $$0) {
         this.e = $$0;
      }
   }
}
