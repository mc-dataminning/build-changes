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

public class apm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("commands.teleport.invalidPosition"));

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
                                 hb.d(),
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
                                                            new apm.b(fj.a($$0x, "facingEntity"), fi.a.a)
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
                                                               new apm.b(fj.a($$0x, "facingEntity"), fi.a($$0x, "facingAnchor"))
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
                                                new apm.c(gz.a($$0x, "facingLocation"))
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

   private static int a(ew $$0, Collection<? extends bue> $$1, bue $$2) throws CommandSyntaxException {
      for (bue $$3 : $$1) {
         a($$0, $$3, (arn)$$2.dX(), $$2.dC(), $$2.dE(), $$2.dI(), EnumSet.noneOf(bvo.class), $$2.dN(), $$2.dP(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.teleport.success.entity.single", $$1.iterator().next().S_(), $$2.S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.S_()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<? extends bue> $$1, arn $$2, gu $$3, @Nullable gu $$4, @Nullable apm.a $$5) throws CommandSyntaxException {
      ezn $$6 = $$3.a($$0);
      ezm $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bvo> $$8 = EnumSet.noneOf(bvo.class);
      if ($$3.a()) {
         $$8.add(bvo.f);
      }

      if ($$3.b()) {
         $$8.add(bvo.g);
      }

      if ($$3.c()) {
         $$8.add(bvo.h);
      }

      if ($$4 == null) {
         $$8.add(bvo.e);
         $$8.add(bvo.d);
      } else {
         if ($$4.a()) {
            $$8.add(bvo.e);
         }

         if ($$4.b()) {
            $$8.add(bvo.d);
         }
      }

      for (bue $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$9.dN(), $$9.dP(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.teleport.success.location.single", $$1.iterator().next().S_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xi.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ew $$0, bue $$1, arn $$2, double $$3, double $$4, double $$5, Set<bvo> $$6, float $$7, float $$8, @Nullable apm.a $$9) throws CommandSyntaxException {
      jh $$10 = jh.a($$3, $$4, $$5);
      if (!dfb.l($$10)) {
         throw a.create();
      } else {
         float $$11 = $$6.contains(bvo.d) ? $$7 - $$1.dN() : $$7;
         float $$12 = $$6.contains(bvo.e) ? $$8 - $$1.dP() : $$8;
         float $$13 = azk.h($$11);
         float $$14 = azk.h($$12);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$13, $$14, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bva $$15) || !$$15.fL()) {
               $$1.h($$1.dA().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bvi $$16) {
               $$16.P().o();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ew var1, bue var2);
   }

   static record b(bue a, fi.a b) implements apm.a {
      @Override
      public void perform(ew $$0, bue $$1) {
         if ($$1 instanceof aro $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(ezn a) implements apm.a {
      @Override
      public void perform(ew $$0, bue $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
