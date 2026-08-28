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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ej> $$0) {
      LiteralCommandNode<ej> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ek.a("location", gn.a())
                        .executes(
                           $$0x -> a(
                                 (ej)$$0x.getSource(),
                                 Collections.singleton(((ej)$$0x.getSource()).g()),
                                 ((ej)$$0x.getSource()).e(),
                                 gn.b($$0x, "location"),
                                 null,
                                 null
                              )
                        )
                  ))
               .then(
                  ek.a("destination", ew.a())
                     .executes($$0x -> a((ej)$$0x.getSource(), Collections.singleton(((ej)$$0x.getSource()).g()), ew.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ek.a("targets", ew.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("location", gn.a())
                                 .executes(
                                    $$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"), ((ej)$$0x.getSource()).e(), gn.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ek.a("rotation", gk.a())
                                    .executes(
                                       $$0x -> a(
                                             (ej)$$0x.getSource(),
                                             ew.b($$0x, "targets"),
                                             ((ej)$$0x.getSource()).e(),
                                             gn.b($$0x, "location"),
                                             gk.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ek.a("facing")
                                    .then(
                                       ek.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ek.a("facingEntity", ew.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ej)$$0x.getSource(),
                                                            ew.b($$0x, "targets"),
                                                            ((ej)$$0x.getSource()).e(),
                                                            gn.b($$0x, "location"),
                                                            null,
                                                            new aoa.a(ew.a($$0x, "facingEntity"), ev.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ek.a("facingAnchor", ev.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ej)$$0x.getSource(),
                                                               ew.b($$0x, "targets"),
                                                               ((ej)$$0x.getSource()).e(),
                                                               gn.b($$0x, "location"),
                                                               null,
                                                               new aoa.a(ew.a($$0x, "facingEntity"), ev.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ek.a("facingLocation", gn.a())
                                       .executes(
                                          $$0x -> a(
                                                (ej)$$0x.getSource(),
                                                ew.b($$0x, "targets"),
                                                ((ej)$$0x.getSource()).e(),
                                                gn.b($$0x, "location"),
                                                null,
                                                new aoa.b(gn.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ek.a("destination", ew.a()).executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"), ew.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ej $$0, Collection<? extends bwi> $$1, bwi $$2) throws CommandSyntaxException {
      for (bwi $$3 : $$1) {
         a($$0, $$3, (arq)$$2.dU(), $$2.dz(), $$2.dB(), $$2.dF(), EnumSet.noneOf(bxx.class), $$2.dK(), $$2.dM(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.teleport.success.entity.single", $$1.iterator().next().m_(), $$2.m_()), true);
      } else {
         $$0.a(() -> wy.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.m_()), true);
      }

      return $$1.size();
   }

   private static int a(ej $$0, Collection<? extends bwi> $$1, arq $$2, gi $$3, @Nullable gi $$4, @Nullable aoa $$5) throws CommandSyntaxException {
      fex $$6 = $$3.a($$0);
      few $$7 = $$4 == null ? null : $$4.b($$0);

      for (bwi $$8 : $$1) {
         Set<bxx> $$9 = a($$3, $$4, $$8.dU().aj() == $$2.aj());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dK(), $$8.dM(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.k, $$7.j, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.teleport.success.location.single", $$1.iterator().next().m_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> wy.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bxx> a(gi $$0, @Nullable gi $$1, boolean $$2) {
      Set<bxx> $$3 = EnumSet.noneOf(bxx.class);
      if ($$0.a()) {
         $$3.add(bxx.f);
         if ($$2) {
            $$3.add(bxx.a);
         }
      }

      if ($$0.b()) {
         $$3.add(bxx.g);
         if ($$2) {
            $$3.add(bxx.b);
         }
      }

      if ($$0.c()) {
         $$3.add(bxx.h);
         if ($$2) {
            $$3.add(bxx.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(bxx.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(bxx.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ej $$0, bwi $$1, arq $$2, double $$3, double $$4, double $$5, Set<bxx> $$6, float $$7, float $$8, @Nullable aoa $$9) throws CommandSyntaxException {
      iv $$10 = iv.a($$3, $$4, $$5);
      if (!djh.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bxx.a) ? $$3 - $$1.dz() : $$3;
         double $$12 = $$6.contains(bxx.b) ? $$4 - $$1.dB() : $$4;
         double $$13 = $$6.contains(bxx.c) ? $$5 - $$1.dF() : $$5;
         float $$14 = $$6.contains(bxx.d) ? $$7 - $$1.dK() : $$7;
         float $$15 = $$6.contains(bxx.e) ? $$8 - $$1.dM() : $$8;
         float $$16 = azm.h($$14);
         float $$17 = azm.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bxj $$18) || !$$18.fI()) {
               $$1.i($$1.dx().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bxr $$19) {
               $$19.O().m();
            }
         }
      }
   }
}
