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

public class app {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.teleport.invalidPosition"));

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
                                                            new app.b(fj.a($$0x, "facingEntity"), fi.a.a)
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
                                                               new app.b(fj.a($$0x, "facingEntity"), fi.a($$0x, "facingAnchor"))
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
                                                new app.c(gz.a($$0x, "facingLocation"))
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

   private static int a(ew $$0, Collection<? extends bui> $$1, bui $$2) throws CommandSyntaxException {
      for (bui $$3 : $$1) {
         a($$0, $$3, (arq)$$2.dY(), $$2.dD(), $$2.dF(), $$2.dJ(), EnumSet.noneOf(bvs.class), $$2.dO(), $$2.dQ(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.teleport.success.entity.single", $$1.iterator().next().S_(), $$2.S_()), true);
      } else {
         $$0.a(() -> xl.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.S_()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<? extends bui> $$1, arq $$2, gu $$3, @Nullable gu $$4, @Nullable app.a $$5) throws CommandSyntaxException {
      ezr $$6 = $$3.a($$0);
      ezq $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bvs> $$8 = a($$3, $$4);

      for (bui $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$9.dO(), $$9.dQ(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.teleport.success.location.single", $$1.iterator().next().S_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xl.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bvs> a(gu $$0, @Nullable gu $$1) {
      Set<bvs> $$2 = EnumSet.noneOf(bvs.class);
      if ($$0.a()) {
         $$2.add(bvs.f);
         $$2.add(bvs.a);
      }

      if ($$0.b()) {
         $$2.add(bvs.g);
         $$2.add(bvs.b);
      }

      if ($$0.c()) {
         $$2.add(bvs.h);
         $$2.add(bvs.c);
      }

      if ($$1 == null) {
         $$2.add(bvs.e);
         $$2.add(bvs.d);
      } else {
         if ($$1.a()) {
            $$2.add(bvs.e);
         }

         if ($$1.b()) {
            $$2.add(bvs.d);
         }
      }

      return $$2;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ew $$0, bui $$1, arq $$2, double $$3, double $$4, double $$5, Set<bvs> $$6, float $$7, float $$8, @Nullable app.a $$9) throws CommandSyntaxException {
      jh $$10 = jh.a($$3, $$4, $$5);
      if (!dff.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bvs.a) ? $$3 - $$1.dD() : $$3;
         double $$12 = $$6.contains(bvs.b) ? $$4 - $$1.dF() : $$4;
         double $$13 = $$6.contains(bvs.c) ? $$5 - $$1.dJ() : $$5;
         float $$14 = $$6.contains(bvs.d) ? $$7 - $$1.dO() : $$7;
         float $$15 = $$6.contains(bvs.e) ? $$8 - $$1.dQ() : $$8;
         float $$16 = azn.h($$14);
         float $$17 = azn.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bve $$18) || !$$18.fM()) {
               $$1.h($$1.dB().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bvm $$19) {
               $$19.P().o();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ew var1, bui var2);
   }

   static record b(bui a, fi.a b) implements app.a {
      @Override
      public void perform(ew $$0, bui $$1) {
         if ($$1 instanceof arr $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(ezr a) implements app.a {
      @Override
      public void perform(ew $$0, bui $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
