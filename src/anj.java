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

public class anj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dv.a("location", fv.a())
                        .executes(
                           $$0x -> a(
                                 (du)$$0x.getSource(),
                                 Collections.singleton(((du)$$0x.getSource()).g()),
                                 ((du)$$0x.getSource()).e(),
                                 fv.b($$0x, "location"),
                                 fx.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dv.a("destination", eh.a())
                     .executes($$0x -> a((du)$$0x.getSource(), Collections.singleton(((du)$$0x.getSource()).g()), eh.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eh.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("location", fv.a())
                                 .executes(
                                    $$0x -> a((du)$$0x.getSource(), eh.b($$0x, "targets"), ((du)$$0x.getSource()).e(), fv.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dv.a("rotation", fs.a())
                                    .executes(
                                       $$0x -> a(
                                             (du)$$0x.getSource(),
                                             eh.b($$0x, "targets"),
                                             ((du)$$0x.getSource()).e(),
                                             fv.b($$0x, "location"),
                                             fs.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("facing")
                                    .then(
                                       dv.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("facingEntity", eh.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            eh.b($$0x, "targets"),
                                                            ((du)$$0x.getSource()).e(),
                                                            fv.b($$0x, "location"),
                                                            null,
                                                            new anj.a(eh.a($$0x, "facingEntity"), eg.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("facingAnchor", eg.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eh.b($$0x, "targets"),
                                                               ((du)$$0x.getSource()).e(),
                                                               fv.b($$0x, "location"),
                                                               null,
                                                               new anj.a(eh.a($$0x, "facingEntity"), eg.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("facingLocation", fv.a())
                                       .executes(
                                          $$0x -> a(
                                                (du)$$0x.getSource(),
                                                eh.b($$0x, "targets"),
                                                ((du)$$0x.getSource()).e(),
                                                fv.b($$0x, "location"),
                                                null,
                                                new anj.a(fv.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(dv.a("destination", eh.a()).executes($$0x -> a((du)$$0x.getSource(), eh.b($$0x, "targets"), eh.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(du $$0, Collection<? extends bow> $$1, bow $$2) throws CommandSyntaxException {
      for (bow $$3 : $$1) {
         a($$0, $$3, (apf)$$2.dM(), $$2.dr(), $$2.dt(), $$2.dx(), EnumSet.noneOf(bqb.class), $$2.dC(), $$2.dE(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vu.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> vu.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<? extends bow> $$1, apf $$2, fq $$3, @Nullable fq $$4, @Nullable anj.a $$5) throws CommandSyntaxException {
      epr $$6 = $$3.a($$0);
      epq $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bqb> $$8 = EnumSet.noneOf(bqb.class);
      if ($$3.a()) {
         $$8.add(bqb.a);
      }

      if ($$3.b()) {
         $$8.add(bqb.b);
      }

      if ($$3.c()) {
         $$8.add(bqb.c);
      }

      if ($$4 == null) {
         $$8.add(bqb.e);
         $$8.add(bqb.d);
      } else {
         if ($$4.a()) {
            $$8.add(bqb.e);
         }

         if ($$4.b()) {
            $$8.add(bqb.d);
         }
      }

      for (bow $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dC(), $$9.dE(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vu.a("commands.teleport.success.location.single", $$1.iterator().next().O_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> vu.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(du $$0, bow $$1, apf $$2, double $$3, double $$4, double $$5, Set<bqb> $$6, float $$7, float $$8, @Nullable anj.a $$9) throws CommandSyntaxException {
      ib $$10 = ib.a($$3, $$4, $$5);
      if (!cwz.l($$10)) {
         throw a.create();
      } else {
         float $$11 = aww.g($$7);
         float $$12 = aww.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof bpo $$13) || !$$13.fB()) {
               $$1.g($$1.dp().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bpw $$14) {
               $$14.K().n();
            }
         }
      }
   }

   static class a {
      private final epr a;
      private final bow b;
      private final eg.a c;

      public a(bow $$0, eg.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(epr $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(du $$0, bow $$1) {
         if (this.b != null) {
            if ($$1 instanceof apg) {
               ((apg)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
