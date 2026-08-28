import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fcr {
   protected final fcg a;
   @Nullable
   private fcr[] b;

   protected fcr(fcg $$0) {
      this.a = $$0;
   }

   public double b(jm.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(jm.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public fbs a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ae.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new fbs(this.b(jm.a.a), this.b(jm.a.b), this.b(jm.a.c), this.c(jm.a.a), this.c(jm.a.b), this.c(jm.a.c));
      }
   }

   public fcr b() {
      return this.c() ? fco.a() : fco.a(this.b(jm.a.a), this.b(jm.a.b), this.b(jm.a.c), this.c(jm.a.a), this.c(jm.a.b), this.c(jm.a.c));
   }

   protected double a(jm.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   public abstract DoubleList a(jm.a var1);

   public boolean c() {
      return this.a.a();
   }

   public fcr a(fbx $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fcr a(double $$0, double $$1, double $$2) {
      return (fcr)(this.c() ? fco.a() : new fbz(this.a, new fcn(this.a(jm.a.a), $$0), new fcn(this.a(jm.a.b), $$1), new fcn(this.a(jm.a.c), $$2)));
   }

   public fcr d() {
      fcr[] $$0 = new fcr[]{fco.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = fco.b($$0[0], fco.a($$1, $$2, $$3, $$4, $$5, $$6), fcb.o));
      return $$0[0];
   }

   public void a(fco.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(jm.a.a, $$1), this.a(jm.a.b, $$2), this.a(jm.a.c, $$3), this.a(jm.a.a, $$4), this.a(jm.a.b, $$5), this.a(jm.a.c, $$6)
               ),
            true
         );
   }

   public void b(fco.a $$0) {
      DoubleList $$1 = this.a(jm.a.a);
      DoubleList $$2 = this.a(jm.a.b);
      DoubleList $$3 = this.a(jm.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<fbs> e() {
      List<fbs> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new fbs($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(jm.a $$0, double $$1, double $$2) {
      jm.a $$3 = je.b.a($$0);
      jm.a $$4 = je.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(jm.a $$0, double $$1, double $$2) {
      jm.a $$3 = je.b.a($$0);
      jm.a $$4 = je.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(jm.a $$0, double $$1) {
      return bae.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public fbt a(fbx $$0, fbx $$1, jh $$2) {
      if (this.c()) {
         return null;
      } else {
         fbx $$3 = $$1.d($$0);
         if ($$3.h() < 1.0E-7) {
            return null;
         } else {
            fbx $$4 = $$0.e($$3.c(0.001));
            return this.a.e(this.a(jm.a.a, $$4.d - (double)$$2.u()), this.a(jm.a.b, $$4.e - (double)$$2.v()), this.a(jm.a.c, $$4.f - (double)$$2.w()))
               ? new fbt($$4, jm.a($$3.d, $$3.e, $$3.f).g(), $$2, true)
               : fbs.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<fbx> b(fbx $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         fbx[] $$1 = new fbx[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = bae.a($$0.a(), $$2, $$5);
            double $$9 = bae.a($$0.b(), $$3, $$6);
            double $$10 = bae.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new fbx($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public fcr a(jm $$0) {
      if (!this.c() && this != fco.b()) {
         if (this.b != null) {
            fcr $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new fcr[6];
         }

         fcr $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private fcr b(jm $$0) {
      jm.a $$1 = $$0.o();
      if (this.d($$1)) {
         return this;
      } else {
         jm.b $$2 = $$0.f();
         int $$3 = this.a($$1, $$2 == jm.b.a ? 0.9999999 : 1.0E-7);
         fcp $$4 = new fcp(this, $$1, $$3);
         if ($$4.c()) {
            return fco.a();
         } else {
            return (fcr)($$4.f() ? fco.b() : $$4);
         }
      }
   }

   protected boolean f() {
      for (jm.a $$0 : jm.a.d) {
         if (!this.d($$0)) {
            return false;
         }
      }

      return true;
   }

   private boolean d(jm.a $$0) {
      DoubleList $$1 = this.a($$0);
      return $$1.size() == 2 && DoubleMath.fuzzyEquals($$1.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$1.getDouble(1), 1.0, 1.0E-7);
   }

   public double a(jm.a $$0, fbs $$1, double $$2) {
      return this.a(je.a($$0, jm.a.a), $$1, $$2);
   }

   protected double a(je $$0, fbs $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         je $$3 = $$0.a();
         jm.a $$4 = $$3.a(jm.a.a);
         jm.a $$5 = $$3.a(jm.a.b);
         jm.a $$6 = $$3.a(jm.a.c);
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
