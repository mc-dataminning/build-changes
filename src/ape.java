import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public class ape {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralCommandNode<ep> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     eq.a("location", gs.a())
                        .executes(
                           $$0x -> a(
                                 (ep)$$0x.getSource(),
                                 Collections.singleton(((ep)$$0x.getSource()).g()),
                                 ((ep)$$0x.getSource()).e(),
                                 gs.b($$0x, "location"),
                                 gu.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  eq.a("destination", fc.a())
                     .executes($$0x -> a((ep)$$0x.getSource(), Collections.singleton(((ep)$$0x.getSource()).g()), fc.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)eq.a("targets", fc.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("location", gs.a())
                                 .executes(
                                    $$0x -> a((ep)$$0x.getSource(), fc.b($$0x, "targets"), ((ep)$$0x.getSource()).e(), gs.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 eq.a("rotation", gp.a())
                                    .executes(
                                       $$0x -> a(
                                             (ep)$$0x.getSource(),
                                             fc.b($$0x, "targets"),
                                             ((ep)$$0x.getSource()).e(),
                                             gs.b($$0x, "location"),
                                             gp.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eq.a("facing")
                                    .then(
                                       eq.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)eq.a("facingEntity", fc.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ep)$$0x.getSource(),
                                                            fc.b($$0x, "targets"),
                                                            ((ep)$$0x.getSource()).e(),
                                                            gs.b($$0x, "location"),
                                                            null,
                                                            new ape.b(fc.a($$0x, "facingEntity"), fb.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   eq.a("facingAnchor", fb.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               fc.b($$0x, "targets"),
                                                               ((ep)$$0x.getSource()).e(),
                                                               gs.b($$0x, "location"),
                                                               null,
                                                               new ape.b(fc.a($$0x, "facingEntity"), fb.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    eq.a("facingLocation", gs.a())
                                       .executes(
                                          $$0x -> a(
                                                (ep)$$0x.getSource(),
                                                fc.b($$0x, "targets"),
                                                ((ep)$$0x.getSource()).e(),
                                                gs.b($$0x, "location"),
                                                null,
                                                new ape.c(gs.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(eq.a("destination", fc.a()).executes($$0x -> a((ep)$$0x.getSource(), fc.b($$0x, "targets"), fc.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ep $$0, Collection<? extends bsp> $$1, bsp $$2) throws CommandSyntaxException {
      for (bsp $$3 : $$1) {
         a($$0, $$3, (arb)$$2.dP(), $$2.du(), $$2.dw(), $$2.dA(), EnumSet.noneOf(bty.class), $$2.dF(), $$2.dH(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> xl.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<? extends bsp> $$1, arb $$2, gn $$3, @Nullable gn $$4, @Nullable ape.a $$5) throws CommandSyntaxException {
      evm $$6 = $$3.a($$0);
      evl $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bty> $$8 = EnumSet.noneOf(bty.class);
      if ($$3.a()) {
         $$8.add(bty.a);
      }

      if ($$3.b()) {
         $$8.add(bty.b);
      }

      if ($$3.c()) {
         $$8.add(bty.c);
      }

      if ($$4 == null) {
         $$8.add(bty.e);
         $$8.add(bty.d);
      } else {
         if ($$4.a()) {
            $$8.add(bty.e);
         }

         if ($$4.b()) {
            $$8.add(bty.d);
         }
      }

      for (bsp $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dF(), $$9.dH(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.teleport.success.location.single", $$1.iterator().next().O_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> xl.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ep $$0, bsp $$1, arb $$2, double $$3, double $$4, double $$5, Set<bty> $$6, float $$7, float $$8, @Nullable ape.a $$9) throws CommandSyntaxException {
      iz $$10 = iz.a($$3, $$4, $$5);
      if (!dbt.l($$10)) {
         throw a.create();
      } else {
         float $$11 = ayu.g($$7);
         float $$12 = ayu.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof btk $$13) || !$$13.fE()) {
               $$1.h($$1.ds().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof btt $$14) {
               $$14.K().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ep var1, bsp var2);
   }

   static record b(bsp a, fb.a b) implements ape.a {
      @Override
      public void perform(ep $$0, bsp $$1) {
         if ($$1 instanceof arc $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(evm a) implements ape.a {
      @Override
      public void perform(ep $$0, bsp $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
