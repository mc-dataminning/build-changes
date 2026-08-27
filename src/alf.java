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

public class alf {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vs.b("commands.fill.toobig", $$0, $$1));
   static final fj b = new fj(czh.a.o(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vs.c("commands.fill.failed"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("from", fo.a())
                  .then(
                     dv.a("to", fo.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                "block", fl.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((du)$$0x.getSource(), eby.a(fo.a($$0x, "from"), fo.a($$0x, "to")), fl.a($$0x, "block"), alf.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dv.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            eby.a(fo.a($$0x, "from"), fo.a($$0x, "to")),
                                                            fl.a($$0x, "block"),
                                                            alf.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("filter", fk.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eby.a(fo.a($$0x, "from"), fo.a($$0x, "to")),
                                                               fl.a($$0x, "block"),
                                                               alf.a.a,
                                                               fk.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          dv.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eby.a(fo.a($$0x, "from"), fo.a($$0x, "to")),
                                                      fl.a($$0x, "block"),
                                                      alf.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       dv.a("outline")
                                          .executes(
                                             $$0x -> a((du)$$0x.getSource(), eby.a(fo.a($$0x, "from"), fo.a($$0x, "to")), fl.a($$0x, "block"), alf.a.b, null)
                                          )
                                    ))
                                 .then(
                                    dv.a("hollow")
                                       .executes(
                                          $$0x -> a((du)$$0x.getSource(), eby.a(fo.a($$0x, "from"), fo.a($$0x, "to")), fl.a($$0x, "block"), alf.a.c, null)
                                       )
                                 ))
                              .then(
                                 dv.a("destroy")
                                    .executes($$0x -> a((du)$$0x.getSource(), eby.a(fo.a($$0x, "from"), fo.a($$0x, "to")), fl.a($$0x, "block"), alf.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, eby $$1, fj $$2, alf.a $$3, @Nullable Predicate<dmi> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().Z().c(cwa.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<ib> $$7 = Lists.newArrayList();
         apa $$8 = $$0.e();
         int $$9 = 0;

         for (ib $$10 : ib.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dmi($$8, $$10, true))) {
               fj $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  djl $$12 = $$8.c_($$10);
                  bmc.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (ib $$13 : $$7) {
            czf $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> vs.a("commands.fill.success", $$15), true);
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
               ? alf.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final amr.a e;

      private a(amr.a $$0) {
         this.e = $$0;
      }
   }
}
