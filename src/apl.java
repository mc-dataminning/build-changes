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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ev> $$0) {
      LiteralCommandNode<ev> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ew.a("location", gy.a())
                        .executes(
                           $$0x -> a(
                                 (ev)$$0x.getSource(),
                                 Collections.singleton(((ev)$$0x.getSource()).g()),
                                 ((ev)$$0x.getSource()).e(),
                                 gy.b($$0x, "location"),
                                 ha.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  ew.a("destination", fi.a())
                     .executes($$0x -> a((ev)$$0x.getSource(), Collections.singleton(((ev)$$0x.getSource()).g()), fi.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ew.a("targets", fi.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("location", gy.a())
                                 .executes(
                                    $$0x -> a((ev)$$0x.getSource(), fi.b($$0x, "targets"), ((ev)$$0x.getSource()).e(), gy.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ew.a("rotation", gv.a())
                                    .executes(
                                       $$0x -> a(
                                             (ev)$$0x.getSource(),
                                             fi.b($$0x, "targets"),
                                             ((ev)$$0x.getSource()).e(),
                                             gy.b($$0x, "location"),
                                             gv.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ew.a("facing")
                                    .then(
                                       ew.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ew.a("facingEntity", fi.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ev)$$0x.getSource(),
                                                            fi.b($$0x, "targets"),
                                                            ((ev)$$0x.getSource()).e(),
                                                            gy.b($$0x, "location"),
                                                            null,
                                                            new apl.b(fi.a($$0x, "facingEntity"), fh.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ew.a("facingAnchor", fh.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fi.b($$0x, "targets"),
                                                               ((ev)$$0x.getSource()).e(),
                                                               gy.b($$0x, "location"),
                                                               null,
                                                               new apl.b(fi.a($$0x, "facingEntity"), fh.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ew.a("facingLocation", gy.a())
                                       .executes(
                                          $$0x -> a(
                                                (ev)$$0x.getSource(),
                                                fi.b($$0x, "targets"),
                                                ((ev)$$0x.getSource()).e(),
                                                gy.b($$0x, "location"),
                                                null,
                                                new apl.c(gy.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ew.a("destination", fi.a()).executes($$0x -> a((ev)$$0x.getSource(), fi.b($$0x, "targets"), fi.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ev $$0, Collection<? extends btz> $$1, btz $$2) throws CommandSyntaxException {
      for (btz $$3 : $$1) {
         a($$0, $$3, (arm)$$2.dX(), $$2.dC(), $$2.dE(), $$2.dI(), EnumSet.noneOf(bvj.class), $$2.dN(), $$2.dP(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.teleport.success.entity.single", $$1.iterator().next().S_(), $$2.S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.S_()), true);
      }

      return $$1.size();
   }

   private static int a(ev $$0, Collection<? extends btz> $$1, arm $$2, gt $$3, @Nullable gt $$4, @Nullable apl.a $$5) throws CommandSyntaxException {
      ezh $$6 = $$3.a($$0, true);
      ezg $$7 = $$4 == null ? null : $$4.b($$0, true);
      Set<bvj> $$8 = EnumSet.noneOf(bvj.class);
      if ($$3.a()) {
         $$8.add(bvj.a);
         $$8.add(bvj.f);
      }

      if ($$3.b()) {
         $$8.add(bvj.b);
         $$8.add(bvj.g);
      }

      if ($$3.c()) {
         $$8.add(bvj.c);
         $$8.add(bvj.h);
      }

      if ($$4 == null) {
         $$8.add(bvj.e);
         $$8.add(bvj.d);
      } else {
         if ($$4.a()) {
            $$8.add(bvj.e);
         }

         if ($$4.b()) {
            $$8.add(bvj.d);
         }
      }

      for (btz $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, 0.0F, 0.0F, $$5);
         } else {
            a($$0, $$9, $$2, $$6.d, $$6.e, $$6.f, $$8, $$7.j, $$7.i, $$5);
         }
      }

      ezh $$10 = $$3.a($$0);
      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.teleport.success.location.single", $$1.iterator().next().S_(), a($$10.d), a($$10.e), a($$10.f)), true);
      } else {
         $$0.a(() -> xh.a("commands.teleport.success.location.multiple", $$1.size(), a($$10.d), a($$10.e), a($$10.f)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ev $$0, btz $$1, arm $$2, double $$3, double $$4, double $$5, Set<bvj> $$6, float $$7, float $$8, @Nullable apl.a $$9) throws CommandSyntaxException {
      jg $$10 = jg.a($$3, $$4, $$5);
      if (!dev.l($$10)) {
         throw a.create();
      } else {
         float $$11 = azj.h($$7);
         float $$12 = azj.h($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof buv $$13) || !$$13.fL()) {
               $$1.h($$1.dA().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bvd $$14) {
               $$14.P().o();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ev var1, btz var2);
   }

   static record b(btz a, fh.a b) implements apl.a {
      @Override
      public void perform(ev $$0, btz $$1) {
         if ($$1 instanceof arn $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(ezh a) implements apl.a {
      @Override
      public void perform(ev $$0, btz $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
