import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anj {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("commands.fill.toobig", $$0, $$1));
   static final gp b = new gp(dkw.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wv.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("from", gu.a())
                  .then(
                     ey.a("to", gu.a())
                        .then(
                           a($$1, ey.a("block", gr.a($$1)), $$0x -> gu.a($$0x, "from"), $$0x -> gu.a($$0x, "to"), $$0x -> gr.a($$0x, "block"), $$0x -> null)
                              .then(
                                 ((LiteralArgumentBuilder)ey.a("replace")
                                       .executes(
                                          $$0x -> a(
                                                (ex)$$0x.getSource(), eoy.a(gu.a($$0x, "from"), gu.a($$0x, "to")), gr.a($$0x, "block"), anj.c.a, null, false
                                             )
                                       ))
                                    .then(
                                       a(
                                          $$1,
                                          ey.a("filter", gq.a($$1)),
                                          $$0x -> gu.a($$0x, "from"),
                                          $$0x -> gu.a($$0x, "to"),
                                          $$0x -> gr.a($$0x, "block"),
                                          $$0x -> gq.a($$0x, "filter")
                                       )
                                    )
                              )
                              .then(
                                 ey.a("keep")
                                    .executes(
                                       $$0x -> a(
                                             (ex)$$0x.getSource(),
                                             eoy.a(gu.a($$0x, "from"), gu.a($$0x, "to")),
                                             gr.a($$0x, "block"),
                                             anj.c.a,
                                             $$0xx -> $$0xx.c().u($$0xx.d()),
                                             false
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static ArgumentBuilder<ex, ?> a(
      et $$0,
      ArgumentBuilder<ex, ?> $$1,
      anq<CommandContext<ex>, jj> $$2,
      anq<CommandContext<ex>, jj> $$3,
      anq<CommandContext<ex>, gp> $$4,
      anj.d<CommandContext<ex>, Predicate<dyq>> $$5
   ) {
      return $$1.executes($$4x -> a((ex)$$4x.getSource(), eoy.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anj.c.a, $$5.apply($$4x), false))
         .then(
            ey.a("outline")
               .executes($$4x -> a((ex)$$4x.getSource(), eoy.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anj.c.b, $$5.apply($$4x), false))
         )
         .then(
            ey.a("hollow").executes($$4x -> a((ex)$$4x.getSource(), eoy.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anj.c.c, $$5.apply($$4x), false))
         )
         .then(
            ey.a("destroy")
               .executes($$4x -> a((ex)$$4x.getSource(), eoy.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anj.c.d, $$5.apply($$4x), false))
         )
         .then(
            ey.a("strict").executes($$4x -> a((ex)$$4x.getSource(), eoy.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anj.c.a, $$5.apply($$4x), true))
         );
   }

   private static int a(ex $$0, eoy $$1, gp $$2, anj.c $$3, @Nullable Predicate<dyq> $$4, boolean $$5) throws CommandSyntaxException {
      int $$6 = $$1.d() * $$1.e() * $$1.f();
      int $$7 = $$0.e().O().d(dhl.A);
      if ($$6 > $$7) {
         throw a.create($$7, $$6);
      } else {
         List<jj> $$8 = Lists.newArrayList();
         arn $$9 = $$0.e();
         if ($$9.ak()) {
            throw c.create();
         } else {
            int $$10 = 0;

            for (jj $$11 : jj.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
               if ($$4 == null || $$4.test(new dyq($$9, $$11, true))) {
                  boolean $$12 = false;
                  if ($$3.f.affect($$9, $$11)) {
                     $$12 = true;
                  }

                  gp $$13 = $$3.e.filter($$1, $$11, $$2, $$9);
                  if ($$13 == null) {
                     if ($$12) {
                        $$10++;
                     }
                  } else if (!$$13.a($$9, $$11, 2 | ($$5 ? 304 : 256))) {
                     if ($$12) {
                        $$10++;
                     }
                  } else {
                     if (!$$5) {
                        $$8.add($$11.j());
                     }

                     $$10++;
                  }
               }
            }

            for (jj $$14 : $$8) {
               dku $$15 = $$9.a_($$14).b();
               $$9.a($$14, $$15);
            }

            if ($$10 == 0) {
               throw c.create();
            } else {
               int $$16 = $$10;
               $$0.a(() -> wv.a("commands.fill.success", $$16), true);
               return $$10;
            }
         }
      }
   }

   @FunctionalInterface
   public interface a {
      anj.a a = ($$0, $$1) -> false;

      boolean affect(arn var1, jj var2);
   }

   @FunctionalInterface
   public interface b {
      anj.b a = ($$0, $$1, $$2, $$3) -> $$2;

      @Nullable
      gp filter(eoy var1, jj var2, gp var3, arn var4);
   }

   static enum c {
      a(anj.a.a, anj.b.a),
      b(
         anj.a.a,
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
         anj.a.a,
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? anj.b
               : $$2
      ),
      d(($$0, $$1) -> $$0.b($$1, true), anj.b.a);

      public final anj.b e;
      public final anj.a f;

      private c(final anj.a $$0, final anj.b $$1) {
         this.f = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   interface d<T, R> {
      @Nullable
      R apply(T var1) throws CommandSyntaxException;
   }
}
