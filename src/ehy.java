import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ehy {
   protected final eho a;
   @Nullable
   private ehy[] b;

   ehy(eho $$0) {
      this.a = $$0;
   }

   public double b(hb.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(hb.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public eha a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new eha(this.b(hb.a.a), this.b(hb.a.b), this.b(hb.a.c), this.c(hb.a.a), this.c(hb.a.b), this.c(hb.a.c));
      }
   }

   public ehy b() {
      return this.c() ? ehv.a() : ehv.a(this.b(hb.a.a), this.b(hb.a.b), this.b(hb.a.c), this.c(hb.a.a), this.c(hb.a.b), this.c(hb.a.c));
   }

   protected double a(hb.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   protected abstract DoubleList a(hb.a var1);

   public boolean c() {
      return this.a.a();
   }

   public ehy a(double $$0, double $$1, double $$2) {
      return (ehy)(this.c() ? ehv.a() : new ehh(this.a, new ehu(this.a(hb.a.a), $$0), new ehu(this.a(hb.a.b), $$1), new ehu(this.a(hb.a.c), $$2)));
   }

   public ehy d() {
      ehy[] $$0 = new ehy[]{ehv.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = ehv.b($$0[0], ehv.a($$1, $$2, $$3, $$4, $$5, $$6), ehj.o));
      return $$0[0];
   }

   public void a(ehv.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(hb.a.a, $$1), this.a(hb.a.b, $$2), this.a(hb.a.c, $$3), this.a(hb.a.a, $$4), this.a(hb.a.b, $$5), this.a(hb.a.c, $$6)
               ),
            true
         );
   }

   public void b(ehv.a $$0) {
      DoubleList $$1 = this.a(hb.a.a);
      DoubleList $$2 = this.a(hb.a.b);
      DoubleList $$3 = this.a(hb.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<eha> e() {
      List<eha> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new eha($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(hb.a $$0, double $$1, double $$2) {
      hb.a $$3 = gt.b.a($$0);
      hb.a $$4 = gt.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(hb.a $$0, double $$1, double $$2) {
      hb.a $$3 = gt.b.a($$0);
      hb.a $$4 = gt.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(hb.a $$0, double $$1) {
      return aro.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public ehb a(ehf $$0, ehf $$1, gv $$2) {
      if (this.c()) {
         return null;
      } else {
         ehf $$3 = $$1.d($$0);
         if ($$3.g() < 1.0E-7) {
            return null;
         } else {
            ehf $$4 = $$0.e($$3.a(0.001));
            return this.a.d(this.a(hb.a.a, $$4.c - (double)$$2.u()), this.a(hb.a.b, $$4.d - (double)$$2.v()), this.a(hb.a.c, $$4.e - (double)$$2.w()))
               ? new ehb($$4, hb.a($$3.c, $$3.d, $$3.e).g(), $$2, true)
               : eha.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<ehf> a(ehf $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         ehf[] $$1 = new ehf[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = aro.a($$0.a(), $$2, $$5);
            double $$9 = aro.a($$0.b(), $$3, $$6);
            double $$10 = aro.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new ehf($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public ehy a(hb $$0) {
      if (!this.c() && this != ehv.b()) {
         if (this.b != null) {
            ehy $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new ehy[6];
         }

         ehy $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private ehy b(hb $$0) {
      hb.a $$1 = $$0.o();
      DoubleList $$2 = this.a($$1);
      if ($$2.size() == 2 && DoubleMath.fuzzyEquals($$2.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$2.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         hb.b $$3 = $$0.f();
         int $$4 = this.a($$1, $$3 == hb.b.a ? 0.9999999 : 1.0E-7);
         return new ehw(this, $$1, $$4);
      }
   }

   public double a(hb.a $$0, eha $$1, double $$2) {
      return this.a(gt.a($$0, hb.a.a), $$1, $$2);
   }

   protected double a(gt $$0, eha $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         gt $$3 = $$0.a();
         hb.a $$4 = $$3.a(hb.a.a);
         hb.a $$5 = $$3.a(hb.a.b);
         hb.a $$6 = $$3.a(hb.a.c);
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
