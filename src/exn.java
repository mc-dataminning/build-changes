import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exn {
   protected final exd a;
   @Nullable
   private exn[] b;

   exn(exd $$0) {
      this.a = $$0;
   }

   public double b(iw.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(iw.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public ewp a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ad.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new ewp(this.b(iw.a.a), this.b(iw.a.b), this.b(iw.a.c), this.c(iw.a.a), this.c(iw.a.b), this.c(iw.a.c));
      }
   }

   public exn b() {
      return this.c() ? exk.a() : exk.a(this.b(iw.a.a), this.b(iw.a.b), this.b(iw.a.c), this.c(iw.a.a), this.c(iw.a.b), this.c(iw.a.c));
   }

   protected double a(iw.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   protected abstract DoubleList a(iw.a var1);

   public boolean c() {
      return this.a.a();
   }

   public exn a(double $$0, double $$1, double $$2) {
      return (exn)(this.c() ? exk.a() : new eww(this.a, new exj(this.a(iw.a.a), $$0), new exj(this.a(iw.a.b), $$1), new exj(this.a(iw.a.c), $$2)));
   }

   public exn d() {
      exn[] $$0 = new exn[]{exk.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = exk.b($$0[0], exk.a($$1, $$2, $$3, $$4, $$5, $$6), ewy.o));
      return $$0[0];
   }

   public void a(exk.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(iw.a.a, $$1), this.a(iw.a.b, $$2), this.a(iw.a.c, $$3), this.a(iw.a.a, $$4), this.a(iw.a.b, $$5), this.a(iw.a.c, $$6)
               ),
            true
         );
   }

   public void b(exk.a $$0) {
      DoubleList $$1 = this.a(iw.a.a);
      DoubleList $$2 = this.a(iw.a.b);
      DoubleList $$3 = this.a(iw.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<ewp> e() {
      List<ewp> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new ewp($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(iw.a $$0, double $$1, double $$2) {
      iw.a $$3 = io.b.a($$0);
      iw.a $$4 = io.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(iw.a $$0, double $$1, double $$2) {
      iw.a $$3 = io.b.a($$0);
      iw.a $$4 = io.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(iw.a $$0, double $$1) {
      return aym.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public ewq a(ewu $$0, ewu $$1, ir $$2) {
      if (this.c()) {
         return null;
      } else {
         ewu $$3 = $$1.d($$0);
         if ($$3.g() < 1.0E-7) {
            return null;
         } else {
            ewu $$4 = $$0.e($$3.a(0.001));
            return this.a.e(this.a(iw.a.a, $$4.c - (double)$$2.u()), this.a(iw.a.b, $$4.d - (double)$$2.v()), this.a(iw.a.c, $$4.e - (double)$$2.w()))
               ? new ewq($$4, iw.a($$3.c, $$3.d, $$3.e).g(), $$2, true)
               : ewp.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<ewu> a(ewu $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         ewu[] $$1 = new ewu[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = aym.a($$0.a(), $$2, $$5);
            double $$9 = aym.a($$0.b(), $$3, $$6);
            double $$10 = aym.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new ewu($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public exn a(iw $$0) {
      if (!this.c() && this != exk.b()) {
         if (this.b != null) {
            exn $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new exn[6];
         }

         exn $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private exn b(iw $$0) {
      iw.a $$1 = $$0.o();
      DoubleList $$2 = this.a($$1);
      if ($$2.size() == 2 && DoubleMath.fuzzyEquals($$2.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$2.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         iw.b $$3 = $$0.f();
         int $$4 = this.a($$1, $$3 == iw.b.a ? 0.9999999 : 1.0E-7);
         return new exl(this, $$1, $$4);
      }
   }

   public double a(iw.a $$0, ewp $$1, double $$2) {
      return this.a(io.a($$0, iw.a.a), $$1, $$2);
   }

   protected double a(io $$0, ewp $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         io $$3 = $$0.a();
         iw.a $$4 = $$3.a(iw.a.a);
         iw.a $$5 = $$3.a(iw.a.b);
         iw.a $$6 = $$3.a(iw.a.c);
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
