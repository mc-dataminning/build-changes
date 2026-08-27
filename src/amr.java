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

public class amr {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.fill.toobig", $$0, $$1));
   static final fv b = new fv(dec.a.n(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ef.a("from", ga.a())
                  .then(
                     ef.a("to", ga.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a(
                                                "block", fx.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ee)$$0x.getSource(), ehd.a(ga.a($$0x, "from"), ga.a($$0x, "to")), fx.a($$0x, "block"), amr.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ef.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ee)$$0x.getSource(),
                                                            ehd.a(ga.a($$0x, "from"), ga.a($$0x, "to")),
                                                            fx.a($$0x, "block"),
                                                            amr.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ef.a("filter", fw.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               ehd.a(ga.a($$0x, "from"), ga.a($$0x, "to")),
                                                               fx.a($$0x, "block"),
                                                               amr.a.a,
                                                               fw.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ef.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      ehd.a(ga.a($$0x, "from"), ga.a($$0x, "to")),
                                                      fx.a($$0x, "block"),
                                                      amr.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ef.a("outline")
                                          .executes(
                                             $$0x -> a((ee)$$0x.getSource(), ehd.a(ga.a($$0x, "from"), ga.a($$0x, "to")), fx.a($$0x, "block"), amr.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ef.a("hollow")
                                       .executes(
                                          $$0x -> a((ee)$$0x.getSource(), ehd.a(ga.a($$0x, "from"), ga.a($$0x, "to")), fx.a($$0x, "block"), amr.a.c, null)
                                       )
                                 ))
                              .then(
                                 ef.a("destroy")
                                    .executes($$0x -> a((ee)$$0x.getSource(), ehd.a(ga.a($$0x, "from"), ga.a($$0x, "to")), fx.a($$0x, "block"), amr.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, ehd $$1, fv $$2, amr.a $$3, @Nullable Predicate<drh> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().aa().c(dav.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<io> $$7 = Lists.newArrayList();
         aqn $$8 = $$0.e();
         int $$9 = 0;

         for (io $$10 : io.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new drh($$8, $$10, true))) {
               fv $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  doi $$12 = $$8.c_($$10);
                  bpn.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (io $$13 : $$7) {
            dea $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> wx.a("commands.fill.success", $$15), true);
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
               ? amr.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aod.a e;

      private a(aod.a $$0) {
         this.e = $$0;
      }
   }
}
