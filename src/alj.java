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

public class alj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("location", ft.a())
                        .executes(
                           $$0x -> a(
                                 (ds)$$0x.getSource(),
                                 Collections.singleton(((ds)$$0x.getSource()).g()),
                                 ((ds)$$0x.getSource()).e(),
                                 ft.b($$0x, "location"),
                                 fv.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dt.a("destination", ef.a())
                     .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).g()), ef.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ef.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("location", ft.a())
                                 .executes(
                                    $$0x -> a((ds)$$0x.getSource(), ef.b($$0x, "targets"), ((ds)$$0x.getSource()).e(), ft.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dt.a("rotation", fq.a())
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ef.b($$0x, "targets"),
                                             ((ds)$$0x.getSource()).e(),
                                             ft.b($$0x, "location"),
                                             fq.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("facing")
                                    .then(
                                       dt.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("facingEntity", ef.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            ef.b($$0x, "targets"),
                                                            ((ds)$$0x.getSource()).e(),
                                                            ft.b($$0x, "location"),
                                                            null,
                                                            new alj.a(ef.a($$0x, "facingEntity"), ee.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("facingAnchor", ee.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ef.b($$0x, "targets"),
                                                               ((ds)$$0x.getSource()).e(),
                                                               ft.b($$0x, "location"),
                                                               null,
                                                               new alj.a(ef.a($$0x, "facingEntity"), ee.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("facingLocation", ft.a())
                                       .executes(
                                          $$0x -> a(
                                                (ds)$$0x.getSource(),
                                                ef.b($$0x, "targets"),
                                                ((ds)$$0x.getSource()).e(),
                                                ft.b($$0x, "location"),
                                                null,
                                                new alj.a(ft.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(dt.a("destination", ef.a()).executes($$0x -> a((ds)$$0x.getSource(), ef.b($$0x, "targets"), ef.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ds $$0, Collection<? extends blw> $$1, blw $$2) throws CommandSyntaxException {
      for (blw $$3 : $$1) {
         a($$0, $$3, (ane)$$2.dL(), $$2.dq(), $$2.ds(), $$2.dw(), EnumSet.noneOf(bnc.class), $$2.dB(), $$2.dD(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vg.a("commands.teleport.success.entity.single", $$1.iterator().next().Q_(), $$2.Q_()), true);
      } else {
         $$0.a(() -> vg.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.Q_()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<? extends blw> $$1, ane $$2, fo $$3, @Nullable fo $$4, @Nullable alj.a $$5) throws CommandSyntaxException {
      emc $$6 = $$3.a($$0);
      emb $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bnc> $$8 = EnumSet.noneOf(bnc.class);
      if ($$3.a()) {
         $$8.add(bnc.a);
      }

      if ($$3.b()) {
         $$8.add(bnc.b);
      }

      if ($$3.c()) {
         $$8.add(bnc.c);
      }

      if ($$4 == null) {
         $$8.add(bnc.e);
         $$8.add(bnc.d);
      } else {
         if ($$4.a()) {
            $$8.add(bnc.e);
         }

         if ($$4.b()) {
            $$8.add(bnc.d);
         }
      }

      for (blw $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dB(), $$9.dD(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vg.a("commands.teleport.success.location.single", $$1.iterator().next().Q_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> vg.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ds $$0, blw $$1, ane $$2, double $$3, double $$4, double $$5, Set<bnc> $$6, float $$7, float $$8, @Nullable alj.a $$9) throws CommandSyntaxException {
      hx $$10 = hx.a($$3, $$4, $$5);
      if (!ctx.l($$10)) {
         throw a.create();
      } else {
         float $$11 = aup.g($$7);
         float $$12 = aup.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof bmo $$13) || !$$13.fw()) {
               $$1.g($$1.do().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bmx $$14) {
               $$14.N().n();
            }
         }
      }
   }

   static class a {
      private final emc a;
      private final blw b;
      private final ee.a c;

      public a(blw $$0, ee.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(emc $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(ds $$0, blw $$1) {
         if (this.b != null) {
            if ($$1 instanceof anf) {
               ((anf)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
