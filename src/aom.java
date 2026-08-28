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

public class aom {
   private static final int a = 10000;
   private static final Dynamic4CommandExceptionType b = new Dynamic4CommandExceptionType(
      ($$0, $$1, $$2, $$3) -> wy.b("commands.spreadplayers.failed.teams", $$0, $$1, $$2, $$3)
   );
   private static final Dynamic4CommandExceptionType c = new Dynamic4CommandExceptionType(
      ($$0, $$1, $$2, $$3) -> wy.b("commands.spreadplayers.failed.entities", $$0, $$1, $$2, $$3)
   );
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wy.b("commands.spreadplayers.failed.invalid.height", $$0, $$1)
   );

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("spreadplayers").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("center", gv.a())
                  .then(
                     eu.a("spreadDistance", FloatArgumentType.floatArg(0.0F))
                        .then(
                           ((RequiredArgumentBuilder)eu.a("maxRange", FloatArgumentType.floatArg(1.0F))
                                 .then(
                                    eu.a("respectTeams", BoolArgumentType.bool())
                                       .then(
                                          eu.a("targets", fg.b())
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      gv.a($$0x, "center"),
                                                      FloatArgumentType.getFloat($$0x, "spreadDistance"),
                                                      FloatArgumentType.getFloat($$0x, "maxRange"),
                                                      ((et)$$0x.getSource()).e().am(),
                                                      BoolArgumentType.getBool($$0x, "respectTeams"),
                                                      fg.b($$0x, "targets")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 eu.a("under")
                                    .then(
                                       eu.a("maxHeight", IntegerArgumentType.integer())
                                          .then(
                                             eu.a("respectTeams", BoolArgumentType.bool())
                                                .then(
                                                   eu.a("targets", fg.b())
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               gv.a($$0x, "center"),
                                                               FloatArgumentType.getFloat($$0x, "spreadDistance"),
                                                               FloatArgumentType.getFloat($$0x, "maxRange"),
                                                               IntegerArgumentType.getInteger($$0x, "maxHeight"),
                                                               BoolArgumentType.getBool($$0x, "respectTeams"),
                                                               fg.b($$0x, "targets")
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

   private static int a(et $$0, ewv $$1, float $$2, float $$3, int $$4, boolean $$5, Collection<? extends bsq> $$6) throws CommandSyntaxException {
      aqt $$7 = $$0.e();
      int $$8 = $$7.I_();
      if ($$4 < $$8) {
         throw d.create($$4, $$8);
      } else {
         ayv $$9 = ayv.a();
         double $$10 = (double)($$1.i - $$3);
         double $$11 = (double)($$1.j - $$3);
         double $$12 = (double)($$1.i + $$3);
         double $$13 = (double)($$1.j + $$3);
         aom.a[] $$14 = a($$9, $$5 ? a($$6) : $$6.size(), $$10, $$11, $$12, $$13);
         a($$1, (double)$$2, $$7, $$9, $$10, $$11, $$12, $$13, $$4, $$14, $$5);
         double $$15 = a($$6, $$7, $$14, $$4, $$5);
         $$0.a(
            () -> wy.a("commands.spreadplayers.success." + ($$5 ? "teams" : "entities"), $$14.length, $$1.i, $$1.j, String.format(Locale.ROOT, "%.2f", $$15)),
            true
         );
         return $$14.length;
      }
   }

   private static int a(Collection<? extends bsq> $$0) {
      Set<eyc> $$1 = Sets.newHashSet();

      for (bsq $$2 : $$0) {
         if ($$2 instanceof cmv) {
            $$1.add($$2.ck());
         } else {
            $$1.add(null);
         }
      }

      return $$1.size();
   }

   private static void a(ewv $$0, double $$1, aqt $$2, ayv $$3, double $$4, double $$5, double $$6, double $$7, int $$8, aom.a[] $$9, boolean $$10) throws CommandSyntaxException {
      boolean $$11 = true;
      double $$12 = Float.MAX_VALUE;

      int $$13;
      for ($$13 = 0; $$13 < 10000 && $$11; $$13++) {
         $$11 = false;
         $$12 = Float.MAX_VALUE;

         for (int $$14 = 0; $$14 < $$9.length; $$14++) {
            aom.a $$15 = $$9[$$14];
            int $$16 = 0;
            aom.a $$17 = new aom.a();

            for (int $$18 = 0; $$18 < $$9.length; $$18++) {
               if ($$14 != $$18) {
                  aom.a $$19 = $$9[$$18];
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
            for (aom.a $$22 : $$9) {
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

   private static double a(Collection<? extends bsq> $$0, aqt $$1, aom.a[] $$2, int $$3, boolean $$4) {
      double $$5 = 0.0;
      int $$6 = 0;
      Map<eyc, aom.a> $$7 = Maps.newHashMap();

      for (bsq $$8 : $$0) {
         aom.a $$10;
         if ($$4) {
            eyc $$9 = $$8 instanceof cmv ? $$8.ck() : null;
            if (!$$7.containsKey($$9)) {
               $$7.put($$9, $$2[$$6++]);
            }

            $$10 = $$7.get($$9);
         } else {
            $$10 = $$2[$$6++];
         }

         $$8.a($$1, (double)ayn.a($$10.a) + 0.5, (double)$$10.a($$1, $$3), (double)ayn.a($$10.b) + 0.5, Set.of(), $$8.dG(), $$8.dI());
         double $$12 = Double.MAX_VALUE;

         for (aom.a $$13 : $$2) {
            if ($$10 != $$13) {
               double $$14 = $$10.a($$13);
               $$12 = Math.min($$14, $$12);
            }
         }

         $$5 += $$12;
      }

      return $$0.size() < 2 ? 0.0 : $$5 / (double)$$0.size();
   }

   private static aom.a[] a(ayv $$0, int $$1, double $$2, double $$3, double $$4, double $$5) {
      aom.a[] $$6 = new aom.a[$$1];

      for (int $$7 = 0; $$7 < $$6.length; $$7++) {
         aom.a $$8 = new aom.a();
         $$8.a($$0, $$2, $$3, $$4, $$5);
         $$6[$$7] = $$8;
      }

      return $$6;
   }

   static class a {
      double a;
      double b;

      double a(aom.a $$0) {
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

      public void b(aom.a $$0) {
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

      public int a(dca $$0, int $$1) {
         jd.a $$2 = new jd.a(this.a, (double)($$1 + 1), this.b);
         boolean $$3 = $$0.a_($$2).i();
         $$2.c(ji.a);
         boolean $$4 = $$0.a_($$2).i();

         while ($$2.v() > $$0.I_()) {
            $$2.c(ji.a);
            boolean $$5 = $$0.a_($$2).i();
            if (!$$5 && $$4 && $$3) {
               return $$2.v() + 1;
            }

            $$3 = $$4;
            $$4 = $$5;
         }

         return $$1 + 1;
      }

      public boolean b(dca $$0, int $$1) {
         jd $$2 = jd.a(this.a, (double)(this.a($$0, $$1) - 1), this.b);
         dta $$3 = $$0.a_($$2);
         return $$2.v() < $$1 && !$$3.k() && !$$3.a(awd.aK);
      }

      public void a(ayv $$0, double $$1, double $$2, double $$3, double $$4) {
         this.a = ayn.a($$0, $$1, $$3);
         this.b = ayn.a($$0, $$2, $$4);
      }
   }
}
