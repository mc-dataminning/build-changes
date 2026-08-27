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

public class aip {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("location", fq.a())
                        .executes(
                           $$0x -> a(
                                 (ds)$$0x.getSource(),
                                 Collections.singleton(((ds)$$0x.getSource()).g()),
                                 ((ds)$$0x.getSource()).e(),
                                 fq.b($$0x, "location"),
                                 fs.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  dt.a("destination", ed.a())
                     .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).g()), ed.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ed.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("location", fq.a())
                                 .executes(
                                    $$0x -> a((ds)$$0x.getSource(), ed.b($$0x, "targets"), ((ds)$$0x.getSource()).e(), fq.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 dt.a("rotation", fn.a())
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ed.b($$0x, "targets"),
                                             ((ds)$$0x.getSource()).e(),
                                             fq.b($$0x, "location"),
                                             fn.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("facing")
                                    .then(
                                       dt.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("facingEntity", ed.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            ed.b($$0x, "targets"),
                                                            ((ds)$$0x.getSource()).e(),
                                                            fq.b($$0x, "location"),
                                                            null,
                                                            new aip.a(ed.a($$0x, "facingEntity"), ec.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("facingAnchor", ec.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ed.b($$0x, "targets"),
                                                               ((ds)$$0x.getSource()).e(),
                                                               fq.b($$0x, "location"),
                                                               null,
                                                               new aip.a(ed.a($$0x, "facingEntity"), ec.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("facingLocation", fq.a())
                                       .executes(
                                          $$0x -> a(
                                                (ds)$$0x.getSource(),
                                                ed.b($$0x, "targets"),
                                                ((ds)$$0x.getSource()).e(),
                                                fq.b($$0x, "location"),
                                                null,
                                                new aip.a(fq.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(dt.a("destination", ed.a()).executes($$0x -> a((ds)$$0x.getSource(), ed.b($$0x, "targets"), ed.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ds $$0, Collection<? extends big> $$1, big $$2) throws CommandSyntaxException {
      for (big $$3 : $$1) {
         a($$0, $$3, (aki)$$2.dK(), $$2.dp(), $$2.dr(), $$2.dv(), EnumSet.noneOf(bjk.class), $$2.dA(), $$2.dC(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.teleport.success.entity.single", $$1.iterator().next().H_(), $$2.H_()), true);
      } else {
         $$0.a(() -> te.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.H_()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<? extends big> $$1, aki $$2, fl $$3, @Nullable fl $$4, @Nullable aip.a $$5) throws CommandSyntaxException {
      ehf $$6 = $$3.a($$0);
      ehe $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bjk> $$8 = EnumSet.noneOf(bjk.class);
      if ($$3.a()) {
         $$8.add(bjk.a);
      }

      if ($$3.b()) {
         $$8.add(bjk.b);
      }

      if ($$3.c()) {
         $$8.add(bjk.c);
      }

      if ($$4 == null) {
         $$8.add(bjk.e);
         $$8.add(bjk.d);
      } else {
         if ($$4.a()) {
            $$8.add(bjk.e);
         }

         if ($$4.b()) {
            $$8.add(bjk.d);
         }
      }

      for (big $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dA(), $$9.dC(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.teleport.success.location.single", $$1.iterator().next().H_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> te.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ds $$0, big $$1, aki $$2, double $$3, double $$4, double $$5, Set<bjk> $$6, float $$7, float $$8, @Nullable aip.a $$9) throws CommandSyntaxException {
      gv $$10 = gv.a($$3, $$4, $$5);
      if (!cpk.k($$10)) {
         throw a.create();
      } else {
         float $$11 = aro.g($$7);
         float $$12 = aro.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.a($$0, $$1);
            }

            if (!($$1 instanceof biw $$13) || !$$13.fu()) {
               $$1.f($$1.dn().d(1.0, 0.0, 1.0));
               $$1.c(true);
            }

            if ($$1 instanceof bjf $$14) {
               $$14.H().n();
            }
         }
      }
   }

   static class a {
      private final ehf a;
      private final big b;
      private final ec.a c;

      public a(big $$0, ec.a $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$1.a($$0);
      }

      public a(ehf $$0) {
         this.b = null;
         this.a = $$0;
         this.c = null;
      }

      public void a(ds $$0, big $$1) {
         if (this.b != null) {
            if ($$1 instanceof akj) {
               ((akj)$$1).a($$0.m(), this.b, this.c);
            } else {
               $$1.a($$0.m(), this.a);
            }
         } else {
            $$1.a($$0.m(), this.a);
         }
      }
   }
}
