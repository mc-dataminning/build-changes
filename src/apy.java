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

public class apy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     el.a("location", go.a())
                        .executes(
                           $$0x -> a(
                                 (ek)$$0x.getSource(),
                                 Collections.singleton(((ek)$$0x.getSource()).g()),
                                 ((ek)$$0x.getSource()).e(),
                                 go.b($$0x, "location"),
                                 null,
                                 null
                              )
                        )
                  ))
               .then(
                  el.a("destination", ex.a())
                     .executes($$0x -> a((ek)$$0x.getSource(), Collections.singleton(((ek)$$0x.getSource()).g()), ex.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ex.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("location", go.a())
                                 .executes(
                                    $$0x -> a((ek)$$0x.getSource(), ex.b($$0x, "targets"), ((ek)$$0x.getSource()).e(), go.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 el.a("rotation", gl.a())
                                    .executes(
                                       $$0x -> a(
                                             (ek)$$0x.getSource(),
                                             ex.b($$0x, "targets"),
                                             ((ek)$$0x.getSource()).e(),
                                             go.b($$0x, "location"),
                                             gl.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)el.a("facing")
                                    .then(
                                       el.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("facingEntity", ex.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            ex.b($$0x, "targets"),
                                                            ((ek)$$0x.getSource()).e(),
                                                            go.b($$0x, "location"),
                                                            null,
                                                            new aol.a(ex.a($$0x, "facingEntity"), ew.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   el.a("facingAnchor", ew.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               ex.b($$0x, "targets"),
                                                               ((ek)$$0x.getSource()).e(),
                                                               go.b($$0x, "location"),
                                                               null,
                                                               new aol.a(ex.a($$0x, "facingEntity"), ew.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    el.a("facingLocation", go.a())
                                       .executes(
                                          $$0x -> a(
                                                (ek)$$0x.getSource(),
                                                ex.b($$0x, "targets"),
                                                ((ek)$$0x.getSource()).e(),
                                                go.b($$0x, "location"),
                                                null,
                                                new aol.b(go.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(el.a("destination", ex.a()).executes($$0x -> a((ek)$$0x.getSource(), ex.b($$0x, "targets"), ex.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ek $$0, Collection<? extends bxe> $$1, bxe $$2) throws CommandSyntaxException {
      for (bxe $$3 : $$1) {
         a($$0, $$3, (asb)$$2.dV(), $$2.dA(), $$2.dC(), $$2.dG(), EnumSet.noneOf(byt.class), $$2.dL(), $$2.dN(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.teleport.success.entity.single", $$1.iterator().next().P_(), $$2.P_()), true);
      } else {
         $$0.a(() -> xg.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.P_()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<? extends bxe> $$1, asb $$2, gj $$3, @Nullable gj $$4, @Nullable aol $$5) throws CommandSyntaxException {
      fgc $$6 = $$3.a($$0);
      fgb $$7 = $$4 == null ? null : $$4.b($$0);

      for (bxe $$8 : $$1) {
         Set<byt> $$9 = a($$3, $$4, $$8.dV().aj() == $$2.aj());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dL(), $$8.dN(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.k, $$7.j, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.teleport.success.location.single", $$1.iterator().next().P_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xg.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<byt> a(gj $$0, @Nullable gj $$1, boolean $$2) {
      Set<byt> $$3 = EnumSet.noneOf(byt.class);
      if ($$0.a()) {
         $$3.add(byt.f);
         if ($$2) {
            $$3.add(byt.a);
         }
      }

      if ($$0.b()) {
         $$3.add(byt.g);
         if ($$2) {
            $$3.add(byt.b);
         }
      }

      if ($$0.c()) {
         $$3.add(byt.h);
         if ($$2) {
            $$3.add(byt.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(byt.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(byt.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ek $$0, bxe $$1, asb $$2, double $$3, double $$4, double $$5, Set<byt> $$6, float $$7, float $$8, @Nullable aol $$9) throws CommandSyntaxException {
      iw $$10 = iw.a($$3, $$4, $$5);
      if (!dkj.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(byt.a) ? $$3 - $$1.dA() : $$3;
         double $$12 = $$6.contains(byt.b) ? $$4 - $$1.dC() : $$4;
         double $$13 = $$6.contains(byt.c) ? $$5 - $$1.dG() : $$5;
         float $$14 = $$6.contains(byt.d) ? $$7 - $$1.dL() : $$7;
         float $$15 = $$6.contains(byt.e) ? $$8 - $$1.dN() : $$8;
         float $$16 = azz.h($$14);
         float $$17 = azz.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof byf $$18) || !$$18.fJ()) {
               $$1.i($$1.dy().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof byn $$19) {
               $$19.N().m();
            }
         }
      }
   }
}
