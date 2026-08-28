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

public class apv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("commands.teleport.invalidPosition"));

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
                                                            new aoi.a(fj.a($$0x, "facingEntity"), fi.a.a)
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
                                                               new aoi.a(fj.a($$0x, "facingEntity"), fi.a($$0x, "facingAnchor"))
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
                                                new aoi.b(gz.a($$0x, "facingLocation"))
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

   private static int a(ew $$0, Collection<? extends bvb> $$1, bvb $$2) throws CommandSyntaxException {
      for (bvb $$3 : $$1) {
         a($$0, $$3, (arx)$$2.dW(), $$2.dB(), $$2.dD(), $$2.dH(), EnumSet.noneOf(bwl.class), $$2.dM(), $$2.dO(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.teleport.success.entity.single", $$1.iterator().next().p_(), $$2.p_()), true);
      } else {
         $$0.a(() -> xk.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.p_()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<? extends bvb> $$1, arx $$2, gu $$3, @Nullable gu $$4, @Nullable aoi $$5) throws CommandSyntaxException {
      fbr $$6 = $$3.a($$0);
      fbq $$7 = $$4 == null ? null : $$4.b($$0);

      for (bvb $$8 : $$1) {
         Set<bwl> $$9 = a($$3, $$4, $$8.dW().ai() == $$2.ai());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dM(), $$8.dO(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.teleport.success.location.single", $$1.iterator().next().p_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xk.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bwl> a(gu $$0, @Nullable gu $$1, boolean $$2) {
      Set<bwl> $$3 = EnumSet.noneOf(bwl.class);
      if ($$0.a()) {
         $$3.add(bwl.f);
         if ($$2) {
            $$3.add(bwl.a);
         }
      }

      if ($$0.b()) {
         $$3.add(bwl.g);
         if ($$2) {
            $$3.add(bwl.b);
         }
      }

      if ($$0.c()) {
         $$3.add(bwl.h);
         if ($$2) {
            $$3.add(bwl.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(bwl.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(bwl.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ew $$0, bvb $$1, arx $$2, double $$3, double $$4, double $$5, Set<bwl> $$6, float $$7, float $$8, @Nullable aoi $$9) throws CommandSyntaxException {
      jh $$10 = jh.a($$3, $$4, $$5);
      if (!dgz.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bwl.a) ? $$3 - $$1.dB() : $$3;
         double $$12 = $$6.contains(bwl.b) ? $$4 - $$1.dD() : $$4;
         double $$13 = $$6.contains(bwl.c) ? $$5 - $$1.dH() : $$5;
         float $$14 = $$6.contains(bwl.d) ? $$7 - $$1.dM() : $$7;
         float $$15 = $$6.contains(bwl.e) ? $$8 - $$1.dO() : $$8;
         float $$16 = azu.h($$14);
         float $$17 = azu.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bvx $$18) || !$$18.fJ()) {
               $$1.h($$1.dz().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bwf $$19) {
               $$19.L().o();
            }
         }
      }
   }
}
