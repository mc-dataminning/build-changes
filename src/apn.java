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

public class apn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xj.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralCommandNode<ew> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ex.a("location", gz.a())
                        .executes(
                           $$0x -> a(
                                 (ew)$$0x.getSource(),
                                 Collections.singleton(((ew)$$0x.getSource()).g()),
                                 ((ew)$$0x.getSource()).e(),
                                 gz.b($$0x, "location"),
                                 null,
                                 null
                              )
                        )
                  ))
               .then(
                  ex.a("destination", fj.a())
                     .executes($$0x -> a((ew)$$0x.getSource(), Collections.singleton(((ew)$$0x.getSource()).g()), fj.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ex.a("targets", fj.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("location", gz.a())
                                 .executes(
                                    $$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"), ((ew)$$0x.getSource()).e(), gz.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ex.a("rotation", gw.a())
                                    .executes(
                                       $$0x -> a(
                                             (ew)$$0x.getSource(),
                                             fj.b($$0x, "targets"),
                                             ((ew)$$0x.getSource()).e(),
                                             gz.b($$0x, "location"),
                                             gw.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ex.a("facing")
                                    .then(
                                       ex.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ex.a("facingEntity", fj.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ew)$$0x.getSource(),
                                                            fj.b($$0x, "targets"),
                                                            ((ew)$$0x.getSource()).e(),
                                                            gz.b($$0x, "location"),
                                                            null,
                                                            new apn.b(fj.a($$0x, "facingEntity"), fi.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ex.a("facingAnchor", fi.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               fj.b($$0x, "targets"),
                                                               ((ew)$$0x.getSource()).e(),
                                                               gz.b($$0x, "location"),
                                                               null,
                                                               new apn.b(fj.a($$0x, "facingEntity"), fi.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ex.a("facingLocation", gz.a())
                                       .executes(
                                          $$0x -> a(
                                                (ew)$$0x.getSource(),
                                                fj.b($$0x, "targets"),
                                                ((ew)$$0x.getSource()).e(),
                                                gz.b($$0x, "location"),
                                                null,
                                                new apn.c(gz.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ex.a("destination", fj.a()).executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"), fj.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ew $$0, Collection<? extends bul> $$1, bul $$2) throws CommandSyntaxException {
      for (bul $$3 : $$1) {
         a($$0, $$3, (arp)$$2.dV(), $$2.dA(), $$2.dC(), $$2.dG(), EnumSet.noneOf(bvv.class), $$2.dL(), $$2.dN(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xj.a("commands.teleport.success.entity.single", $$1.iterator().next().o_(), $$2.o_()), true);
      } else {
         $$0.a(() -> xj.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.o_()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<? extends bul> $$1, arp $$2, gu $$3, @Nullable gu $$4, @Nullable apn.a $$5) throws CommandSyntaxException {
      ezy $$6 = $$3.a($$0);
      ezx $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bvv> $$8 = a($$3, $$4);

      for (bul $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$9.dL(), $$9.dN(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xj.a("commands.teleport.success.location.single", $$1.iterator().next().o_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xj.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bvv> a(gu $$0, @Nullable gu $$1) {
      Set<bvv> $$2 = EnumSet.noneOf(bvv.class);
      if ($$0.a()) {
         $$2.add(bvv.f);
         $$2.add(bvv.a);
      }

      if ($$0.b()) {
         $$2.add(bvv.g);
         $$2.add(bvv.b);
      }

      if ($$0.c()) {
         $$2.add(bvv.h);
         $$2.add(bvv.c);
      }

      if ($$1 == null) {
         $$2.add(bvv.e);
         $$2.add(bvv.d);
      } else {
         if ($$1.a()) {
            $$2.add(bvv.e);
         }

         if ($$1.b()) {
            $$2.add(bvv.d);
         }
      }

      return $$2;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ew $$0, bul $$1, arp $$2, double $$3, double $$4, double $$5, Set<bvv> $$6, float $$7, float $$8, @Nullable apn.a $$9) throws CommandSyntaxException {
      jh $$10 = jh.a($$3, $$4, $$5);
      if (!dfm.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bvv.a) ? $$3 - $$1.dA() : $$3;
         double $$12 = $$6.contains(bvv.b) ? $$4 - $$1.dC() : $$4;
         double $$13 = $$6.contains(bvv.c) ? $$5 - $$1.dG() : $$5;
         float $$14 = $$6.contains(bvv.d) ? $$7 - $$1.dL() : $$7;
         float $$15 = $$6.contains(bvv.e) ? $$8 - $$1.dN() : $$8;
         float $$16 = azm.h($$14);
         float $$17 = azm.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bvh $$18) || !$$18.fH()) {
               $$1.h($$1.dy().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bvp $$19) {
               $$19.L().o();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ew var1, bul var2);
   }

   static record b(bul a, fi.a b) implements apn.a {
      @Override
      public void perform(ew $$0, bul $$1) {
         if ($$1 instanceof arq $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(ezy a) implements apn.a {
      @Override
      public void perform(ew $$0, bul $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
