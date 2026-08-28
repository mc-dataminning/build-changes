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

public class ana {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.fill.toobig", $$0, $$1));
   static final go b = new go(dkg.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wp.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("from", gt.a())
                  .then(
                     ey.a("to", gt.a())
                        .then(
                           a($$1, ey.a("block", gq.a($$1)), $$0x -> gt.a($$0x, "from"), $$0x -> gt.a($$0x, "to"), $$0x -> gq.a($$0x, "block"), $$0x -> null)
                              .then(
                                 ((LiteralArgumentBuilder)ey.a("replace")
                                       .executes(
                                          $$0x -> a(
                                                (ex)$$0x.getSource(), eob.a(gt.a($$0x, "from"), gt.a($$0x, "to")), gq.a($$0x, "block"), ana.d.a, null, false
                                             )
                                       ))
                                    .then(
                                       a(
                                          $$1,
                                          ey.a("filter", gp.a($$1)),
                                          $$0x -> gt.a($$0x, "from"),
                                          $$0x -> gt.a($$0x, "to"),
                                          $$0x -> gq.a($$0x, "block"),
                                          $$0x -> gp.a($$0x, "filter")
                                       )
                                    )
                              )
                              .then(
                                 ey.a("keep")
                                    .executes(
                                       $$0x -> a(
                                             (ex)$$0x.getSource(),
                                             eob.a(gt.a($$0x, "from"), gt.a($$0x, "to")),
                                             gq.a($$0x, "block"),
                                             ana.d.a,
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
      ana.b<CommandContext<ex>, ji> $$2,
      ana.b<CommandContext<ex>, ji> $$3,
      ana.b<CommandContext<ex>, go> $$4,
      ana.e<CommandContext<ex>, Predicate<dxu>> $$5
   ) {
      return $$1.executes($$4x -> a((ex)$$4x.getSource(), eob.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ana.d.a, $$5.apply($$4x), false))
         .then(
            ey.a("outline")
               .executes($$4x -> a((ex)$$4x.getSource(), eob.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ana.d.b, $$5.apply($$4x), false))
         )
         .then(
            ey.a("hollow").executes($$4x -> a((ex)$$4x.getSource(), eob.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ana.d.c, $$5.apply($$4x), false))
         )
         .then(
            ey.a("destroy")
               .executes($$4x -> a((ex)$$4x.getSource(), eob.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ana.d.d, $$5.apply($$4x), false))
         )
         .then(
            ey.a("strict").executes($$4x -> a((ex)$$4x.getSource(), eob.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), ana.d.a, $$5.apply($$4x), true))
         );
   }

   private static int a(ex $$0, eob $$1, go $$2, ana.d $$3, @Nullable Predicate<dxu> $$4, boolean $$5) throws CommandSyntaxException {
      int $$6 = $$1.d() * $$1.e() * $$1.f();
      int $$7 = $$0.e().O().c(dgv.A);
      if ($$6 > $$7) {
         throw a.create($$7, $$6);
      } else {
         List<ji> $$8 = Lists.newArrayList();
         ard $$9 = $$0.e();
         if ($$9.ak()) {
            throw c.create();
         } else {
            int $$10 = 0;

            for (ji $$11 : ji.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
               if ($$4 == null || $$4.test(new dxu($$9, $$11, true))) {
                  boolean $$12 = false;
                  if ($$3.f.affect($$9, $$11)) {
                     $$12 = true;
                  }

                  go $$13 = $$3.e.filter($$1, $$11, $$2, $$9);
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

            for (ji $$14 : $$8) {
               dke $$15 = $$9.a_($$14).b();
               $$9.a($$14, $$15);
            }

            if ($$10 == 0) {
               throw c.create();
            } else {
               int $$16 = $$10;
               $$0.a(() -> wp.a("commands.fill.success", $$16), true);
               return $$10;
            }
         }
      }
   }

   @FunctionalInterface
   public interface a {
      ana.a a = ($$0, $$1) -> false;

      boolean affect(ard var1, ji var2);
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   public interface c {
      ana.c a = ($$0, $$1, $$2, $$3) -> $$2;

      @Nullable
      go filter(eob var1, ji var2, go var3, ard var4);
   }

   static enum d {
      a(ana.a.a, ana.c.a),
      b(
         ana.a.a,
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
         ana.a.a,
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? ana.b
               : $$2
      ),
      d(($$0, $$1) -> $$0.b($$1, true), ana.c.a);

      public final ana.c e;
      public final ana.a f;

      private d(final ana.a $$0, final ana.c $$1) {
         this.f = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   interface e<T, R> {
      @Nullable
      R apply(T var1) throws CommandSyntaxException;
   }
}
