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

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.teleport.invalidPosition"));

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
                                                            new aou.b(fg.a($$0x, "facingEntity"), ff.a.a)
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
                                                               new aou.b(fg.a($$0x, "facingEntity"), ff.a($$0x, "facingAnchor"))
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
                                                new aou.c(gw.a($$0x, "facingLocation"))
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

   private static int a(et $$0, Collection<? extends bsr> $$1, bsr $$2) throws CommandSyntaxException {
      for (bsr $$3 : $$1) {
         a($$0, $$3, (aqu)$$2.dO(), $$2.dt(), $$2.dv(), $$2.dz(), EnumSet.noneOf(buc.class), $$2.dE(), $$2.dG(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.teleport.success.entity.single", $$1.iterator().next().S_(), $$2.S_()), true);
      } else {
         $$0.a(() -> wz.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.S_()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<? extends bsr> $$1, aqu $$2, gr $$3, @Nullable gr $$4, @Nullable aou.a $$5) throws CommandSyntaxException {
      exc $$6 = $$3.a($$0);
      exb $$7 = $$4 == null ? null : $$4.b($$0);
      Set<buc> $$8 = EnumSet.noneOf(buc.class);
      if ($$3.a()) {
         $$8.add(buc.a);
      }

      if ($$3.b()) {
         $$8.add(buc.b);
      }

      if ($$3.c()) {
         $$8.add(buc.c);
      }

      if ($$4 == null) {
         $$8.add(buc.e);
         $$8.add(buc.d);
      } else {
         if ($$4.a()) {
            $$8.add(buc.e);
         }

         if ($$4.b()) {
            $$8.add(buc.d);
         }
      }

      for (bsr $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dE(), $$9.dG(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.teleport.success.location.single", $$1.iterator().next().S_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> wz.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(et $$0, bsr $$1, aqu $$2, double $$3, double $$4, double $$5, Set<buc> $$6, float $$7, float $$8, @Nullable aou.a $$9) throws CommandSyntaxException {
      jd $$10 = jd.a($$3, $$4, $$5);
      if (!dcw.l($$10)) {
         throw a.create();
      } else {
         float $$11 = ayo.g($$7);
         float $$12 = ayo.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof btn $$13) || !$$13.fA()) {
               $$1.i($$1.dr().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof btw $$14) {
               $$14.N().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(et var1, bsr var2);
   }

   static record b(bsr a, ff.a b) implements aou.a {
      @Override
      public void perform(et $$0, bsr $$1) {
         if ($$1 instanceof aqv $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(exc a) implements aou.a {
      @Override
      public void perform(et $$0, bsr $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
