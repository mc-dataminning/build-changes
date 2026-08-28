import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ezq {
   protected final ezf a;
   @Nullable
   private ezq[] b;

   protected ezq(ezf $$0) {
      this.a = $$0;
   }

   public double b(jk.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(jk.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public eyr a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new eyr(this.b(jk.a.a), this.b(jk.a.b), this.b(jk.a.c), this.c(jk.a.a), this.c(jk.a.b), this.c(jk.a.c));
      }
   }

   public ezq b() {
      return this.c() ? ezn.a() : ezn.a(this.b(jk.a.a), this.b(jk.a.b), this.b(jk.a.c), this.c(jk.a.a), this.c(jk.a.b), this.c(jk.a.c));
   }

   protected double a(jk.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   public abstract DoubleList a(jk.a var1);

   public boolean c() {
      return this.a.a();
   }

   public ezq a(double $$0, double $$1, double $$2) {
      return (ezq)(this.c() ? ezn.a() : new eyy(this.a, new ezm(this.a(jk.a.a), $$0), new ezm(this.a(jk.a.b), $$1), new ezm(this.a(jk.a.c), $$2)));
   }

   public ezq d() {
      ezq[] $$0 = new ezq[]{ezn.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = ezn.b($$0[0], ezn.a($$1, $$2, $$3, $$4, $$5, $$6), eza.o));
      return $$0[0];
   }

   public void a(ezn.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(jk.a.a, $$1), this.a(jk.a.b, $$2), this.a(jk.a.c, $$3), this.a(jk.a.a, $$4), this.a(jk.a.b, $$5), this.a(jk.a.c, $$6)
               ),
            true
         );
   }

   public void b(ezn.a $$0) {
      DoubleList $$1 = this.a(jk.a.a);
      DoubleList $$2 = this.a(jk.a.b);
      DoubleList $$3 = this.a(jk.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<eyr> e() {
      List<eyr> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new eyr($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(jk.a $$0, double $$1, double $$2) {
      jk.a $$3 = jc.b.a($$0);
      jk.a $$4 = jc.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(jk.a $$0, double $$1, double $$2) {
      jk.a $$3 = jc.b.a($$0);
      jk.a $$4 = jc.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(jk.a $$0, double $$1) {
      return azf.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public eys a(eyw $$0, eyw $$1, jf $$2) {
      if (this.c()) {
         return null;
      } else {
         eyw $$3 = $$1.d($$0);
         if ($$3.h() < 1.0E-7) {
            return null;
         } else {
            eyw $$4 = $$0.e($$3.c(0.001));
            return this.a.e(this.a(jk.a.a, $$4.d - (double)$$2.u()), this.a(jk.a.b, $$4.e - (double)$$2.v()), this.a(jk.a.c, $$4.f - (double)$$2.w()))
               ? new eys($$4, jk.a($$3.d, $$3.e, $$3.f).g(), $$2, true)
               : eyr.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<eyw> a(eyw $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         eyw[] $$1 = new eyw[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = azf.a($$0.a(), $$2, $$5);
            double $$9 = azf.a($$0.b(), $$3, $$6);
            double $$10 = azf.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new eyw($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public ezq a(jk $$0) {
      if (!this.c() && this != ezn.b()) {
         if (this.b != null) {
            ezq $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new ezq[6];
         }

         ezq $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private ezq b(jk $$0) {
      jk.a $$1 = $$0.o();
      if (this.d($$1)) {
         return this;
      } else {
         jk.b $$2 = $$0.f();
         int $$3 = this.a($$1, $$2 == jk.b.a ? 0.9999999 : 1.0E-7);
         ezo $$4 = new ezo(this, $$1, $$3);
         if ($$4.c()) {
            return ezn.a();
         } else {
            return (ezq)($$4.f() ? ezn.b() : $$4);
         }
      }
   }

   protected boolean f() {
      for (jk.a $$0 : jk.a.d) {
         if (!this.d($$0)) {
            return false;
         }
      }

      return true;
   }

   private boolean d(jk.a $$0) {
      DoubleList $$1 = this.a($$0);
      return $$1.size() == 2 && DoubleMath.fuzzyEquals($$1.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$1.getDouble(1), 1.0, 1.0E-7);
   }

   public double a(jk.a $$0, eyr $$1, double $$2) {
      return this.a(jc.a($$0, jk.a.a), $$1, $$2);
   }

   protected double a(jc $$0, eyr $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         jc $$3 = $$0.a();
         jk.a $$4 = $$3.a(jk.a.a);
         jk.a $$5 = $$3.a(jk.a.b);
         jk.a $$6 = $$3.a(jk.a.c);
         double $$7 = $$1.b($$4);
         double $$8 = $$1.a($$4);
         int $$9 = this.a($$4, $$8 + 1.0E-7);
         int $$10 = this.a($$4, $$7 - 1.0E-7);
         int $$11 = Math.max(0, this.a($$5, $$1.a($$5) + 1.0E-7));
         int $$12 = Math.min(this.a.c($$5), this.a($$5, $$1.b($$5) - 1.0E-7) + 1);
         int $$13 = Math.max(0, this.a($$6, $$1.a($$6) + 1.0E-7));
         int $$14 = Math.min(this.a.c($$6), this.a($$6, $$1.b($$6) - 1.0E-7) + 1);
         int $$15 = this.a.c($$4);
         if ($$2 > 0.0) {
            for (int $$16 = $$10 + 1; $$16 < $$15; $$16++) {
               for (int $$17 = $$11; $$17 < $$12; $$17++) {
                  for (int $$18 = $$13; $$18 < $$14; $$18++) {
                     if (this.a.a($$3, $$16, $$17, $$18)) {
                        double $$19 = this.a($$4, $$16) - $$7;
                        if ($$19 >= -1.0E-7) {
                           $$2 = Math.min($$2, $$19);
                        }

                        return $$2;
                     }
                  }
               }
            }
         } else if ($$2 < 0.0) {
            for (int $$20 = $$9 - 1; $$20 >= 0; $$20--) {
               for (int $$21 = $$11; $$21 < $$12; $$21++) {
                  for (int $$22 = $$13; $$22 < $$14; $$22++) {
                     if (this.a.a($$3, $$20, $$21, $$22)) {
                        double $$23 = this.a($$4, $$20 + 1) - $$8;
                        if ($$23 <= 1.0E-7) {
                           $$2 = Math.max($$2, $$23);
                        }

                        return $$2;
                     }
                  }
               }
            }
         }

         return $$2;
      }
   }

   @Override
   public String toString() {
      return this.c() ? "EMPTY" : "VoxelShape[" + this.a() + "]";
   }
}
