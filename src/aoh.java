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

public class aoh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ec> $$0) {
      LiteralCommandNode<ec> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ed.a("location", ge.a())
                        .executes(
                           $$0x -> a(
                                 (ec)$$0x.getSource(),
                                 Collections.singleton(((ec)$$0x.getSource()).g()),
                                 ((ec)$$0x.getSource()).e(),
                                 ge.b($$0x, "location"),
                                 gg.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  ed.a("destination", ep.a())
                     .executes($$0x -> a((ec)$$0x.getSource(), Collections.singleton(((ec)$$0x.getSource()).g()), ep.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ed.a("targets", ep.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("location", ge.a())
                                 .executes(
                                    $$0x -> a((ec)$$0x.getSource(), ep.b($$0x, "targets"), ((ec)$$0x.getSource()).e(), ge.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ed.a("rotation", gb.a())
                                    .executes(
                                       $$0x -> a(
                                             (ec)$$0x.getSource(),
                                             ep.b($$0x, "targets"),
                                             ((ec)$$0x.getSource()).e(),
                                             ge.b($$0x, "location"),
                                             gb.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ed.a("facing")
                                    .then(
                                       ed.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ed.a("facingEntity", ep.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ec)$$0x.getSource(),
                                                            ep.b($$0x, "targets"),
                                                            ((ec)$$0x.getSource()).e(),
                                                            ge.b($$0x, "location"),
                                                            null,
                                                            new aoh.b(ep.a($$0x, "facingEntity"), eo.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ed.a("facingAnchor", eo.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               ep.b($$0x, "targets"),
                                                               ((ec)$$0x.getSource()).e(),
                                                               ge.b($$0x, "location"),
                                                               null,
                                                               new aoh.b(ep.a($$0x, "facingEntity"), eo.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ed.a("facingLocation", ge.a())
                                       .executes(
                                          $$0x -> a(
                                                (ec)$$0x.getSource(),
                                                ep.b($$0x, "targets"),
                                                ((ec)$$0x.getSource()).e(),
                                                ge.b($$0x, "location"),
                                                null,
                                                new aoh.c(ge.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ed.a("destination", ep.a()).executes($$0x -> a((ec)$$0x.getSource(), ep.b($$0x, "targets"), ep.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ec $$0, Collection<? extends bql> $$1, bql $$2) throws CommandSyntaxException {
      for (bql $$3 : $$1) {
         a($$0, $$3, (aqe)$$2.dN(), $$2.ds(), $$2.du(), $$2.dy(), EnumSet.noneOf(brr.class), $$2.dD(), $$2.dF(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(ec $$0, Collection<? extends bql> $$1, aqe $$2, fz $$3, @Nullable fz $$4, @Nullable aoh.a $$5) throws CommandSyntaxException {
      etf $$6 = $$3.a($$0);
      ete $$7 = $$4 == null ? null : $$4.b($$0);
      Set<brr> $$8 = EnumSet.noneOf(brr.class);
      if ($$3.a()) {
         $$8.add(brr.a);
      }

      if ($$3.b()) {
         $$8.add(brr.b);
      }

      if ($$3.c()) {
         $$8.add(brr.c);
      }

      if ($$4 == null) {
         $$8.add(brr.e);
         $$8.add(brr.d);
      } else {
         if ($$4.a()) {
            $$8.add(brr.e);
         }

         if ($$4.b()) {
            $$8.add(brr.d);
         }
      }

      for (bql $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dD(), $$9.dF(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.teleport.success.location.single", $$1.iterator().next().O_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> ws.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ec $$0, bql $$1, aqe $$2, double $$3, double $$4, double $$5, Set<brr> $$6, float $$7, float $$8, @Nullable aoh.a $$9) throws CommandSyntaxException {
      im $$10 = im.a($$3, $$4, $$5);
      if (!czu.l($$10)) {
         throw a.create();
      } else {
         float $$11 = axw.g($$7);
         float $$12 = axw.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bre $$13) || !$$13.fC()) {
               $$1.g($$1.dq().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof brm $$14) {
               $$14.K().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ec var1, bql var2);
   }

   static record b(bql a, eo.a b) implements aoh.a {
      @Override
      public void perform(ec $$0, bql $$1) {
         if ($$1 instanceof aqf $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(etf a) implements aoh.a {
      @Override
      public void perform(ec $$0, bql $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
