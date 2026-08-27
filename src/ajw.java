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

public class ajw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dv.a("location", ft.a())
                        .executes(
                           $$0x -> a(
                                 (du)$$0x.getSource(),
                                 Collections.singleton(((du)$$0x.getSource()).h()),
                                 ((du)$$0x.getSource()).f(),
                                 ft.b($$0x, "location"),
                                 fv.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dv.a("destination", eg.a())
                     .executes($$0x -> a((du)$$0x.getSource(), Collections.singleton(((du)$$0x.getSource()).h()), eg.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eg.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("location", ft.a())
                                 .executes(
                                    $$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), ((du)$$0x.getSource()).f(), ft.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dv.a("rotation", fq.a())
                                    .executes(
                                       $$0x -> a(
                                             (du)$$0x.getSource(),
                                             eg.b($$0x, "targets"),
                                             ((du)$$0x.getSource()).f(),
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
                                                            ((du)$$0x.getSource()).f(),
                                                            ft.b($$0x, "location"),
                                                            null,
                                                            new ajw.a(eg.a($$0x, "facingEntity"), ef.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("facingAnchor", ef.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eg.b($$0x, "targets"),
                                                               ((du)$$0x.getSource()).f(),
                                                               ft.b($$0x, "location"),
                                                               null,
                                                               new ajw.a(eg.a($$0x, "facingEntity"), ef.a($$0x, "facingAnchor"))
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
                                                ((du)$$0x.getSource()).f(),
                                                ft.b($$0x, "location"),
                                                null,
                                                new ajw.a(ft.a($$0x, "facingLocation"))
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

   private static int a(du $$0, Collection<? extends bjt> $$1, bjt $$2) throws CommandSyntaxException {
      for (bjt $$3 : $$1) {
         a($$0, $$3, (alq)$$2.dL(), $$2.dq(), $$2.ds(), $$2.dw(), EnumSet.noneOf(bkx.class), $$2.dB(), $$2.dD(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ui.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> ui.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<? extends bjt> $$1, alq $$2, fo $$3, @Nullable fo $$4, @Nullable ajw.a $$5) throws CommandSyntaxException {
      eif $$6 = $$3.a($$0);
      eie $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bkx> $$8 = EnumSet.noneOf(bkx.class);
      if ($$3.a()) {
         $$8.add(bkx.a);
      }

      if ($$3.b()) {
         $$8.add(bkx.b);
      }

      if ($$3.c()) {
         $$8.add(bkx.c);
      }

      if ($$4 == null) {
         $$8.add(bkx.e);
         $$8.add(bkx.d);
      } else {
         if ($$4.a()) {
            $$8.add(bkx.e);
         }

         if ($$4.b()) {
            $$8.add(bkx.d);
         }
      }

      for (bjt $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dB(), $$9.dD(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ui.a("commands.teleport.success.location.single", $$1.iterator().next().O_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> ui.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(du $$0, bjt $$1, alq $$2, double $$3, double $$4, double $$5, Set<bkx> $$6, float $$7, float $$8, @Nullable ajw.a $$9) throws CommandSyntaxException {
      ht $$10 = ht.a($$3, $$4, $$5);
      if (!cqz.k($$10)) {
         throw a.create();
      } else {
         float $$11 = asy.g($$7);
         float $$12 = asy.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof bkj $$13) || !$$13.fw()) {
               $$1.f($$1.do().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bks $$14) {
               $$14.L().n();
            }
         }
      }
   }

   static class a {
      private final eif a;
      private final bjt b;
      private final ef.a c;

      public a(bjt $$0, ef.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(eif $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(du $$0, bjt $$1) {
         if (this.b != null) {
            if ($$1 instanceof alr) {
               ((alr)$$1).a($$0.n(), this.b, this.c);
            } else {
               $$1.a($$0.n(), this.a);
            }
         } else {
            $$1.a($$0.n(), this.a);
         }
      }
   }
}
