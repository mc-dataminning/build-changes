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

public class aow {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<eh> $$0) {
      LiteralCommandNode<eh> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ei.a("location", gk.a())
                        .executes(
                           $$0x -> a(
                                 (eh)$$0x.getSource(),
                                 Collections.singleton(((eh)$$0x.getSource()).g()),
                                 ((eh)$$0x.getSource()).e(),
                                 gk.b($$0x, "location"),
                                 gm.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  ei.a("destination", eu.a())
                     .executes($$0x -> a((eh)$$0x.getSource(), Collections.singleton(((eh)$$0x.getSource()).g()), eu.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ei.a("targets", eu.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("location", gk.a())
                                 .executes(
                                    $$0x -> a((eh)$$0x.getSource(), eu.b($$0x, "targets"), ((eh)$$0x.getSource()).e(), gk.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ei.a("rotation", gh.a())
                                    .executes(
                                       $$0x -> a(
                                             (eh)$$0x.getSource(),
                                             eu.b($$0x, "targets"),
                                             ((eh)$$0x.getSource()).e(),
                                             gk.b($$0x, "location"),
                                             gh.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ei.a("facing")
                                    .then(
                                       ei.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ei.a("facingEntity", eu.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (eh)$$0x.getSource(),
                                                            eu.b($$0x, "targets"),
                                                            ((eh)$$0x.getSource()).e(),
                                                            gk.b($$0x, "location"),
                                                            null,
                                                            new aow.b(eu.a($$0x, "facingEntity"), et.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ei.a("facingAnchor", et.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               eu.b($$0x, "targets"),
                                                               ((eh)$$0x.getSource()).e(),
                                                               gk.b($$0x, "location"),
                                                               null,
                                                               new aow.b(eu.a($$0x, "facingEntity"), et.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ei.a("facingLocation", gk.a())
                                       .executes(
                                          $$0x -> a(
                                                (eh)$$0x.getSource(),
                                                eu.b($$0x, "targets"),
                                                ((eh)$$0x.getSource()).e(),
                                                gk.b($$0x, "location"),
                                                null,
                                                new aow.c(gk.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ei.a("destination", eu.a()).executes($$0x -> a((eh)$$0x.getSource(), eu.b($$0x, "targets"), eu.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(eh $$0, Collection<? extends brv> $$1, brv $$2) throws CommandSyntaxException {
      for (brv $$3 : $$1) {
         a($$0, $$3, (aqt)$$2.dU(), $$2.dz(), $$2.dB(), $$2.dF(), EnumSet.noneOf(btb.class), $$2.dK(), $$2.dM(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.teleport.success.entity.single", $$1.iterator().next().P_(), $$2.P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.P_()), true);
      }

      return $$1.size();
   }

   private static int a(eh $$0, Collection<? extends brv> $$1, aqt $$2, gf $$3, @Nullable gf $$4, @Nullable aow.a $$5) throws CommandSyntaxException {
      ewu $$6 = $$3.a($$0);
      ewt $$7 = $$4 == null ? null : $$4.b($$0);
      Set<btb> $$8 = EnumSet.noneOf(btb.class);
      if ($$3.a()) {
         $$8.add(btb.a);
      }

      if ($$3.b()) {
         $$8.add(btb.b);
      }

      if ($$3.c()) {
         $$8.add(btb.c);
      }

      if ($$4 == null) {
         $$8.add(btb.e);
         $$8.add(btb.d);
      } else {
         if ($$4.a()) {
            $$8.add(btb.e);
         }

         if ($$4.b()) {
            $$8.add(btb.d);
         }
      }

      for (brv $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dK(), $$9.dM(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.teleport.success.location.single", $$1.iterator().next().P_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> xe.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(eh $$0, brv $$1, aqt $$2, double $$3, double $$4, double $$5, Set<btb> $$6, float $$7, float $$8, @Nullable aow.a $$9) throws CommandSyntaxException {
      ir $$10 = ir.a($$3, $$4, $$5);
      if (!dca.l($$10)) {
         throw a.create();
      } else {
         float $$11 = aym.g($$7);
         float $$12 = aym.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bso $$13) || !$$13.fN()) {
               $$1.g($$1.dx().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bsw $$14) {
               $$14.J().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(eh var1, brv var2);
   }

   static record b(brv a, et.a b) implements aow.a {
      @Override
      public void perform(eh $$0, brv $$1) {
         if ($$1 instanceof aqu $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(ewu a) implements aow.a {
      @Override
      public void perform(eh $$0, brv $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
