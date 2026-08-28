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

public class ank {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ww.b("commands.fill.toobig", $$0, $$1));
   static final ga b = new ga(dlw.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ej.a("from", gf.a())
                  .then(
                     ej.a("to", gf.a())
                        .then(
                           a($$1, ej.a("block", gc.a($$1)), $$0x -> gf.a($$0x, "from"), $$0x -> gf.a($$0x, "to"), $$0x -> gc.a($$0x, "block"), $$0x -> null)
                              .then(
                                 ((LiteralArgumentBuilder)ej.a("replace")
                                       .executes(
                                          $$0x -> a(
                                                (ei)$$0x.getSource(), eqa.a(gf.a($$0x, "from"), gf.a($$0x, "to")), gc.a($$0x, "block"), ank.c.a, null, false
                                             )
                                       ))
                                    .then(
                                       a(
                                          $$1,
                                          ej.a("filter", gb.a($$1)),
                                          $$0x -> gf.a($$0x, "from"),
                                          $$0x -> gf.a($$0x, "to"),
                                          $$0x -> gc.a($$0x, "block"),
                                          $$0x -> gb.a($$0x, "filter")
                                       )
                                    )
                              )
                              .then(
                                 ej.a("keep")
                                    .executes(
                                       $$0x -> a(
                                             (ei)$$0x.getSource(),
                                             eqa.a(gf.a($$0x, "from"), gf.a($$0x, "to")),
                                             gc.a($$0x, "block"),
                                             ank.c.a,
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

   private static ArgumentBuilder<ei, ?> a(
      ee $$0,
      ArgumentBuilder<ei, ?> $$1,
      anr<CommandContext<ei>, iu> $$2,
      anr<CommandContext<ei>, iu> $$3,
      anr<CommandContext<ei>, ga> $$4,
      ank.d<CommandContext<ei>, Predicate<dzs>> $$5
   ) {
      return $$1.executes($$4x -> a((ei)$$4x.getSource(), eqa.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ank.c.a, $$5.apply($$4x), false))
         .then(
            ej.a("outline")
               .executes($$4x -> a((ei)$$4x.getSource(), eqa.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ank.c.b, $$5.apply($$4x), false))
         )
         .then(
            ej.a("hollow").executes($$4x -> a((ei)$$4x.getSource(), eqa.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ank.c.c, $$5.apply($$4x), false))
         )
         .then(
            ej.a("destroy")
               .executes($$4x -> a((ei)$$4x.getSource(), eqa.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ank.c.d, $$5.apply($$4x), false))
         )
         .then(
            ej.a("strict").executes($$4x -> a((ei)$$4x.getSource(), eqa.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ank.c.a, $$5.apply($$4x), true))
         );
   }

   private static int a(ei $$0, eqa $$1, ga $$2, ank.c $$3, @Nullable Predicate<dzs> $$4, boolean $$5) throws CommandSyntaxException {
      int $$6 = $$1.d() * $$1.e() * $$1.f();
      int $$7 = $$0.e().O().d(dil.A);
      if ($$6 > $$7) {
         throw a.create($$7, $$6);
      } else {
         List<iu> $$8 = Lists.newArrayList();
         aro $$9 = $$0.e();
         if ($$9.ak()) {
            throw c.create();
         } else {
            int $$10 = 0;

            for (iu $$11 : iu.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
               if ($$4 == null || $$4.test(new dzs($$9, $$11, true))) {
                  boolean $$12 = false;
                  if ($$3.f.affect($$9, $$11)) {
                     $$12 = true;
                  }

                  ga $$13 = $$3.e.filter($$1, $$11, $$2, $$9);
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

            for (iu $$14 : $$8) {
               dlu $$15 = $$9.a_($$14).b();
               $$9.a($$14, $$15);
            }

            if ($$10 == 0) {
               throw c.create();
            } else {
               int $$16 = $$10;
               $$0.a(() -> ww.a("commands.fill.success", $$16), true);
               return $$10;
            }
         }
      }
   }

   @FunctionalInterface
   public interface a {
      ank.a a = ($$0, $$1) -> false;

      boolean affect(aro var1, iu var2);
   }

   @FunctionalInterface
   public interface b {
      ank.b a = ($$0, $$1, $$2, $$3) -> $$2;

      @Nullable
      ga filter(eqa var1, iu var2, ga var3, aro var4);
   }

   static enum c {
      a(ank.a.a, ank.b.a),
      b(
         ank.a.a,
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
         ank.a.a,
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? ank.b
               : $$2
      ),
      d(($$0, $$1) -> $$0.b($$1, true), ank.b.a);

      public final ank.b e;
      public final ank.a f;

      private c(final ank.a $$0, final ank.b $$1) {
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
