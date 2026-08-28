import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fgk {
   protected final ffz a;
   @Nullable
   private fgk[] b;

   protected fgk(ffz $$0) {
      this.a = $$0;
   }

   public double b(jb.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(jb.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public ffl a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new ffl(this.b(jb.a.a), this.b(jb.a.b), this.b(jb.a.c), this.c(jb.a.a), this.c(jb.a.b), this.c(jb.a.c));
      }
   }

   public fgk b() {
      return this.c() ? fgh.a() : fgh.a(this.b(jb.a.a), this.b(jb.a.b), this.b(jb.a.c), this.c(jb.a.a), this.c(jb.a.b), this.c(jb.a.c));
   }

   protected double a(jb.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   public abstract DoubleList a(jb.a var1);

   public boolean c() {
      return this.a.a();
   }

   public fgk a(ffq $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fgk a(ka $$0) {
      return this.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public fgk a(double $$0, double $$1, double $$2) {
      return (fgk)(this.c() ? fgh.a() : new ffs(this.a, new fgg(this.a(jb.a.a), $$0), new fgg(this.a(jb.a.b), $$1), new fgg(this.a(jb.a.c), $$2)));
   }

   public fgk d() {
      fgk[] $$0 = new fgk[]{fgh.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = fgh.b($$0[0], fgh.a($$1, $$2, $$3, $$4, $$5, $$6), ffu.o));
      return $$0[0];
   }

   public void a(fgh.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(jb.a.a, $$1), this.a(jb.a.b, $$2), this.a(jb.a.c, $$3), this.a(jb.a.a, $$4), this.a(jb.a.b, $$5), this.a(jb.a.c, $$6)
               ),
            true
         );
   }

   public void b(fgh.a $$0) {
      DoubleList $$1 = this.a(jb.a.a);
      DoubleList $$2 = this.a(jb.a.b);
      DoubleList $$3 = this.a(jb.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<ffl> e() {
      List<ffl> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new ffl($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(jb.a $$0, double $$1, double $$2) {
      jb.a $$3 = is.b.a($$0);
      jb.a $$4 = is.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(jb.a $$0, double $$1, double $$2) {
      jb.a $$3 = is.b.a($$0);
      jb.a $$4 = is.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(jb.a $$0, double $$1) {
      return azo.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public ffm a(ffq $$0, ffq $$1, iv $$2) {
      if (this.c()) {
         return null;
      } else {
         ffq $$3 = $$1.d($$0);
         if ($$3.h() < 1.0E-7) {
            return null;
         } else {
            ffq $$4 = $$0.e($$3.c(0.001));
            return this.a.e(this.a(jb.a.a, $$4.d - (double)$$2.u()), this.a(jb.a.b, $$4.e - (double)$$2.v()), this.a(jb.a.c, $$4.f - (double)$$2.w()))
               ? new ffm($$4, jb.a($$3.d, $$3.e, $$3.f).g(), $$2, true)
               : ffl.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<ffq> b(ffq $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         ffq[] $$1 = new ffq[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = azo.a($$0.a(), $$2, $$5);
            double $$9 = azo.a($$0.b(), $$3, $$6);
            double $$10 = azo.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new ffq($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public fgk a(jb $$0) {
      if (!this.c() && this != fgh.b()) {
         if (this.b != null) {
            fgk $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new fgk[6];
         }

         fgk $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private fgk b(jb $$0) {
      jb.a $$1 = $$0.o();
      if (this.d($$1)) {
         return this;
      } else {
         jb.b $$2 = $$0.f();
         int $$3 = this.a($$1, $$2 == jb.b.a ? 0.9999999 : 1.0E-7);
         fgi $$4 = new fgi(this, $$1, $$3);
         if ($$4.c()) {
            return fgh.a();
         } else {
            return (fgk)($$4.f() ? fgh.b() : $$4);
         }
      }
   }

   protected boolean f() {
      for (jb.a $$0 : jb.a.d) {
         if (!this.d($$0)) {
            return false;
         }
      }

      return true;
   }

   private boolean d(jb.a $$0) {
      DoubleList $$1 = this.a($$0);
      return $$1.size() == 2 && DoubleMath.fuzzyEquals($$1.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$1.getDouble(1), 1.0, 1.0E-7);
   }

   public double a(jb.a $$0, ffl $$1, double $$2) {
      return this.a(is.a($$0, jb.a.a), $$1, $$2);
   }

   protected double a(is $$0, ffl $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         is $$3 = $$0.a();
         jb.a $$4 = $$3.a(jb.a.a);
         jb.a $$5 = $$3.a(jb.a.b);
         jb.a $$6 = $$3.a(jb.a.c);
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
   public boolean equals(Object $$0) {
      return super.equals($$0);
   }

   @Override
   public String toString() {
      return this.c() ? "EMPTY" : "VoxelShape[" + this.a() + "]";
   }
}
