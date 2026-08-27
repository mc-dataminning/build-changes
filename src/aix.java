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

public class aix {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tm.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralCommandNode<dt> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     du.a("location", fr.a())
                        .executes(
                           $$0x -> a(
                                 (dt)$$0x.getSource(),
                                 Collections.singleton(((dt)$$0x.getSource()).g()),
                                 ((dt)$$0x.getSource()).e(),
                                 fr.b($$0x, "location"),
                                 ft.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  du.a("destination", ee.a())
                     .executes($$0x -> a((dt)$$0x.getSource(), Collections.singleton(((dt)$$0x.getSource()).g()), ee.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)du.a("targets", ee.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("location", fr.a())
                                 .executes(
                                    $$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"), ((dt)$$0x.getSource()).e(), fr.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 du.a("rotation", fo.a())
                                    .executes(
                                       $$0x -> a(
                                             (dt)$$0x.getSource(),
                                             ee.b($$0x, "targets"),
                                             ((dt)$$0x.getSource()).e(),
                                             fr.b($$0x, "location"),
                                             fo.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)du.a("facing")
                                    .then(
                                       du.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)du.a("facingEntity", ee.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            ee.b($$0x, "targets"),
                                                            ((dt)$$0x.getSource()).e(),
                                                            fr.b($$0x, "location"),
                                                            null,
                                                            new aix.a(ee.a($$0x, "facingEntity"), ed.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   du.a("facingAnchor", ed.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               ee.b($$0x, "targets"),
                                                               ((dt)$$0x.getSource()).e(),
                                                               fr.b($$0x, "location"),
                                                               null,
                                                               new aix.a(ee.a($$0x, "facingEntity"), ed.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    du.a("facingLocation", fr.a())
                                       .executes(
                                          $$0x -> a(
                                                (dt)$$0x.getSource(),
                                                ee.b($$0x, "targets"),
                                                ((dt)$$0x.getSource()).e(),
                                                fr.b($$0x, "location"),
                                                null,
                                                new aix.a(fr.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(du.a("destination", ee.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"), ee.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(dt $$0, Collection<? extends biq> $$1, biq $$2) throws CommandSyntaxException {
      for (biq $$3 : $$1) {
         a($$0, $$3, (akr)$$2.dL(), $$2.dq(), $$2.ds(), $$2.dw(), EnumSet.noneOf(bju.class), $$2.dB(), $$2.dD(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tm.a("commands.teleport.success.entity.single", $$1.iterator().next().N_(), $$2.N_()), true);
      } else {
         $$0.a(() -> tm.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.N_()), true);
      }

      return $$1.size();
   }

   private static int a(dt $$0, Collection<? extends biq> $$1, akr $$2, fm $$3, @Nullable fm $$4, @Nullable aix.a $$5) throws CommandSyntaxException {
      ehn $$6 = $$3.a($$0);
      ehm $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bju> $$8 = EnumSet.noneOf(bju.class);
      if ($$3.a()) {
         $$8.add(bju.a);
      }

      if ($$3.b()) {
         $$8.add(bju.b);
      }

      if ($$3.c()) {
         $$8.add(bju.c);
      }

      if ($$4 == null) {
         $$8.add(bju.e);
         $$8.add(bju.d);
      } else {
         if ($$4.a()) {
            $$8.add(bju.e);
         }

         if ($$4.b()) {
            $$8.add(bju.d);
         }
      }

      for (biq $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dB(), $$9.dD(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tm.a("commands.teleport.success.location.single", $$1.iterator().next().N_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> tm.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(dt $$0, biq $$1, akr $$2, double $$3, double $$4, double $$5, Set<bju> $$6, float $$7, float $$8, @Nullable aix.a $$9) throws CommandSyntaxException {
      gw $$10 = gw.a($$3, $$4, $$5);
      if (!cpv.k($$10)) {
         throw a.create();
      } else {
         float $$11 = arx.g($$7);
         float $$12 = arx.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof bjg $$13) || !$$13.fv()) {
               $$1.f($$1.do().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bjp $$14) {
               $$14.L().n();
            }
         }
      }
   }

   static class a {
      private final ehn a;
      private final biq b;
      private final ed.a c;

      public a(biq $$0, ed.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(ehn $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(dt $$0, biq $$1) {
         if (this.b != null) {
            if ($$1 instanceof aks) {
               ((aks)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
