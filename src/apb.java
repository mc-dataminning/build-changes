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

public class apb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralCommandNode<ex> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ey.a("location", ha.a())
                        .executes(
                           $$0x -> a(
                                 (ex)$$0x.getSource(),
                                 Collections.singleton(((ex)$$0x.getSource()).g()),
                                 ((ex)$$0x.getSource()).e(),
                                 ha.b($$0x, "location"),
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
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("location", ha.a())
                                 .executes(
                                    $$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), ((ex)$$0x.getSource()).e(), ha.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ey.a("rotation", gx.a())
                                    .executes(
                                       $$0x -> a(
                                             (ex)$$0x.getSource(),
                                             fk.b($$0x, "targets"),
                                             ((ex)$$0x.getSource()).e(),
                                             ha.b($$0x, "location"),
                                             gx.a($$0x, "rotation"),
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
                                                            ha.b($$0x, "location"),
                                                            null,
                                                            new ano.a(fk.a($$0x, "facingEntity"), fj.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("facingAnchor", fj.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               fk.b($$0x, "targets"),
                                                               ((ex)$$0x.getSource()).e(),
                                                               ha.b($$0x, "location"),
                                                               null,
                                                               new ano.a(fk.a($$0x, "facingEntity"), fj.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ey.a("facingLocation", ha.a())
                                       .executes(
                                          $$0x -> a(
                                                (ex)$$0x.getSource(),
                                                fk.b($$0x, "targets"),
                                                ((ex)$$0x.getSource()).e(),
                                                ha.b($$0x, "location"),
                                                null,
                                                new ano.b(ha.a($$0x, "facingLocation"))
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

   private static int a(ex $$0, Collection<? extends bul> $$1, bul $$2) throws CommandSyntaxException {
      for (bul $$3 : $$1) {
         a($$0, $$3, (ard)$$2.dV(), $$2.dA(), $$2.dC(), $$2.dG(), EnumSet.noneOf(bvv.class), $$2.dL(), $$2.dN(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.teleport.success.entity.single", $$1.iterator().next().p_(), $$2.p_()), true);
      } else {
         $$0.a(() -> wp.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.p_()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<? extends bul> $$1, ard $$2, gv $$3, @Nullable gv $$4, @Nullable ano $$5) throws CommandSyntaxException {
      fba $$6 = $$3.a($$0);
      faz $$7 = $$4 == null ? null : $$4.b($$0);

      for (bul $$8 : $$1) {
         Set<bvv> $$9 = a($$3, $$4, $$8.dV().ai() == $$2.ai());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dL(), $$8.dN(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.teleport.success.location.single", $$1.iterator().next().p_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> wp.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bvv> a(gv $$0, @Nullable gv $$1, boolean $$2) {
      Set<bvv> $$3 = EnumSet.noneOf(bvv.class);
      if ($$0.a()) {
         $$3.add(bvv.f);
         if ($$2) {
            $$3.add(bvv.a);
         }
      }

      if ($$0.b()) {
         $$3.add(bvv.g);
         if ($$2) {
            $$3.add(bvv.b);
         }
      }

      if ($$0.c()) {
         $$3.add(bvv.h);
         if ($$2) {
            $$3.add(bvv.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(bvv.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(bvv.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ex $$0, bul $$1, ard $$2, double $$3, double $$4, double $$5, Set<bvv> $$6, float $$7, float $$8, @Nullable ano $$9) throws CommandSyntaxException {
      ji $$10 = ji.a($$3, $$4, $$5);
      if (!dgi.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bvv.a) ? $$3 - $$1.dA() : $$3;
         double $$12 = $$6.contains(bvv.b) ? $$4 - $$1.dC() : $$4;
         double $$13 = $$6.contains(bvv.c) ? $$5 - $$1.dG() : $$5;
         float $$14 = $$6.contains(bvv.d) ? $$7 - $$1.dL() : $$7;
         float $$15 = $$6.contains(bvv.e) ? $$8 - $$1.dN() : $$8;
         float $$16 = ayz.h($$14);
         float $$17 = ayz.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bvh $$18) || !$$18.fJ()) {
               $$1.i($$1.dy().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bvp $$19) {
               $$19.P().m();
            }
         }
      }
   }
}
