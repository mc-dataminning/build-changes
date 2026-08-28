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

public class apk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralCommandNode<ex> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ey.a("location", hb.a())
                        .executes(
                           $$0x -> a(
                                 (ex)$$0x.getSource(),
                                 Collections.singleton(((ex)$$0x.getSource()).g()),
                                 ((ex)$$0x.getSource()).e(),
                                 hb.b($$0x, "location"),
                                 null,
                                 null
                              )
                        )
                  ))
               .then(
                  ey.a("destination", fk.a())
                     .executes($$0x -> a((ex)$$0x.getSource(), Collections.singleton(((ex)$$0x.getSource()).g()), fk.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ey.a("targets", fk.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("location", hb.a())
                                 .executes(
                                    $$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), ((ex)$$0x.getSource()).e(), hb.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ey.a("rotation", gy.a())
                                    .executes(
                                       $$0x -> a(
                                             (ex)$$0x.getSource(),
                                             fk.b($$0x, "targets"),
                                             ((ex)$$0x.getSource()).e(),
                                             hb.b($$0x, "location"),
                                             gy.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ey.a("facing")
                                    .then(
                                       ey.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ey.a("facingEntity", fk.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            fk.b($$0x, "targets"),
                                                            ((ex)$$0x.getSource()).e(),
                                                            hb.b($$0x, "location"),
                                                            null,
                                                            new anx.a(fk.a($$0x, "facingEntity"), fj.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("facingAnchor", fj.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               fk.b($$0x, "targets"),
                                                               ((ex)$$0x.getSource()).e(),
                                                               hb.b($$0x, "location"),
                                                               null,
                                                               new anx.a(fk.a($$0x, "facingEntity"), fj.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ey.a("facingLocation", hb.a())
                                       .executes(
                                          $$0x -> a(
                                                (ex)$$0x.getSource(),
                                                fk.b($$0x, "targets"),
                                                ((ex)$$0x.getSource()).e(),
                                                hb.b($$0x, "location"),
                                                null,
                                                new anx.b(hb.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ey.a("destination", fk.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), fk.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ex $$0, Collection<? extends bvs> $$1, bvs $$2) throws CommandSyntaxException {
      for (bvs $$3 : $$1) {
         a($$0, $$3, (arn)$$2.dV(), $$2.dA(), $$2.dC(), $$2.dG(), EnumSet.noneOf(bxf.class), $$2.dL(), $$2.dN(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.teleport.success.entity.single", $$1.iterator().next().m_(), $$2.m_()), true);
      } else {
         $$0.a(() -> wv.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.m_()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<? extends bvs> $$1, arn $$2, gw $$3, @Nullable gw $$4, @Nullable anx $$5) throws CommandSyntaxException {
      fcu $$6 = $$3.a($$0);
      fct $$7 = $$4 == null ? null : $$4.b($$0);

      for (bvs $$8 : $$1) {
         Set<bxf> $$9 = a($$3, $$4, $$8.dV().aj() == $$2.aj());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dL(), $$8.dN(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.teleport.success.location.single", $$1.iterator().next().m_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> wv.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bxf> a(gw $$0, @Nullable gw $$1, boolean $$2) {
      Set<bxf> $$3 = EnumSet.noneOf(bxf.class);
      if ($$0.a()) {
         $$3.add(bxf.f);
         if ($$2) {
            $$3.add(bxf.a);
         }
      }

      if ($$0.b()) {
         $$3.add(bxf.g);
         if ($$2) {
            $$3.add(bxf.b);
         }
      }

      if ($$0.c()) {
         $$3.add(bxf.h);
         if ($$2) {
            $$3.add(bxf.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(bxf.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(bxf.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ex $$0, bvs $$1, arn $$2, double $$3, double $$4, double $$5, Set<bxf> $$6, float $$7, float $$8, @Nullable anx $$9) throws CommandSyntaxException {
      jj $$10 = jj.a($$3, $$4, $$5);
      if (!dhp.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bxf.a) ? $$3 - $$1.dA() : $$3;
         double $$12 = $$6.contains(bxf.b) ? $$4 - $$1.dC() : $$4;
         double $$13 = $$6.contains(bxf.c) ? $$5 - $$1.dG() : $$5;
         float $$14 = $$6.contains(bxf.d) ? $$7 - $$1.dL() : $$7;
         float $$15 = $$6.contains(bxf.e) ? $$8 - $$1.dN() : $$8;
         float $$16 = azk.h($$14);
         float $$17 = azk.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bwr $$18) || !$$18.fI()) {
               $$1.i($$1.dy().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bwz $$19) {
               $$19.O().m();
            }
         }
      }
   }
}
