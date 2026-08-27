import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eib {
   protected final ehr a;
   @Nullable
   private eib[] b;

   eib(ehr $$0) {
      this.a = $$0;
   }

   public double b(hc.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(hc.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public ehd a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new ehd(this.b(hc.a.a), this.b(hc.a.b), this.b(hc.a.c), this.c(hc.a.a), this.c(hc.a.b), this.c(hc.a.c));
      }
   }

   public eib b() {
      return this.c() ? ehy.a() : ehy.a(this.b(hc.a.a), this.b(hc.a.b), this.b(hc.a.c), this.c(hc.a.a), this.c(hc.a.b), this.c(hc.a.c));
   }

   protected double a(hc.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   protected abstract DoubleList a(hc.a var1);

   public boolean c() {
      return this.a.a();
   }

   public eib a(double $$0, double $$1, double $$2) {
      return (eib)(this.c() ? ehy.a() : new ehk(this.a, new ehx(this.a(hc.a.a), $$0), new ehx(this.a(hc.a.b), $$1), new ehx(this.a(hc.a.c), $$2)));
   }

   public eib d() {
      eib[] $$0 = new eib[]{ehy.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = ehy.b($$0[0], ehy.a($$1, $$2, $$3, $$4, $$5, $$6), ehm.o));
      return $$0[0];
   }

   public void a(ehy.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(hc.a.a, $$1), this.a(hc.a.b, $$2), this.a(hc.a.c, $$3), this.a(hc.a.a, $$4), this.a(hc.a.b, $$5), this.a(hc.a.c, $$6)
               ),
            true
         );
   }

   public void b(ehy.a $$0) {
      DoubleList $$1 = this.a(hc.a.a);
      DoubleList $$2 = this.a(hc.a.b);
      DoubleList $$3 = this.a(hc.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<ehd> e() {
      List<ehd> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new ehd($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(hc.a $$0, double $$1, double $$2) {
      hc.a $$3 = gu.b.a($$0);
      hc.a $$4 = gu.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(hc.a $$0, double $$1, double $$2) {
      hc.a $$3 = gu.b.a($$0);
      hc.a $$4 = gu.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(hc.a $$0, double $$1) {
      return ars.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public ehe a(ehi $$0, ehi $$1, gw $$2) {
      if (this.c()) {
         return null;
      } else {
         ehi $$3 = $$1.d($$0);
         if ($$3.g() < 1.0E-7) {
            return null;
         } else {
            ehi $$4 = $$0.e($$3.a(0.001));
            return this.a.d(this.a(hc.a.a, $$4.c - (double)$$2.u()), this.a(hc.a.b, $$4.d - (double)$$2.v()), this.a(hc.a.c, $$4.e - (double)$$2.w()))
               ? new ehe($$4, hc.a($$3.c, $$3.d, $$3.e).g(), $$2, true)
               : ehd.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<ehi> a(ehi $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         ehi[] $$1 = new ehi[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = ars.a($$0.a(), $$2, $$5);
            double $$9 = ars.a($$0.b(), $$3, $$6);
            double $$10 = ars.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new ehi($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public eib a(hc $$0) {
      if (!this.c() && this != ehy.b()) {
         if (this.b != null) {
            eib $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new eib[6];
         }

         eib $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private eib b(hc $$0) {
      hc.a $$1 = $$0.o();
      DoubleList $$2 = this.a($$1);
      if ($$2.size() == 2 && DoubleMath.fuzzyEquals($$2.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$2.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         hc.b $$3 = $$0.f();
         int $$4 = this.a($$1, $$3 == hc.b.a ? 0.9999999 : 1.0E-7);
         return new ehz(this, $$1, $$4);
      }
   }

   public double a(hc.a $$0, ehd $$1, double $$2) {
      return this.a(gu.a($$0, hc.a.a), $$1, $$2);
   }

   protected double a(gu $$0, ehd $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         gu $$3 = $$0.a();
         hc.a $$4 = $$3.a(hc.a.a);
         hc.a $$5 = $$3.a(hc.a.b);
         hc.a $$6 = $$3.a(hc.a.c);
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
