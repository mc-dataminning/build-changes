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

public class apa {
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
                                                            new ann.a(fk.a($$0x, "facingEntity"), fj.a.a)
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
                                                               new ann.a(fk.a($$0x, "facingEntity"), fj.a($$0x, "facingAnchor"))
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
                                                new ann.b(ha.a($$0x, "facingLocation"))
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

   private static int a(ex $$0, Collection<? extends bva> $$1, bva $$2) throws CommandSyntaxException {
      for (bva $$3 : $$1) {
         a($$0, $$3, (ard)$$2.dU(), $$2.dz(), $$2.dB(), $$2.dF(), EnumSet.noneOf(bwm.class), $$2.dK(), $$2.dM(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.teleport.success.entity.single", $$1.iterator().next().m_(), $$2.m_()), true);
      } else {
         $$0.a(() -> wp.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.m_()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<? extends bva> $$1, ard $$2, gv $$3, @Nullable gv $$4, @Nullable ann $$5) throws CommandSyntaxException {
      fbx $$6 = $$3.a($$0);
      fbw $$7 = $$4 == null ? null : $$4.b($$0);

      for (bva $$8 : $$1) {
         Set<bwm> $$9 = a($$3, $$4, $$8.dU().aj() == $$2.aj());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dK(), $$8.dM(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.teleport.success.location.single", $$1.iterator().next().m_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> wp.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bwm> a(gv $$0, @Nullable gv $$1, boolean $$2) {
      Set<bwm> $$3 = EnumSet.noneOf(bwm.class);
      if ($$0.a()) {
         $$3.add(bwm.f);
         if ($$2) {
            $$3.add(bwm.a);
         }
      }

      if ($$0.b()) {
         $$3.add(bwm.g);
         if ($$2) {
            $$3.add(bwm.b);
         }
      }

      if ($$0.c()) {
         $$3.add(bwm.h);
         if ($$2) {
            $$3.add(bwm.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(bwm.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(bwm.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ex $$0, bva $$1, ard $$2, double $$3, double $$4, double $$5, Set<bwm> $$6, float $$7, float $$8, @Nullable ann $$9) throws CommandSyntaxException {
      ji $$10 = ji.a($$3, $$4, $$5);
      if (!dgz.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bwm.a) ? $$3 - $$1.dz() : $$3;
         double $$12 = $$6.contains(bwm.b) ? $$4 - $$1.dB() : $$4;
         double $$13 = $$6.contains(bwm.c) ? $$5 - $$1.dF() : $$5;
         float $$14 = $$6.contains(bwm.d) ? $$7 - $$1.dK() : $$7;
         float $$15 = $$6.contains(bwm.e) ? $$8 - $$1.dM() : $$8;
         float $$16 = ayz.h($$14);
         float $$17 = ayz.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bvy $$18) || !$$18.fL()) {
               $$1.i($$1.dx().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bwg $$19) {
               $$19.O().m();
            }
         }
      }
   }
}
