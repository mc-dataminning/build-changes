import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class aot {
   private static final int a = 10000;
   private static final Dynamic4CommandExceptionType b = new Dynamic4CommandExceptionType(
      ($$0, $$1, $$2, $$3) -> wo.b("commands.spreadplayers.failed.teams", $$0, $$1, $$2, $$3)
   );
   private static final Dynamic4CommandExceptionType c = new Dynamic4CommandExceptionType(
      ($$0, $$1, $$2, $$3) -> wo.b("commands.spreadplayers.failed.entities", $$0, $$1, $$2, $$3)
   );
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wo.b("commands.spreadplayers.failed.invalid.height", $$0, $$1)
   );

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spreadplayers").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("center", gz.a())
                  .then(
                     ey.a("spreadDistance", FloatArgumentType.floatArg(0.0F))
                        .then(
                           ((RequiredArgumentBuilder)ey.a("maxRange", FloatArgumentType.floatArg(1.0F))
                                 .then(
                                    ey.a("respectTeams", BoolArgumentType.bool())
                                       .then(
                                          ey.a("targets", fk.b())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      gz.a($$0x, "center"),
                                                      FloatArgumentType.getFloat($$0x, "spreadDistance"),
                                                      FloatArgumentType.getFloat($$0x, "maxRange"),
                                                      ((ex)$$0x.getSource()).e().an() + 1,
                                                      BoolArgumentType.getBool($$0x, "respectTeams"),
                                                      fk.b($$0x, "targets")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ey.a("under")
                                    .then(
                                       ey.a("maxHeight", IntegerArgumentType.integer())
                                          .then(
                                             ey.a("respectTeams", BoolArgumentType.bool())
                                                .then(
                                                   ey.a("targets", fk.b())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               gz.a($$0x, "center"),
                                                               FloatArgumentType.getFloat($$0x, "spreadDistance"),
                                                               FloatArgumentType.getFloat($$0x, "maxRange"),
                                                               IntegerArgumentType.getInteger($$0x, "maxHeight"),
                                                               BoolArgumentType.getBool($$0x, "respectTeams"),
                                                               fk.b($$0x, "targets")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, fax $$1, float $$2, float $$3, int $$4, boolean $$5, Collection<? extends buj> $$6) throws CommandSyntaxException {
      arc $$7 = $$0.e();
      int $$8 = $$7.L_();
      if ($$4 < $$8) {
         throw d.create($$4, $$8);
      } else {
         azg $$9 = azg.a();
         double $$10 = (double)($$1.i - $$3);
         double $$11 = (double)($$1.j - $$3);
         double $$12 = (double)($$1.i + $$3);
         double $$13 = (double)($$1.j + $$3);
         aot.a[] $$14 = a($$9, $$5 ? a($$6) : $$6.size(), $$10, $$11, $$12, $$13);
         a($$1, (double)$$2, $$7, $$9, $$10, $$11, $$12, $$13, $$4, $$14, $$5);
         double $$15 = a($$6, $$7, $$14, $$4, $$5);
         $$0.a(
            () -> wo.a("commands.spreadplayers.success." + ($$5 ? "teams" : "entities"), $$14.length, $$1.i, $$1.j, String.format(Locale.ROOT, "%.2f", $$15)),
            true
         );
         return $$14.length;
      }
   }

   private static int a(Collection<? extends buj> $$0) {
      Set<fcf> $$1 = Sets.newHashSet();

      for (buj $$2 : $$0) {
         if ($$2 instanceof cov) {
            $$1.add($$2.cr());
         } else {
            $$1.add(null);
         }
      }

      return $$1.size();
   }

   private static void a(fax $$0, double $$1, arc $$2, azg $$3, double $$4, double $$5, double $$6, double $$7, int $$8, aot.a[] $$9, boolean $$10) throws CommandSyntaxException {
      boolean $$11 = true;
      double $$12 = Float.MAX_VALUE;

      int $$13;
      for ($$13 = 0; $$13 < 10000 && $$11; $$13++) {
         $$11 = false;
         $$12 = Float.MAX_VALUE;

         for (int $$14 = 0; $$14 < $$9.length; $$14++) {
            aot.a $$15 = $$9[$$14];
            int $$16 = 0;
            aot.a $$17 = new aot.a();

            for (int $$18 = 0; $$18 < $$9.length; $$18++) {
               if ($$14 != $$18) {
                  aot.a $$19 = $$9[$$18];
                  double $$20 = $$15.a($$19);
                  $$12 = Math.min($$20, $$12);
                  if ($$20 < $$1) {
                     $$16++;
                     $$17.a = $$17.a + ($$19.a - $$15.a);
                     $$17.b = $$17.b + ($$19.b - $$15.b);
                  }
               }
            }

            if ($$16 > 0) {
               $$17.a /= (double)$$16;
               $$17.b /= (double)$$16;
               double $$21 = $$17.b();
               if ($$21 > 0.0) {
                  $$17.a();
                  $$15.b($$17);
               } else {
                  $$15.a($$3, $$4, $$5, $$6, $$7);
               }

               $$11 = true;
            }

            if ($$15.a($$4, $$5, $$6, $$7)) {
               $$11 = true;
            }
         }

         if (!$$11) {
            for (aot.a $$22 : $$9) {
               if (!$$22.b($$2, $$8)) {
                  $$22.a($$3, $$4, $$5, $$6, $$7);
                  $$11 = true;
               }
            }
         }
      }

      if ($$12 == Float.MAX_VALUE) {
         $$12 = 0.0;
      }

      if ($$13 >= 10000) {
         if ($$10) {
            throw b.create($$9.length, $$0.i, $$0.j, String.format(Locale.ROOT, "%.2f", $$12));
         } else {
            throw c.create($$9.length, $$0.i, $$0.j, String.format(Locale.ROOT, "%.2f", $$12));
         }
      }
   }

   private static double a(Collection<? extends buj> $$0, arc $$1, aot.a[] $$2, int $$3, boolean $$4) {
      double $$5 = 0.0;
      int $$6 = 0;
      Map<fcf, aot.a> $$7 = Maps.newHashMap();

      for (buj $$8 : $$0) {
         aot.a $$10;
         if ($$4) {
            fcf $$9 = $$8 instanceof cov ? $$8.cr() : null;
            if (!$$7.containsKey($$9)) {
               $$7.put($$9, $$2[$$6++]);
            }

            $$10 = $$7.get($$9);
         } else {
            $$10 = $$2[$$6++];
         }

         $$8.a($$1, (double)ayy.a($$10.a) + 0.5, (double)$$10.a($$1, $$3), (double)ayy.a($$10.b) + 0.5, Set.of(), $$8.dM(), $$8.dO(), true);
         double $$12 = Double.MAX_VALUE;

         for (aot.a $$13 : $$2) {
            if ($$10 != $$13) {
               double $$14 = $$10.a($$13);
               $$12 = Math.min($$14, $$12);
            }
         }

         $$5 += $$12;
      }

      return $$0.size() < 2 ? 0.0 : $$5 / (double)$$0.size();
   }

   private static aot.a[] a(azg $$0, int $$1, double $$2, double $$3, double $$4, double $$5) {
      aot.a[] $$6 = new aot.a[$$1];

      for (int $$7 = 0; $$7 < $$6.length; $$7++) {
         aot.a $$8 = new aot.a();
         $$8.a($$0, $$2, $$3, $$4, $$5);
         $$6[$$7] = $$8;
      }

      return $$6;
   }

   static class a {
      double a;
      double b;

      double a(aot.a $$0) {
         double $$1 = this.a - $$0.a;
         double $$2 = this.b - $$0.b;
         return Math.sqrt($$1 * $$1 + $$2 * $$2);
      }

      void a() {
         double $$0 = this.b();
         this.a /= $$0;
         this.b /= $$0;
      }

      double b() {
         return Math.sqrt(this.a * this.a + this.b * this.b);
      }

      public void b(aot.a $$0) {
         this.a = this.a - $$0.a;
         this.b = this.b - $$0.b;
      }

      public boolean a(double $$0, double $$1, double $$2, double $$3) {
         boolean $$4 = false;
         if (this.a < $$0) {
            this.a = $$0;
            $$4 = true;
         } else if (this.a > $$2) {
            this.a = $$2;
            $$4 = true;
         }

         if (this.b < $$1) {
            this.b = $$1;
            $$4 = true;
         } else if (this.b > $$3) {
            this.b = $$3;
            $$4 = true;
         }

         return $$4;
      }

      public int a(dfl $$0, int $$1) {
         ji.a $$2 = new ji.a(this.a, (double)($$1 + 1), this.b);
         boolean $$3 = $$0.a_($$2).l();
         $$2.c(jn.a);
         boolean $$4 = $$0.a_($$2).l();

         while ($$2.v() > $$0.L_()) {
            $$2.c(jn.a);
            boolean $$5 = $$0.a_($$2).l();
            if (!$$5 && $$4 && $$3) {
               return $$2.v() + 1;
            }

            $$3 = $$4;
            $$4 = $$5;
         }

         return $$1 + 1;
      }

      public boolean b(dfl $$0, int $$1) {
         ji $$2 = ji.a(this.a, (double)(this.a($$0, $$1) - 1), this.b);
         dwv $$3 = $$0.a_($$2);
         return $$2.v() < $$1 && !$$3.n() && !$$3.a(awo.aN);
      }

      public void a(azg $$0, double $$1, double $$2, double $$3, double $$4) {
         this.a = ayy.a($$0, $$1, $$3);
         this.b = ayy.a($$0, $$2, $$4);
      }
   }
}
