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

public class akn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dv.a("location", ft.a())
                        .executes(
                           $$0x -> a(
                                 (du)$$0x.getSource(),
                                 Collections.singleton(((du)$$0x.getSource()).g()),
                                 ((du)$$0x.getSource()).e(),
                                 ft.b($$0x, "location"),
                                 fv.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dv.a("destination", eg.a())
                     .executes($$0x -> a((du)$$0x.getSource(), Collections.singleton(((du)$$0x.getSource()).g()), eg.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eg.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("location", ft.a())
                                 .executes(
                                    $$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), ((du)$$0x.getSource()).e(), ft.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dv.a("rotation", fq.a())
                                    .executes(
                                       $$0x -> a(
                                             (du)$$0x.getSource(),
                                             eg.b($$0x, "targets"),
                                             ((du)$$0x.getSource()).e(),
                                             ft.b($$0x, "location"),
                                             fq.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("facing")
                                    .then(
                                       dv.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("facingEntity", eg.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            eg.b($$0x, "targets"),
                                                            ((du)$$0x.getSource()).e(),
                                                            ft.b($$0x, "location"),
                                                            null,
                                                            new akn.a(eg.a($$0x, "facingEntity"), ef.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("facingAnchor", ef.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eg.b($$0x, "targets"),
                                                               ((du)$$0x.getSource()).e(),
                                                               ft.b($$0x, "location"),
                                                               null,
                                                               new akn.a(eg.a($$0x, "facingEntity"), ef.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("facingLocation", ft.a())
                                       .executes(
                                          $$0x -> a(
                                                (du)$$0x.getSource(),
                                                eg.b($$0x, "targets"),
                                                ((du)$$0x.getSource()).e(),
                                                ft.b($$0x, "location"),
                                                null,
                                                new akn.a(ft.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(dv.a("destination", eg.a()).executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), eg.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(du $$0, Collection<? extends bkv> $$1, bkv $$2) throws CommandSyntaxException {
      for (bkv $$3 : $$1) {
         a($$0, $$3, (ami)$$2.dN(), $$2.ds(), $$2.du(), $$2.dy(), EnumSet.noneOf(blz.class), $$2.dD(), $$2.dF(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.teleport.success.entity.single", $$1.iterator().next().Q_(), $$2.Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.Q_()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<? extends bkv> $$1, ami $$2, fo $$3, @Nullable fo $$4, @Nullable akn.a $$5) throws CommandSyntaxException {
      ejz $$6 = $$3.a($$0);
      ejy $$7 = $$4 == null ? null : $$4.b($$0);
      Set<blz> $$8 = EnumSet.noneOf(blz.class);
      if ($$3.a()) {
         $$8.add(blz.a);
      }

      if ($$3.b()) {
         $$8.add(blz.b);
      }

      if ($$3.c()) {
         $$8.add(blz.c);
      }

      if ($$4 == null) {
         $$8.add(blz.e);
         $$8.add(blz.d);
      } else {
         if ($$4.a()) {
            $$8.add(blz.e);
         }

         if ($$4.b()) {
            $$8.add(blz.d);
         }
      }

      for (bkv $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dD(), $$9.dF(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.teleport.success.location.single", $$1.iterator().next().Q_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> uv.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(du $$0, bkv $$1, ami $$2, double $$3, double $$4, double $$5, Set<blz> $$6, float $$7, float $$8, @Nullable akn.a $$9) throws CommandSyntaxException {
      hx $$10 = hx.a($$3, $$4, $$5);
      if (!csf.k($$10)) {
         throw a.create();
      } else {
         float $$11 = atq.g($$7);
         float $$12 = atq.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof bll $$13) || !$$13.fx()) {
               $$1.g($$1.dq().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof blu $$14) {
               $$14.N().n();
            }
         }
      }
   }

   static class a {
      private final ejz a;
      private final bkv b;
      private final ef.a c;

      public a(bkv $$0, ef.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(ejz $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(du $$0, bkv $$1) {
         if (this.b != null) {
            if ($$1 instanceof amj) {
               ((amj)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
