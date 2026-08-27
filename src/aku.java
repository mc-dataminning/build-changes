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

public class aku {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("location", fr.a())
                        .executes(
                           $$0x -> a(
                                 (ds)$$0x.getSource(),
                                 Collections.singleton(((ds)$$0x.getSource()).g()),
                                 ((ds)$$0x.getSource()).e(),
                                 fr.b($$0x, "location"),
                                 ft.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dt.a("destination", ee.a())
                     .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).g()), ee.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ee.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("location", fr.a())
                                 .executes(
                                    $$0x -> a((ds)$$0x.getSource(), ee.b($$0x, "targets"), ((ds)$$0x.getSource()).e(), fr.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dt.a("rotation", fo.a())
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ee.b($$0x, "targets"),
                                             ((ds)$$0x.getSource()).e(),
                                             fr.b($$0x, "location"),
                                             fo.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("facing")
                                    .then(
                                       dt.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("facingEntity", ee.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            ee.b($$0x, "targets"),
                                                            ((ds)$$0x.getSource()).e(),
                                                            fr.b($$0x, "location"),
                                                            null,
                                                            new aku.a(ee.a($$0x, "facingEntity"), ed.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("facingAnchor", ed.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ee.b($$0x, "targets"),
                                                               ((ds)$$0x.getSource()).e(),
                                                               fr.b($$0x, "location"),
                                                               null,
                                                               new aku.a(ee.a($$0x, "facingEntity"), ed.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("facingLocation", fr.a())
                                       .executes(
                                          $$0x -> a(
                                                (ds)$$0x.getSource(),
                                                ee.b($$0x, "targets"),
                                                ((ds)$$0x.getSource()).e(),
                                                fr.b($$0x, "location"),
                                                null,
                                                new aku.a(fr.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(dt.a("destination", ee.a()).executes($$0x -> a((ds)$$0x.getSource(), ee.b($$0x, "targets"), ee.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ds $$0, Collection<? extends blf> $$1, blf $$2) throws CommandSyntaxException {
      for (blf $$3 : $$1) {
         a($$0, $$3, (amp)$$2.dM(), $$2.dr(), $$2.dt(), $$2.dx(), EnumSet.noneOf(bmj.class), $$2.dC(), $$2.dE(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.teleport.success.entity.single", $$1.iterator().next().Q_(), $$2.Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.Q_()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<? extends blf> $$1, amp $$2, fm $$3, @Nullable fm $$4, @Nullable aku.a $$5) throws CommandSyntaxException {
      elb $$6 = $$3.a($$0);
      ela $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bmj> $$8 = EnumSet.noneOf(bmj.class);
      if ($$3.a()) {
         $$8.add(bmj.a);
      }

      if ($$3.b()) {
         $$8.add(bmj.b);
      }

      if ($$3.c()) {
         $$8.add(bmj.c);
      }

      if ($$4 == null) {
         $$8.add(bmj.e);
         $$8.add(bmj.d);
      } else {
         if ($$4.a()) {
            $$8.add(bmj.e);
         }

         if ($$4.b()) {
            $$8.add(bmj.d);
         }
      }

      for (blf $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dC(), $$9.dE(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.teleport.success.location.single", $$1.iterator().next().Q_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> vb.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ds $$0, blf $$1, amp $$2, double $$3, double $$4, double $$5, Set<bmj> $$6, float $$7, float $$8, @Nullable aku.a $$9) throws CommandSyntaxException {
      hv $$10 = hv.a($$3, $$4, $$5);
      if (!csy.k($$10)) {
         throw a.create();
      } else {
         float $$11 = aty.g($$7);
         float $$12 = aty.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof blv $$13) || !$$13.fw()) {
               $$1.g($$1.dp().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bme $$14) {
               $$14.N().n();
            }
         }
      }
   }

   static class a {
      private final elb a;
      private final blf b;
      private final ed.a c;

      public a(blf $$0, ed.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(elb $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(ds $$0, blf $$1) {
         if (this.b != null) {
            if ($$1 instanceof amq) {
               ((amq)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
