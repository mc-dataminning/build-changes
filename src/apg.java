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

public class apg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     eu.a("location", gw.a())
                        .executes(
                           $$0x -> a(
                                 (et)$$0x.getSource(),
                                 Collections.singleton(((et)$$0x.getSource()).g()),
                                 ((et)$$0x.getSource()).e(),
                                 gw.b($$0x, "location"),
                                 gy.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  eu.a("destination", fg.a())
                     .executes($$0x -> a((et)$$0x.getSource(), Collections.singleton(((et)$$0x.getSource()).g()), fg.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)eu.a("targets", fg.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("location", gw.a())
                                 .executes(
                                    $$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"), ((et)$$0x.getSource()).e(), gw.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 eu.a("rotation", gt.a())
                                    .executes(
                                       $$0x -> a(
                                             (et)$$0x.getSource(),
                                             fg.b($$0x, "targets"),
                                             ((et)$$0x.getSource()).e(),
                                             gw.b($$0x, "location"),
                                             gt.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eu.a("facing")
                                    .then(
                                       eu.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)eu.a("facingEntity", fg.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(),
                                                            fg.b($$0x, "targets"),
                                                            ((et)$$0x.getSource()).e(),
                                                            gw.b($$0x, "location"),
                                                            null,
                                                            new apg.b(fg.a($$0x, "facingEntity"), ff.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   eu.a("facingAnchor", ff.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fg.b($$0x, "targets"),
                                                               ((et)$$0x.getSource()).e(),
                                                               gw.b($$0x, "location"),
                                                               null,
                                                               new apg.b(fg.a($$0x, "facingEntity"), ff.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    eu.a("facingLocation", gw.a())
                                       .executes(
                                          $$0x -> a(
                                                (et)$$0x.getSource(),
                                                fg.b($$0x, "targets"),
                                                ((et)$$0x.getSource()).e(),
                                                gw.b($$0x, "location"),
                                                null,
                                                new apg.c(gw.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(eu.a("destination", fg.a()).executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"), fg.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(et $$0, Collection<? extends bto> $$1, bto $$2) throws CommandSyntaxException {
      for (bto $$3 : $$1) {
         a($$0, $$3, (arh)$$2.dS(), $$2.dx(), $$2.dz(), $$2.dD(), EnumSet.noneOf(bux.class), $$2.dI(), $$2.dK(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.teleport.success.entity.single", $$1.iterator().next().Q_(), $$2.Q_()), true);
      } else {
         $$0.a(() -> xd.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.Q_()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<? extends bto> $$1, arh $$2, gr $$3, @Nullable gr $$4, @Nullable apg.a $$5) throws CommandSyntaxException {
      eys $$6 = $$3.a($$0);
      eyr $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bux> $$8 = EnumSet.noneOf(bux.class);
      if ($$3.a()) {
         $$8.add(bux.a);
      }

      if ($$3.b()) {
         $$8.add(bux.b);
      }

      if ($$3.c()) {
         $$8.add(bux.c);
      }

      if ($$4 == null) {
         $$8.add(bux.e);
         $$8.add(bux.d);
      } else {
         if ($$4.a()) {
            $$8.add(bux.e);
         }

         if ($$4.b()) {
            $$8.add(bux.d);
         }
      }

      for (bto $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$9.dI(), $$9.dK(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.teleport.success.location.single", $$1.iterator().next().Q_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xd.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(et $$0, bto $$1, arh $$2, double $$3, double $$4, double $$5, Set<bux> $$6, float $$7, float $$8, @Nullable apg.a $$9) throws CommandSyntaxException {
      je $$10 = je.a($$3, $$4, $$5);
      if (!deg.l($$10)) {
         throw a.create();
      } else {
         float $$11 = azd.g($$7);
         float $$12 = azd.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof buk $$13) || !$$13.fF()) {
               $$1.h($$1.dv().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bus $$14) {
               $$14.P().o();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(et var1, bto var2);
   }

   static record b(bto a, ff.a b) implements apg.a {
      @Override
      public void perform(et $$0, bto $$1) {
         if ($$1 instanceof ari $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(eys a) implements apg.a {
      @Override
      public void perform(et $$0, bto $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
