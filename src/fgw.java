import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fgw {
   protected final fgl a;
   @Nullable
   private fgw[] b;

   protected fgw(fgl $$0) {
      this.a = $$0;
   }

   public double b(jc.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(jc.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public ffx a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new ffx(this.b(jc.a.a), this.b(jc.a.b), this.b(jc.a.c), this.c(jc.a.a), this.c(jc.a.b), this.c(jc.a.c));
      }
   }

   public fgw b() {
      return this.c() ? fgt.a() : fgt.a(this.b(jc.a.a), this.b(jc.a.b), this.b(jc.a.c), this.c(jc.a.a), this.c(jc.a.b), this.c(jc.a.c));
   }

   protected double a(jc.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   public abstract DoubleList a(jc.a var1);

   public boolean c() {
      return this.a.a();
   }

   public fgw a(fgc $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fgw a(kb $$0) {
      return this.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public fgw a(double $$0, double $$1, double $$2) {
      return (fgw)(this.c() ? fgt.a() : new fge(this.a, new fgs(this.a(jc.a.a), $$0), new fgs(this.a(jc.a.b), $$1), new fgs(this.a(jc.a.c), $$2)));
   }

   public fgw d() {
      fgw[] $$0 = new fgw[]{fgt.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = fgt.b($$0[0], fgt.a($$1, $$2, $$3, $$4, $$5, $$6), fgg.o));
      return $$0[0];
   }

   public void a(fgt.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(jc.a.a, $$1), this.a(jc.a.b, $$2), this.a(jc.a.c, $$3), this.a(jc.a.a, $$4), this.a(jc.a.b, $$5), this.a(jc.a.c, $$6)
               ),
            true
         );
   }

   public void b(fgt.a $$0) {
      DoubleList $$1 = this.a(jc.a.a);
      DoubleList $$2 = this.a(jc.a.b);
      DoubleList $$3 = this.a(jc.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<ffx> e() {
      List<ffx> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new ffx($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(jc.a $$0, double $$1, double $$2) {
      jc.a $$3 = it.b.a($$0);
      jc.a $$4 = it.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(jc.a $$0, double $$1, double $$2) {
      jc.a $$3 = it.b.a($$0);
      jc.a $$4 = it.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(jc.a $$0, double $$1) {
      return azz.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public ffy a(fgc $$0, fgc $$1, iw $$2) {
      if (this.c()) {
         return null;
      } else {
         fgc $$3 = $$1.d($$0);
         if ($$3.h() < 1.0E-7) {
            return null;
         } else {
            fgc $$4 = $$0.e($$3.c(0.001));
            return this.a.e(this.a(jc.a.a, $$4.d - (double)$$2.u()), this.a(jc.a.b, $$4.e - (double)$$2.v()), this.a(jc.a.c, $$4.f - (double)$$2.w()))
               ? new ffy($$4, jc.a($$3.d, $$3.e, $$3.f).g(), $$2, true)
               : ffx.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<fgc> b(fgc $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         fgc[] $$1 = new fgc[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = azz.a($$0.a(), $$2, $$5);
            double $$9 = azz.a($$0.b(), $$3, $$6);
            double $$10 = azz.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new fgc($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public fgw a(jc $$0) {
      if (!this.c() && this != fgt.b()) {
         if (this.b != null) {
            fgw $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new fgw[6];
         }

         fgw $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private fgw b(jc $$0) {
      jc.a $$1 = $$0.o();
      if (this.d($$1)) {
         return this;
      } else {
         jc.b $$2 = $$0.f();
         int $$3 = this.a($$1, $$2 == jc.b.a ? 0.9999999 : 1.0E-7);
         fgu $$4 = new fgu(this, $$1, $$3);
         if ($$4.c()) {
            return fgt.a();
         } else {
            return (fgw)($$4.f() ? fgt.b() : $$4);
         }
      }
   }

   protected boolean f() {
      for (jc.a $$0 : jc.a.d) {
         if (!this.d($$0)) {
            return false;
         }
      }

      return true;
   }

   private boolean d(jc.a $$0) {
      DoubleList $$1 = this.a($$0);
      return $$1.size() == 2 && DoubleMath.fuzzyEquals($$1.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$1.getDouble(1), 1.0, 1.0E-7);
   }

   public double a(jc.a $$0, ffx $$1, double $$2) {
      return this.a(it.a($$0, jc.a.a), $$1, $$2);
   }

   protected double a(it $$0, ffx $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         it $$3 = $$0.a();
         jc.a $$4 = $$3.a(jc.a.a);
         jc.a $$5 = $$3.a(jc.a.b);
         jc.a $$6 = $$3.a(jc.a.c);
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
