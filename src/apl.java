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

public class apl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ei> $$0) {
      LiteralCommandNode<ei> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ej.a("location", gm.a())
                        .executes(
                           $$0x -> a(
                                 (ei)$$0x.getSource(),
                                 Collections.singleton(((ei)$$0x.getSource()).g()),
                                 ((ei)$$0x.getSource()).e(),
                                 gm.b($$0x, "location"),
                                 null,
                                 null
                              )
                        )
                  ))
               .then(
                  ej.a("destination", ev.a())
                     .executes($$0x -> a((ei)$$0x.getSource(), Collections.singleton(((ei)$$0x.getSource()).g()), ev.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ej.a("targets", ev.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("location", gm.a())
                                 .executes(
                                    $$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"), ((ei)$$0x.getSource()).e(), gm.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ej.a("rotation", gj.a())
                                    .executes(
                                       $$0x -> a(
                                             (ei)$$0x.getSource(),
                                             ev.b($$0x, "targets"),
                                             ((ei)$$0x.getSource()).e(),
                                             gm.b($$0x, "location"),
                                             gj.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ej.a("facing")
                                    .then(
                                       ej.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ej.a("facingEntity", ev.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ei)$$0x.getSource(),
                                                            ev.b($$0x, "targets"),
                                                            ((ei)$$0x.getSource()).e(),
                                                            gm.b($$0x, "location"),
                                                            null,
                                                            new any.a(ev.a($$0x, "facingEntity"), eu.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ej.a("facingAnchor", eu.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               ev.b($$0x, "targets"),
                                                               ((ei)$$0x.getSource()).e(),
                                                               gm.b($$0x, "location"),
                                                               null,
                                                               new any.a(ev.a($$0x, "facingEntity"), eu.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ej.a("facingLocation", gm.a())
                                       .executes(
                                          $$0x -> a(
                                                (ei)$$0x.getSource(),
                                                ev.b($$0x, "targets"),
                                                ((ei)$$0x.getSource()).e(),
                                                gm.b($$0x, "location"),
                                                null,
                                                new any.b(gm.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ej.a("destination", ev.a()).executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"), ev.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ei $$0, Collection<? extends bwa> $$1, bwa $$2) throws CommandSyntaxException {
      for (bwa $$3 : $$1) {
         a($$0, $$3, (aro)$$2.dV(), $$2.dA(), $$2.dC(), $$2.dG(), EnumSet.noneOf(bxn.class), $$2.dL(), $$2.dN(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.teleport.success.entity.single", $$1.iterator().next().m_(), $$2.m_()), true);
      } else {
         $$0.a(() -> ww.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.m_()), true);
      }

      return $$1.size();
   }

   private static int a(ei $$0, Collection<? extends bwa> $$1, aro $$2, gh $$3, @Nullable gh $$4, @Nullable any $$5) throws CommandSyntaxException {
      fdw $$6 = $$3.a($$0);
      fdv $$7 = $$4 == null ? null : $$4.b($$0);

      for (bwa $$8 : $$1) {
         Set<bxn> $$9 = a($$3, $$4, $$8.dV().aj() == $$2.aj());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dL(), $$8.dN(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.teleport.success.location.single", $$1.iterator().next().m_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> ww.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<bxn> a(gh $$0, @Nullable gh $$1, boolean $$2) {
      Set<bxn> $$3 = EnumSet.noneOf(bxn.class);
      if ($$0.a()) {
         $$3.add(bxn.f);
         if ($$2) {
            $$3.add(bxn.a);
         }
      }

      if ($$0.b()) {
         $$3.add(bxn.g);
         if ($$2) {
            $$3.add(bxn.b);
         }
      }

      if ($$0.c()) {
         $$3.add(bxn.h);
         if ($$2) {
            $$3.add(bxn.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(bxn.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(bxn.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ei $$0, bwa $$1, aro $$2, double $$3, double $$4, double $$5, Set<bxn> $$6, float $$7, float $$8, @Nullable any $$9) throws CommandSyntaxException {
      iu $$10 = iu.a($$3, $$4, $$5);
      if (!dip.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(bxn.a) ? $$3 - $$1.dA() : $$3;
         double $$12 = $$6.contains(bxn.b) ? $$4 - $$1.dC() : $$4;
         double $$13 = $$6.contains(bxn.c) ? $$5 - $$1.dG() : $$5;
         float $$14 = $$6.contains(bxn.d) ? $$7 - $$1.dL() : $$7;
         float $$15 = $$6.contains(bxn.e) ? $$8 - $$1.dN() : $$8;
         float $$16 = azk.h($$14);
         float $$17 = azk.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bwz $$18) || !$$18.fI()) {
               $$1.i($$1.dy().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bxh $$19) {
               $$19.O().m();
            }
         }
      }
   }
}
