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

public class ann {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.fill.toobig", $$0, $$1));
   static final gm b = new gm(dia.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ew.a("from", gr.a())
                  .then(
                     ew.a("to", gr.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a(
                                                "block", go.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ev)$$0x.getSource(), elj.a(gr.a($$0x, "from"), gr.a($$0x, "to")), go.a($$0x, "block"), ann.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ew.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ev)$$0x.getSource(),
                                                            elj.a(gr.a($$0x, "from"), gr.a($$0x, "to")),
                                                            go.a($$0x, "block"),
                                                            ann.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ew.a("filter", gn.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               elj.a(gr.a($$0x, "from"), gr.a($$0x, "to")),
                                                               go.a($$0x, "block"),
                                                               ann.a.a,
                                                               gn.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ew.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ev)$$0x.getSource(),
                                                      elj.a(gr.a($$0x, "from"), gr.a($$0x, "to")),
                                                      go.a($$0x, "block"),
                                                      ann.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ew.a("outline")
                                          .executes(
                                             $$0x -> a((ev)$$0x.getSource(), elj.a(gr.a($$0x, "from"), gr.a($$0x, "to")), go.a($$0x, "block"), ann.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ew.a("hollow")
                                       .executes(
                                          $$0x -> a((ev)$$0x.getSource(), elj.a(gr.a($$0x, "from"), gr.a($$0x, "to")), go.a($$0x, "block"), ann.a.c, null)
                                       )
                                 ))
                              .then(
                                 ew.a("destroy")
                                    .executes($$0x -> a((ev)$$0x.getSource(), elj.a(gr.a($$0x, "from"), gr.a($$0x, "to")), go.a($$0x, "block"), ann.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ev $$0, elj $$1, gm $$2, ann.a $$3, @Nullable Predicate<dvh> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().ac().c(der.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<jg> $$7 = Lists.newArrayList();
         arm $$8 = $$0.e();
         int $$9 = 0;

         for (jg $$10 : jg.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dvh($$8, $$10, true))) {
               gm $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dsg $$12 = $$8.c_($$10);
                  brp.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.j());
                     $$9++;
                  }
               }
            }
         }

         for (jg $$13 : $$7) {
            dhy $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> xh.a("commands.fill.success", $$15), true);
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
               ? ann.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aoy.a e;

      private a(final aoy.a $$0) {
         this.e = $$0;
      }
   }
}
