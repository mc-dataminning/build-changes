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

public class amo {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.fill.toobig", $$0, $$1));
   static final gh b = new gh(dfk.a.o(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.fill.failed"));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               er.a("from", gm.a())
                  .then(
                     er.a("to", gm.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a(
                                                "block", gj.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((eq)$$0x.getSource(), eip.a(gm.a($$0x, "from"), gm.a($$0x, "to")), gj.a($$0x, "block"), amo.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)er.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (eq)$$0x.getSource(),
                                                            eip.a(gm.a($$0x, "from"), gm.a($$0x, "to")),
                                                            gj.a($$0x, "block"),
                                                            amo.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   er.a("filter", gi.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               eip.a(gm.a($$0x, "from"), gm.a($$0x, "to")),
                                                               gj.a($$0x, "block"),
                                                               amo.a.a,
                                                               gi.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          er.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (eq)$$0x.getSource(),
                                                      eip.a(gm.a($$0x, "from"), gm.a($$0x, "to")),
                                                      gj.a($$0x, "block"),
                                                      amo.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       er.a("outline")
                                          .executes(
                                             $$0x -> a((eq)$$0x.getSource(), eip.a(gm.a($$0x, "from"), gm.a($$0x, "to")), gj.a($$0x, "block"), amo.a.b, null)
                                          )
                                    ))
                                 .then(
                                    er.a("hollow")
                                       .executes(
                                          $$0x -> a((eq)$$0x.getSource(), eip.a(gm.a($$0x, "from"), gm.a($$0x, "to")), gj.a($$0x, "block"), amo.a.c, null)
                                       )
                                 ))
                              .then(
                                 er.a("destroy")
                                    .executes($$0x -> a((eq)$$0x.getSource(), eip.a(gm.a($$0x, "from"), gm.a($$0x, "to")), gj.a($$0x, "block"), amo.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, eip $$1, gh $$2, amo.a $$3, @Nullable Predicate<dsp> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().ab().c(dcc.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<ja> $$7 = Lists.newArrayList();
         aqm $$8 = $$0.e();
         int $$9 = 0;

         for (ja $$10 : ja.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dsp($$8, $$10, true))) {
               gh $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dpq $$12 = $$8.c_($$10);
                  bpy.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (ja $$13 : $$7) {
            dfi $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> wu.a("commands.fill.success", $$15), true);
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
               ? amo.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final anz.a e;

      private a(final anz.a $$0) {
         this.e = $$0;
      }
   }
}
