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

public class api {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<eu> $$0) {
      LiteralCommandNode<eu> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ev.a("location", gx.a())
                        .executes(
                           $$0x -> a(
                                 (eu)$$0x.getSource(),
                                 Collections.singleton(((eu)$$0x.getSource()).g()),
                                 ((eu)$$0x.getSource()).e(),
                                 gx.b($$0x, "location"),
                                 gz.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  ev.a("destination", fh.a())
                     .executes($$0x -> a((eu)$$0x.getSource(), Collections.singleton(((eu)$$0x.getSource()).g()), fh.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ev.a("targets", fh.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("location", gx.a())
                                 .executes(
                                    $$0x -> a((eu)$$0x.getSource(), fh.b($$0x, "targets"), ((eu)$$0x.getSource()).e(), gx.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ev.a("rotation", gu.a())
                                    .executes(
                                       $$0x -> a(
                                             (eu)$$0x.getSource(),
                                             fh.b($$0x, "targets"),
                                             ((eu)$$0x.getSource()).e(),
                                             gx.b($$0x, "location"),
                                             gu.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ev.a("facing")
                                    .then(
                                       ev.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ev.a("facingEntity", fh.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (eu)$$0x.getSource(),
                                                            fh.b($$0x, "targets"),
                                                            ((eu)$$0x.getSource()).e(),
                                                            gx.b($$0x, "location"),
                                                            null,
                                                            new api.b(fh.a($$0x, "facingEntity"), fg.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ev.a("facingAnchor", fg.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fh.b($$0x, "targets"),
                                                               ((eu)$$0x.getSource()).e(),
                                                               gx.b($$0x, "location"),
                                                               null,
                                                               new api.b(fh.a($$0x, "facingEntity"), fg.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ev.a("facingLocation", gx.a())
                                       .executes(
                                          $$0x -> a(
                                                (eu)$$0x.getSource(),
                                                fh.b($$0x, "targets"),
                                                ((eu)$$0x.getSource()).e(),
                                                gx.b($$0x, "location"),
                                                null,
                                                new api.c(gx.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ev.a("destination", fh.a()).executes($$0x -> a((eu)$$0x.getSource(), fh.b($$0x, "targets"), fh.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(eu $$0, Collection<? extends btr> $$1, btr $$2) throws CommandSyntaxException {
      for (btr $$3 : $$1) {
         a($$0, $$3, (arj)$$2.dS(), $$2.dx(), $$2.dz(), $$2.dD(), EnumSet.noneOf(bva.class), $$2.dI(), $$2.dK(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.teleport.success.entity.single", $$1.iterator().next().R_(), $$2.R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.R_()), true);
      }

      return $$1.size();
   }

   private static int a(eu $$0, Collection<? extends btr> $$1, arj $$2, gs $$3, @Nullable gs $$4, @Nullable api.a $$5) throws CommandSyntaxException {
      eyw $$6 = $$3.a($$0);
      eyv $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bva> $$8 = EnumSet.noneOf(bva.class);
      if ($$3.a()) {
         $$8.add(bva.a);
      }

      if ($$3.b()) {
         $$8.add(bva.b);
      }

      if ($$3.c()) {
         $$8.add(bva.c);
      }

      if ($$4 == null) {
         $$8.add(bva.e);
         $$8.add(bva.d);
      } else {
         if ($$4.a()) {
            $$8.add(bva.e);
         }

         if ($$4.b()) {
            $$8.add(bva.d);
         }
      }

      for (btr $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$9.dI(), $$9.dK(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.teleport.success.location.single", $$1.iterator().next().R_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xe.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(eu $$0, btr $$1, arj $$2, double $$3, double $$4, double $$5, Set<bva> $$6, float $$7, float $$8, @Nullable api.a $$9) throws CommandSyntaxException {
      jf $$10 = jf.a($$3, $$4, $$5);
      if (!dej.l($$10)) {
         throw a.create();
      } else {
         float $$11 = azf.h($$7);
         float $$12 = azf.h($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bun $$13) || !$$13.fF()) {
               $$1.h($$1.dv().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof buv $$14) {
               $$14.P().o();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(eu var1, btr var2);
   }

   static record b(btr a, fg.a b) implements api.a {
      @Override
      public void perform(eu $$0, btr $$1) {
         if ($$1 instanceof ark $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(eyw a) implements api.a {
      @Override
      public void perform(eu $$0, btr $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
