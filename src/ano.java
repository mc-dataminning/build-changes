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

public class ano {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("commands.fill.toobig", $$0, $$1));
   static final gb b = new gb(dne.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ek.a("from", gg.a())
                  .then(
                     ek.a("to", gg.a())
                        .then(
                           a($$1, ek.a("block", gd.a($$1)), $$0x -> gg.a($$0x, "from"), $$0x -> gg.a($$0x, "to"), $$0x -> gd.a($$0x, "block"), $$0x -> null)
                              .then(
                                 ((LiteralArgumentBuilder)ek.a("replace")
                                       .executes(
                                          $$0x -> a(
                                                (ej)$$0x.getSource(), ert.a(gg.a($$0x, "from"), gg.a($$0x, "to")), gd.a($$0x, "block"), ano.c.a, null, false
                                             )
                                       ))
                                    .then(
                                       a(
                                          $$1,
                                          ek.a("filter", gc.a($$1)),
                                          $$0x -> gg.a($$0x, "from"),
                                          $$0x -> gg.a($$0x, "to"),
                                          $$0x -> gd.a($$0x, "block"),
                                          $$0x -> gc.a($$0x, "filter")
                                       )
                                    )
                              )
                              .then(
                                 ek.a("keep")
                                    .executes(
                                       $$0x -> a(
                                             (ej)$$0x.getSource(),
                                             ert.a(gg.a($$0x, "from"), gg.a($$0x, "to")),
                                             gd.a($$0x, "block"),
                                             ano.c.a,
                                             $$0xx -> $$0xx.c().v($$0xx.d()),
                                             false
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static ArgumentBuilder<ej, ?> a(
      ef $$0,
      ArgumentBuilder<ej, ?> $$1,
      anv<CommandContext<ej>, iv> $$2,
      anv<CommandContext<ej>, iv> $$3,
      anv<CommandContext<ej>, gb> $$4,
      ano.d<CommandContext<ej>, Predicate<ebi>> $$5
   ) {
      return $$1.executes($$4x -> a((ej)$$4x.getSource(), ert.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ano.c.a, $$5.apply($$4x), false))
         .then(
            ek.a("outline")
               .executes($$4x -> a((ej)$$4x.getSource(), ert.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ano.c.b, $$5.apply($$4x), false))
         )
         .then(
            ek.a("hollow").executes($$4x -> a((ej)$$4x.getSource(), ert.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ano.c.c, $$5.apply($$4x), false))
         )
         .then(
            ek.a("destroy")
               .executes($$4x -> a((ej)$$4x.getSource(), ert.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ano.c.d, $$5.apply($$4x), false))
         )
         .then(
            ek.a("strict").executes($$4x -> a((ej)$$4x.getSource(), ert.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ano.c.a, $$5.apply($$4x), true))
         );
   }

   private static int a(ej $$0, ert $$1, gb $$2, ano.c $$3, @Nullable Predicate<ebi> $$4, boolean $$5) throws CommandSyntaxException {
      int $$6 = $$1.d() * $$1.e() * $$1.f();
      int $$7 = $$0.e().O().d(djt.B);
      if ($$6 > $$7) {
         throw a.create($$7, $$6);
      } else {
         List<iv> $$8 = Lists.newArrayList();
         ars $$9 = $$0.e();
         if ($$9.ak()) {
            throw c.create();
         } else {
            int $$10 = 0;

            for (iv $$11 : iv.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
               if ($$4 == null || $$4.test(new ebi($$9, $$11, true))) {
                  boolean $$12 = false;
                  if ($$3.f.affect($$9, $$11)) {
                     $$12 = true;
                  }

                  gb $$13 = $$3.e.filter($$1, $$11, $$2, $$9);
                  if ($$13 == null) {
                     if ($$12) {
                        $$10++;
                     }
                  } else if (!$$13.a($$9, $$11, 2 | ($$5 ? 816 : 256))) {
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

            for (iv $$14 : $$8) {
               dnc $$15 = $$9.a_($$14).b();
               $$9.a($$14, $$15);
            }

            if ($$10 == 0) {
               throw c.create();
            } else {
               int $$16 = $$10;
               $$0.a(() -> xa.a("commands.fill.success", $$16), true);
               return $$10;
            }
         }
      }
   }

   @FunctionalInterface
   public interface a {
      ano.a a = ($$0, $$1) -> false;

      boolean affect(ars var1, iv var2);
   }

   @FunctionalInterface
   public interface b {
      ano.b a = ($$0, $$1, $$2, $$3) -> $$2;

      @Nullable
      gb filter(ert var1, iv var2, gb var3, ars var4);
   }

   static enum c {
      a(ano.a.a, ano.b.a),
      b(
         ano.a.a,
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
         ano.a.a,
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? ano.b
               : $$2
      ),
      d(($$0, $$1) -> $$0.b($$1, true), ano.b.a);

      public final ano.b e;
      public final ano.a f;

      private c(final ano.a $$0, final ano.b $$1) {
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
