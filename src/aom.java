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

public class aom {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<eq> $$0) {
      LiteralCommandNode<eq> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     er.a("location", gt.a())
                        .executes(
                           $$0x -> a(
                                 (eq)$$0x.getSource(),
                                 Collections.singleton(((eq)$$0x.getSource()).g()),
                                 ((eq)$$0x.getSource()).e(),
                                 gt.b($$0x, "location"),
                                 gv.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  er.a("destination", fd.a())
                     .executes($$0x -> a((eq)$$0x.getSource(), Collections.singleton(((eq)$$0x.getSource()).g()), fd.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)er.a("targets", fd.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("location", gt.a())
                                 .executes(
                                    $$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"), ((eq)$$0x.getSource()).e(), gt.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 er.a("rotation", gq.a())
                                    .executes(
                                       $$0x -> a(
                                             (eq)$$0x.getSource(),
                                             fd.b($$0x, "targets"),
                                             ((eq)$$0x.getSource()).e(),
                                             gt.b($$0x, "location"),
                                             gq.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)er.a("facing")
                                    .then(
                                       er.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)er.a("facingEntity", fd.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (eq)$$0x.getSource(),
                                                            fd.b($$0x, "targets"),
                                                            ((eq)$$0x.getSource()).e(),
                                                            gt.b($$0x, "location"),
                                                            null,
                                                            new aom.b(fd.a($$0x, "facingEntity"), fc.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   er.a("facingAnchor", fc.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               fd.b($$0x, "targets"),
                                                               ((eq)$$0x.getSource()).e(),
                                                               gt.b($$0x, "location"),
                                                               null,
                                                               new aom.b(fd.a($$0x, "facingEntity"), fc.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    er.a("facingLocation", gt.a())
                                       .executes(
                                          $$0x -> a(
                                                (eq)$$0x.getSource(),
                                                fd.b($$0x, "targets"),
                                                ((eq)$$0x.getSource()).e(),
                                                gt.b($$0x, "location"),
                                                null,
                                                new aom.c(gt.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(er.a("destination", fd.a()).executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"), fd.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(eq $$0, Collection<? extends bsg> $$1, bsg $$2) throws CommandSyntaxException {
      for (bsg $$3 : $$1) {
         a($$0, $$3, (aqm)$$2.dQ(), $$2.dv(), $$2.dx(), $$2.dB(), EnumSet.noneOf(btp.class), $$2.dG(), $$2.dI(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(eq $$0, Collection<? extends bsg> $$1, aqm $$2, go $$3, @Nullable go $$4, @Nullable aom.a $$5) throws CommandSyntaxException {
      ewf $$6 = $$3.a($$0);
      ewe $$7 = $$4 == null ? null : $$4.b($$0);
      Set<btp> $$8 = EnumSet.noneOf(btp.class);
      if ($$3.a()) {
         $$8.add(btp.a);
      }

      if ($$3.b()) {
         $$8.add(btp.b);
      }

      if ($$3.c()) {
         $$8.add(btp.c);
      }

      if ($$4 == null) {
         $$8.add(btp.e);
         $$8.add(btp.d);
      } else {
         if ($$4.a()) {
            $$8.add(btp.e);
         }

         if ($$4.b()) {
            $$8.add(btp.d);
         }
      }

      for (bsg $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dG(), $$9.dI(), $$5);
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

   private static void a(eq $$0, bsg $$1, aqm $$2, double $$3, double $$4, double $$5, Set<btp> $$6, float $$7, float $$8, @Nullable aom.a $$9) throws CommandSyntaxException {
      ja $$10 = ja.a($$3, $$4, $$5);
      if (!dcf.l($$10)) {
         throw a.create();
      } else {
         float $$11 = ayg.g($$7);
         float $$12 = ayg.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof btb $$13) || !$$13.fB()) {
               $$1.i($$1.dt().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof btk $$14) {
               $$14.K().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(eq var1, bsg var2);
   }

   static record b(bsg a, fc.a b) implements aom.a {
      @Override
      public void perform(eq $$0, bsg $$1) {
         if ($$1 instanceof aqn $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(ewf a) implements aom.a {
      @Override
      public void perform(eq $$0, bsg $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
