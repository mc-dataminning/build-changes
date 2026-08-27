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

public class anx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<dv> $$0) {
      LiteralCommandNode<dv> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dw.a("location", fx.a())
                        .executes(
                           $$0x -> a(
                                 (dv)$$0x.getSource(),
                                 Collections.singleton(((dv)$$0x.getSource()).g()),
                                 ((dv)$$0x.getSource()).e(),
                                 fx.b($$0x, "location"),
                                 fz.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dw.a("destination", ei.a())
                     .executes($$0x -> a((dv)$$0x.getSource(), Collections.singleton(((dv)$$0x.getSource()).g()), ei.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dw.a("targets", ei.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("location", fx.a())
                                 .executes(
                                    $$0x -> a((dv)$$0x.getSource(), ei.b($$0x, "targets"), ((dv)$$0x.getSource()).e(), fx.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dw.a("rotation", fu.a())
                                    .executes(
                                       $$0x -> a(
                                             (dv)$$0x.getSource(),
                                             ei.b($$0x, "targets"),
                                             ((dv)$$0x.getSource()).e(),
                                             fx.b($$0x, "location"),
                                             fu.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dw.a("facing")
                                    .then(
                                       dw.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)dw.a("facingEntity", ei.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dv)$$0x.getSource(),
                                                            ei.b($$0x, "targets"),
                                                            ((dv)$$0x.getSource()).e(),
                                                            fx.b($$0x, "location"),
                                                            null,
                                                            new anx.b(ei.a($$0x, "facingEntity"), eh.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dw.a("facingAnchor", eh.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dv)$$0x.getSource(),
                                                               ei.b($$0x, "targets"),
                                                               ((dv)$$0x.getSource()).e(),
                                                               fx.b($$0x, "location"),
                                                               null,
                                                               new anx.b(ei.a($$0x, "facingEntity"), eh.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dw.a("facingLocation", fx.a())
                                       .executes(
                                          $$0x -> a(
                                                (dv)$$0x.getSource(),
                                                ei.b($$0x, "targets"),
                                                ((dv)$$0x.getSource()).e(),
                                                fx.b($$0x, "location"),
                                                null,
                                                new anx.c(fx.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(dw.a("destination", ei.a()).executes($$0x -> a((dv)$$0x.getSource(), ei.b($$0x, "targets"), ei.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(dv $$0, Collection<? extends bqa> $$1, bqa $$2) throws CommandSyntaxException {
      for (bqa $$3 : $$1) {
         a($$0, $$3, (apu)$$2.dM(), $$2.dr(), $$2.dt(), $$2.dx(), EnumSet.noneOf(brg.class), $$2.dC(), $$2.dE(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(dv $$0, Collection<? extends bqa> $$1, apu $$2, fs $$3, @Nullable fs $$4, @Nullable anx.a $$5) throws CommandSyntaxException {
      esj $$6 = $$3.a($$0);
      esi $$7 = $$4 == null ? null : $$4.b($$0);
      Set<brg> $$8 = EnumSet.noneOf(brg.class);
      if ($$3.a()) {
         $$8.add(brg.a);
      }

      if ($$3.b()) {
         $$8.add(brg.b);
      }

      if ($$3.c()) {
         $$8.add(brg.c);
      }

      if ($$4 == null) {
         $$8.add(brg.e);
         $$8.add(brg.d);
      } else {
         if ($$4.a()) {
            $$8.add(brg.e);
         }

         if ($$4.b()) {
            $$8.add(brg.d);
         }
      }

      for (bqa $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dC(), $$9.dE(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.teleport.success.location.single", $$1.iterator().next().O_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> wi.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(dv $$0, bqa $$1, apu $$2, double $$3, double $$4, double $$5, Set<brg> $$6, float $$7, float $$8, @Nullable anx.a $$9) throws CommandSyntaxException {
      id $$10 = id.a($$3, $$4, $$5);
      if (!czg.l($$10)) {
         throw a.create();
      } else {
         float $$11 = axm.g($$7);
         float $$12 = axm.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bqt $$13) || !$$13.fB()) {
               $$1.g($$1.dp().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof brb $$14) {
               $$14.K().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(dv var1, bqa var2);
   }

   static record b(bqa a, eh.a b) implements anx.a {
      @Override
      public void perform(dv $$0, bqa $$1) {
         if ($$1 instanceof apv $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(esj a) implements anx.a {
      @Override
      public void perform(dv $$0, bqa $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
