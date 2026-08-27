import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ekn {
   protected final ekd a;
   @Nullable
   private ekn[] b;

   ekn(ekd $$0) {
      this.a = $$0;
   }

   public double b(hx.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(hx.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public ejp a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new ejp(this.b(hx.a.a), this.b(hx.a.b), this.b(hx.a.c), this.c(hx.a.a), this.c(hx.a.b), this.c(hx.a.c));
      }
   }

   public ekn b() {
      return this.c() ? ekk.a() : ekk.a(this.b(hx.a.a), this.b(hx.a.b), this.b(hx.a.c), this.c(hx.a.a), this.c(hx.a.b), this.c(hx.a.c));
   }

   protected double a(hx.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   protected abstract DoubleList a(hx.a var1);

   public boolean c() {
      return this.a.a();
   }

   public ekn a(double $$0, double $$1, double $$2) {
      return (ekn)(this.c() ? ekk.a() : new ejw(this.a, new ekj(this.a(hx.a.a), $$0), new ekj(this.a(hx.a.b), $$1), new ekj(this.a(hx.a.c), $$2)));
   }

   public ekn d() {
      ekn[] $$0 = new ekn[]{ekk.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = ekk.b($$0[0], ekk.a($$1, $$2, $$3, $$4, $$5, $$6), ejy.o));
      return $$0[0];
   }

   public void a(ekk.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(hx.a.a, $$1), this.a(hx.a.b, $$2), this.a(hx.a.c, $$3), this.a(hx.a.a, $$4), this.a(hx.a.b, $$5), this.a(hx.a.c, $$6)
               ),
            true
         );
   }

   public void b(ekk.a $$0) {
      DoubleList $$1 = this.a(hx.a.a);
      DoubleList $$2 = this.a(hx.a.b);
      DoubleList $$3 = this.a(hx.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<ejp> e() {
      List<ejp> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new ejp($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(hx.a $$0, double $$1, double $$2) {
      hx.a $$3 = hr.b.a($$0);
      hx.a $$4 = hr.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(hx.a $$0, double $$1, double $$2) {
      hx.a $$3 = hr.b.a($$0);
      hx.a $$4 = hr.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(hx.a $$0, double $$1) {
      return atm.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public ejq a(eju $$0, eju $$1, ht $$2) {
      if (this.c()) {
         return null;
      } else {
         eju $$3 = $$1.d($$0);
         if ($$3.g() < 1.0E-7) {
            return null;
         } else {
            eju $$4 = $$0.e($$3.a(0.001));
            return this.a.d(this.a(hx.a.a, $$4.c - (double)$$2.u()), this.a(hx.a.b, $$4.d - (double)$$2.v()), this.a(hx.a.c, $$4.e - (double)$$2.w()))
               ? new ejq($$4, hx.a($$3.c, $$3.d, $$3.e).g(), $$2, true)
               : ejp.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<eju> a(eju $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         eju[] $$1 = new eju[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = atm.a($$0.a(), $$2, $$5);
            double $$9 = atm.a($$0.b(), $$3, $$6);
            double $$10 = atm.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new eju($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public ekn a(hx $$0) {
      if (!this.c() && this != ekk.b()) {
         if (this.b != null) {
            ekn $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new ekn[6];
         }

         ekn $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private ekn b(hx $$0) {
      hx.a $$1 = $$0.o();
      DoubleList $$2 = this.a($$1);
      if ($$2.size() == 2 && DoubleMath.fuzzyEquals($$2.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$2.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         hx.b $$3 = $$0.f();
         int $$4 = this.a($$1, $$3 == hx.b.a ? 0.9999999 : 1.0E-7);
         return new ekl(this, $$1, $$4);
      }
   }

   public double a(hx.a $$0, ejp $$1, double $$2) {
      return this.a(hr.a($$0, hx.a.a), $$1, $$2);
   }

   protected double a(hr $$0, ejp $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         hr $$3 = $$0.a();
         hx.a $$4 = $$3.a(hx.a.a);
         hx.a $$5 = $$3.a(hx.a.b);
         hx.a $$6 = $$3.a(hx.a.c);
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
