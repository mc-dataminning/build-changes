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

public class aqf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.teleport.invalidPosition"));

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
                                                            new aos.a(fj.a($$0x, "facingEntity"), fi.a.a)
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
                                                               new aos.a(fj.a($$0x, "facingEntity"), fi.a($$0x, "facingAnchor"))
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
                                                new aos.b(gz.a($$0x, "facingLocation"))
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

   private static int a(ew $$0, Collection<? extends bvf> $$1, bvf $$2) throws CommandSyntaxException {
      for (bvf $$3 : $$1) {
         a($$0, $$3, (ash)$$2.dV(), $$2.dA(), $$2.dC(), $$2.dG(), EnumSet.noneOf(bwp.class), $$2.dL(), $$2.dN(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.teleport.success.entity.single", $$1.iterator().next().p_(), $$2.p_()), true);
      } else {
         $$0.a(() -> xv.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.p_()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<? extends bvf> $$1, ash $$2, gu $$3, @Nullable gu $$4, @Nullable aos $$5) throws CommandSyntaxException {
      fbs $$6 = $$3.a($$0);
      fbr $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bwp> $$8 = a($$3, $$4);

      for (bvf $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$9.dL(), $$9.dN(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.teleport.success.location.single", $$1.iterator().next().p_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xv.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bwp> a(gu $$0, @Nullable gu $$1) {
      Set<bwp> $$2 = EnumSet.noneOf(bwp.class);
      if ($$0.a()) {
         $$2.add(bwp.f);
         $$2.add(bwp.a);
      }

      if ($$0.b()) {
         $$2.add(bwp.g);
         $$2.add(bwp.b);
      }

      if ($$0.c()) {
         $$2.add(bwp.h);
         $$2.add(bwp.c);
      }

      if ($$1 == null) {
         $$2.add(bwp.e);
         $$2.add(bwp.d);
      } else {
         if ($$1.a()) {
            $$2.add(bwp.e);
         }

         if ($$1.b()) {
            $$2.add(bwp.d);
         }
      }

      return $$2;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ew $$0, bvf $$1, ash $$2, double $$3, double $$4, double $$5, Set<bwp> $$6, float $$7, float $$8, @Nullable aos $$9) throws CommandSyntaxException {
      jh $$10 = jh.a($$3, $$4, $$5);
      if (!dha.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bwp.a) ? $$3 - $$1.dA() : $$3;
         double $$12 = $$6.contains(bwp.b) ? $$4 - $$1.dC() : $$4;
         double $$13 = $$6.contains(bwp.c) ? $$5 - $$1.dG() : $$5;
         float $$14 = $$6.contains(bwp.d) ? $$7 - $$1.dL() : $$7;
         float $$15 = $$6.contains(bwp.e) ? $$8 - $$1.dN() : $$8;
         float $$16 = bae.h($$14);
         float $$17 = bae.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bwb $$18) || !$$18.fH()) {
               $$1.h($$1.dy().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bwj $$19) {
               $$19.L().o();
            }
         }
      }
   }
}
