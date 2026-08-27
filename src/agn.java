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

public class agn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("location", fp.a())
                        .executes(
                           $$0x -> a(
                                 (ds)$$0x.getSource(),
                                 Collections.singleton(((ds)$$0x.getSource()).g()),
                                 ((ds)$$0x.getSource()).e(),
                                 fp.b($$0x, "location"),
                                 fr.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dt.a("destination", ec.a())
                     .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).g()), ec.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ec.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("location", fp.a())
                                 .executes(
                                    $$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"), ((ds)$$0x.getSource()).e(), fp.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dt.a("rotation", fm.a())
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ec.b($$0x, "targets"),
                                             ((ds)$$0x.getSource()).e(),
                                             fp.b($$0x, "location"),
                                             fm.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("facing")
                                    .then(
                                       dt.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("facingEntity", ec.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            ec.b($$0x, "targets"),
                                                            ((ds)$$0x.getSource()).e(),
                                                            fp.b($$0x, "location"),
                                                            null,
                                                            new agn.a(ec.a($$0x, "facingEntity"), eb.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("facingAnchor", eb.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ec.b($$0x, "targets"),
                                                               ((ds)$$0x.getSource()).e(),
                                                               fp.b($$0x, "location"),
                                                               null,
                                                               new agn.a(ec.a($$0x, "facingEntity"), eb.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("facingLocation", fp.a())
                                       .executes(
                                          $$0x -> a(
                                                (ds)$$0x.getSource(),
                                                ec.b($$0x, "targets"),
                                                ((ds)$$0x.getSource()).e(),
                                                fp.b($$0x, "location"),
                                                null,
                                                new agn.a(fp.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(dt.a("destination", ec.a()).executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"), ec.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1, bfj $$2) throws CommandSyntaxException {
      for (bfj $$3 : $$1) {
         a($$0, $$3, (aif)$$2.dI(), $$2.dn(), $$2.dp(), $$2.dt(), EnumSet.noneOf(bgn.class), $$2.dy(), $$2.dA(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.teleport.success.entity.single", $$1.iterator().next().H_(), $$2.H_()), true);
      } else {
         $$0.a(() -> sw.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.H_()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1, aif $$2, fk $$3, @Nullable fk $$4, @Nullable agn.a $$5) throws CommandSyntaxException {
      eei $$6 = $$3.a($$0);
      eeh $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bgn> $$8 = EnumSet.noneOf(bgn.class);
      if ($$3.a()) {
         $$8.add(bgn.a);
      }

      if ($$3.b()) {
         $$8.add(bgn.b);
      }

      if ($$3.c()) {
         $$8.add(bgn.c);
      }

      if ($$4 == null) {
         $$8.add(bgn.e);
         $$8.add(bgn.d);
      } else {
         if ($$4.a()) {
            $$8.add(bgn.e);
         }

         if ($$4.b()) {
            $$8.add(bgn.d);
         }
      }

      for (bfj $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dy(), $$9.dA(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.teleport.success.location.single", $$1.iterator().next().H_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> sw.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ds $$0, bfj $$1, aif $$2, double $$3, double $$4, double $$5, Set<bgn> $$6, float $$7, float $$8, @Nullable agn.a $$9) throws CommandSyntaxException {
      gu $$10 = gu.a($$3, $$4, $$5);
      if (!cmm.k($$10)) {
         throw a.create();
      } else {
         float $$11 = apa.g($$7);
         float $$12 = apa.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof bfz $$13) || !$$13.fr()) {
               $$1.f($$1.dl().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bgi $$14) {
               $$14.J().n();
            }
         }
      }
   }

   static class a {
      private final eei a;
      private final bfj b;
      private final eb.a c;

      public a(bfj $$0, eb.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(eei $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(ds $$0, bfj $$1) {
         if (this.b != null) {
            if ($$1 instanceof aig) {
               ((aig)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
