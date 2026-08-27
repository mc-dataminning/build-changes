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

public class air {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<dr> $$0) {
      LiteralCommandNode<dr> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ds.a("location", fp.a())
                        .executes(
                           $$0x -> a(
                                 (dr)$$0x.getSource(),
                                 Collections.singleton(((dr)$$0x.getSource()).g()),
                                 ((dr)$$0x.getSource()).e(),
                                 fp.b($$0x, "location"),
                                 fr.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  ds.a("destination", ec.a())
                     .executes($$0x -> a((dr)$$0x.getSource(), Collections.singleton(((dr)$$0x.getSource()).g()), ec.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ds.a("targets", ec.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("location", fp.a())
                                 .executes(
                                    $$0x -> a((dr)$$0x.getSource(), ec.b($$0x, "targets"), ((dr)$$0x.getSource()).e(), fp.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ds.a("rotation", fm.a())
                                    .executes(
                                       $$0x -> a(
                                             (dr)$$0x.getSource(),
                                             ec.b($$0x, "targets"),
                                             ((dr)$$0x.getSource()).e(),
                                             fp.b($$0x, "location"),
                                             fm.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ds.a("facing")
                                    .then(
                                       ds.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ds.a("facingEntity", ec.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            ec.b($$0x, "targets"),
                                                            ((dr)$$0x.getSource()).e(),
                                                            fp.b($$0x, "location"),
                                                            null,
                                                            new air.a(ec.a($$0x, "facingEntity"), eb.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("facingAnchor", eb.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               ec.b($$0x, "targets"),
                                                               ((dr)$$0x.getSource()).e(),
                                                               fp.b($$0x, "location"),
                                                               null,
                                                               new air.a(ec.a($$0x, "facingEntity"), eb.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ds.a("facingLocation", fp.a())
                                       .executes(
                                          $$0x -> a(
                                                (dr)$$0x.getSource(),
                                                ec.b($$0x, "targets"),
                                                ((dr)$$0x.getSource()).e(),
                                                fp.b($$0x, "location"),
                                                null,
                                                new air.a(fp.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ds.a("destination", ec.a()).executes($$0x -> a((dr)$$0x.getSource(), ec.b($$0x, "targets"), ec.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(dr $$0, Collection<? extends bii> $$1, bii $$2) throws CommandSyntaxException {
      for (bii $$3 : $$1) {
         a($$0, $$3, (akk)$$2.dK(), $$2.dp(), $$2.dr(), $$2.dv(), EnumSet.noneOf(bjm.class), $$2.dA(), $$2.dC(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.teleport.success.entity.single", $$1.iterator().next().H_(), $$2.H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.H_()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<? extends bii> $$1, akk $$2, fk $$3, @Nullable fk $$4, @Nullable air.a $$5) throws CommandSyntaxException {
      ehd $$6 = $$3.a($$0);
      ehc $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bjm> $$8 = EnumSet.noneOf(bjm.class);
      if ($$3.a()) {
         $$8.add(bjm.a);
      }

      if ($$3.b()) {
         $$8.add(bjm.b);
      }

      if ($$3.c()) {
         $$8.add(bjm.c);
      }

      if ($$4 == null) {
         $$8.add(bjm.e);
         $$8.add(bjm.d);
      } else {
         if ($$4.a()) {
            $$8.add(bjm.e);
         }

         if ($$4.b()) {
            $$8.add(bjm.d);
         }
      }

      for (bii $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dA(), $$9.dC(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.teleport.success.location.single", $$1.iterator().next().H_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> tf.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(dr $$0, bii $$1, akk $$2, double $$3, double $$4, double $$5, Set<bjm> $$6, float $$7, float $$8, @Nullable air.a $$9) throws CommandSyntaxException {
      gu $$10 = gu.a($$3, $$4, $$5);
      if (!cpl.k($$10)) {
         throw a.create();
      } else {
         float $$11 = arp.g($$7);
         float $$12 = arp.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof biy $$13) || !$$13.fu()) {
               $$1.f($$1.dn().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bjh $$14) {
               $$14.H().n();
            }
         }
      }
   }

   static class a {
      private final ehd a;
      private final bii b;
      private final eb.a c;

      public a(bii $$0, eb.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(ehd $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(dr $$0, bii $$1) {
         if (this.b != null) {
            if ($$1 instanceof akl) {
               ((akl)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
