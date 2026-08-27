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

public class aok {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ed> $$0) {
      LiteralCommandNode<ed> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ee.a("location", gg.a())
                        .executes(
                           $$0x -> a(
                                 (ed)$$0x.getSource(),
                                 Collections.singleton(((ed)$$0x.getSource()).g()),
                                 ((ed)$$0x.getSource()).e(),
                                 gg.b($$0x, "location"),
                                 gi.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  ee.a("destination", eq.a())
                     .executes($$0x -> a((ed)$$0x.getSource(), Collections.singleton(((ed)$$0x.getSource()).g()), eq.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ee.a("targets", eq.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("location", gg.a())
                                 .executes(
                                    $$0x -> a((ed)$$0x.getSource(), eq.b($$0x, "targets"), ((ed)$$0x.getSource()).e(), gg.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ee.a("rotation", gd.a())
                                    .executes(
                                       $$0x -> a(
                                             (ed)$$0x.getSource(),
                                             eq.b($$0x, "targets"),
                                             ((ed)$$0x.getSource()).e(),
                                             gg.b($$0x, "location"),
                                             gd.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ee.a("facing")
                                    .then(
                                       ee.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ee.a("facingEntity", eq.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ed)$$0x.getSource(),
                                                            eq.b($$0x, "targets"),
                                                            ((ed)$$0x.getSource()).e(),
                                                            gg.b($$0x, "location"),
                                                            null,
                                                            new aok.b(eq.a($$0x, "facingEntity"), ep.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ee.a("facingAnchor", ep.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ed)$$0x.getSource(),
                                                               eq.b($$0x, "targets"),
                                                               ((ed)$$0x.getSource()).e(),
                                                               gg.b($$0x, "location"),
                                                               null,
                                                               new aok.b(eq.a($$0x, "facingEntity"), ep.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ee.a("facingLocation", gg.a())
                                       .executes(
                                          $$0x -> a(
                                                (ed)$$0x.getSource(),
                                                eq.b($$0x, "targets"),
                                                ((ed)$$0x.getSource()).e(),
                                                gg.b($$0x, "location"),
                                                null,
                                                new aok.c(gg.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ee.a("destination", eq.a()).executes($$0x -> a((ed)$$0x.getSource(), eq.b($$0x, "targets"), eq.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ed $$0, Collection<? extends brh> $$1, brh $$2) throws CommandSyntaxException {
      for (brh $$3 : $$1) {
         a($$0, $$3, (aqh)$$2.dN(), $$2.ds(), $$2.du(), $$2.dy(), EnumSet.noneOf(bsn.class), $$2.dD(), $$2.dF(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(ed $$0, Collection<? extends brh> $$1, aqh $$2, gb $$3, @Nullable gb $$4, @Nullable aok.a $$5) throws CommandSyntaxException {
      etp $$6 = $$3.a($$0);
      eto $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bsn> $$8 = EnumSet.noneOf(bsn.class);
      if ($$3.a()) {
         $$8.add(bsn.a);
      }

      if ($$3.b()) {
         $$8.add(bsn.b);
      }

      if ($$3.c()) {
         $$8.add(bsn.c);
      }

      if ($$4 == null) {
         $$8.add(bsn.e);
         $$8.add(bsn.d);
      } else {
         if ($$4.a()) {
            $$8.add(bsn.e);
         }

         if ($$4.b()) {
            $$8.add(bsn.d);
         }
      }

      for (brh $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dD(), $$9.dF(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.teleport.success.location.single", $$1.iterator().next().O_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> wu.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ed $$0, brh $$1, aqh $$2, double $$3, double $$4, double $$5, Set<bsn> $$6, float $$7, float $$8, @Nullable aok.a $$9) throws CommandSyntaxException {
      in $$10 = in.a($$3, $$4, $$5);
      if (!dad.l($$10)) {
         throw a.create();
      } else {
         float $$11 = axz.g($$7);
         float $$12 = axz.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bsa $$13) || !$$13.fC()) {
               $$1.g($$1.dq().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bsi $$14) {
               $$14.K().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ed var1, brh var2);
   }

   static record b(brh a, ep.a b) implements aok.a {
      @Override
      public void perform(ed $$0, brh $$1) {
         if ($$1 instanceof aqi $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(etp a) implements aok.a {
      @Override
      public void perform(ed $$0, brh $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
