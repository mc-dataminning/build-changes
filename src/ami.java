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

public class ami {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.fill.toobig", $$0, $$1));
   static final fs b = new fs(dcx.a.n(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ed.a("from", fx.a())
                  .then(
                     ed.a("to", fx.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a(
                                                "block", fu.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ec)$$0x.getSource(), efy.a(fx.a($$0x, "from"), fx.a($$0x, "to")), fu.a($$0x, "block"), ami.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ed.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ec)$$0x.getSource(),
                                                            efy.a(fx.a($$0x, "from"), fx.a($$0x, "to")),
                                                            fu.a($$0x, "block"),
                                                            ami.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ed.a("filter", ft.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               efy.a(fx.a($$0x, "from"), fx.a($$0x, "to")),
                                                               fu.a($$0x, "block"),
                                                               ami.a.a,
                                                               ft.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ed.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ec)$$0x.getSource(),
                                                      efy.a(fx.a($$0x, "from"), fx.a($$0x, "to")),
                                                      fu.a($$0x, "block"),
                                                      ami.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ed.a("outline")
                                          .executes(
                                             $$0x -> a((ec)$$0x.getSource(), efy.a(fx.a($$0x, "from"), fx.a($$0x, "to")), fu.a($$0x, "block"), ami.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ed.a("hollow")
                                       .executes(
                                          $$0x -> a((ec)$$0x.getSource(), efy.a(fx.a($$0x, "from"), fx.a($$0x, "to")), fu.a($$0x, "block"), ami.a.c, null)
                                       )
                                 ))
                              .then(
                                 ed.a("destroy")
                                    .executes($$0x -> a((ec)$$0x.getSource(), efy.a(fx.a($$0x, "from"), fx.a($$0x, "to")), fu.a($$0x, "block"), ami.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ec $$0, efy $$1, fs $$2, ami.a $$3, @Nullable Predicate<dqc> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().aa().c(czq.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<im> $$7 = Lists.newArrayList();
         aqe $$8 = $$0.e();
         int $$9 = 0;

         for (im $$10 : im.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dqc($$8, $$10, true))) {
               fs $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dnd $$12 = $$8.c_($$10);
                  boh.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (im $$13 : $$7) {
            dcv $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> ws.a("commands.fill.success", $$15), true);
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
               ? ami.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final anu.a e;

      private a(anu.a $$0) {
         this.e = $$0;
      }
   }
}
