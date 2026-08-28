import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fdo {
   protected final fdd a;
   @Nullable
   private fdo[] b;

   protected fdo(fdd $$0) {
      this.a = $$0;
   }

   public double b(jo.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(jo.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public fcp a() {
      if (this.c()) {
         throw (UnsupportedOperationException)af.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new fcp(this.b(jo.a.a), this.b(jo.a.b), this.b(jo.a.c), this.c(jo.a.a), this.c(jo.a.b), this.c(jo.a.c));
      }
   }

   public fdo b() {
      return this.c() ? fdl.a() : fdl.a(this.b(jo.a.a), this.b(jo.a.b), this.b(jo.a.c), this.c(jo.a.a), this.c(jo.a.b), this.c(jo.a.c));
   }

   protected double a(jo.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   public abstract DoubleList a(jo.a var1);

   public boolean c() {
      return this.a.a();
   }

   public fdo a(fcu $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fdo a(kn $$0) {
      return this.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public fdo a(double $$0, double $$1, double $$2) {
      return (fdo)(this.c() ? fdl.a() : new fcw(this.a, new fdk(this.a(jo.a.a), $$0), new fdk(this.a(jo.a.b), $$1), new fdk(this.a(jo.a.c), $$2)));
   }

   public fdo d() {
      fdo[] $$0 = new fdo[]{fdl.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = fdl.b($$0[0], fdl.a($$1, $$2, $$3, $$4, $$5, $$6), fcy.o));
      return $$0[0];
   }

   public void a(fdl.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(jo.a.a, $$1), this.a(jo.a.b, $$2), this.a(jo.a.c, $$3), this.a(jo.a.a, $$4), this.a(jo.a.b, $$5), this.a(jo.a.c, $$6)
               ),
            true
         );
   }

   public void b(fdl.a $$0) {
      DoubleList $$1 = this.a(jo.a.a);
      DoubleList $$2 = this.a(jo.a.b);
      DoubleList $$3 = this.a(jo.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<fcp> e() {
      List<fcp> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new fcp($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(jo.a $$0, double $$1, double $$2) {
      jo.a $$3 = jg.b.a($$0);
      jo.a $$4 = jg.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(jo.a $$0, double $$1, double $$2) {
      jo.a $$3 = jg.b.a($$0);
      jo.a $$4 = jg.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(jo.a $$0, double $$1) {
      return azk.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public fcq a(fcu $$0, fcu $$1, jj $$2) {
      if (this.c()) {
         return null;
      } else {
         fcu $$3 = $$1.d($$0);
         if ($$3.h() < 1.0E-7) {
            return null;
         } else {
            fcu $$4 = $$0.e($$3.c(0.001));
            return this.a.e(this.a(jo.a.a, $$4.d - (double)$$2.u()), this.a(jo.a.b, $$4.e - (double)$$2.v()), this.a(jo.a.c, $$4.f - (double)$$2.w()))
               ? new fcq($$4, jo.a($$3.d, $$3.e, $$3.f).g(), $$2, true)
               : fcp.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<fcu> b(fcu $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         fcu[] $$1 = new fcu[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = azk.a($$0.a(), $$2, $$5);
            double $$9 = azk.a($$0.b(), $$3, $$6);
            double $$10 = azk.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new fcu($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public fdo a(jo $$0) {
      if (!this.c() && this != fdl.b()) {
         if (this.b != null) {
            fdo $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new fdo[6];
         }

         fdo $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private fdo b(jo $$0) {
      jo.a $$1 = $$0.o();
      if (this.d($$1)) {
         return this;
      } else {
         jo.b $$2 = $$0.f();
         int $$3 = this.a($$1, $$2 == jo.b.a ? 0.9999999 : 1.0E-7);
         fdm $$4 = new fdm(this, $$1, $$3);
         if ($$4.c()) {
            return fdl.a();
         } else {
            return (fdo)($$4.f() ? fdl.b() : $$4);
         }
      }
   }

   protected boolean f() {
      for (jo.a $$0 : jo.a.d) {
         if (!this.d($$0)) {
            return false;
         }
      }

      return true;
   }

   private boolean d(jo.a $$0) {
      DoubleList $$1 = this.a($$0);
      return $$1.size() == 2 && DoubleMath.fuzzyEquals($$1.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$1.getDouble(1), 1.0, 1.0E-7);
   }

   public double a(jo.a $$0, fcp $$1, double $$2) {
      return this.a(jg.a($$0, jo.a.a), $$1, $$2);
   }

   protected double a(jg $$0, fcp $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         jg $$3 = $$0.a();
         jo.a $$4 = $$3.a(jo.a.a);
         jo.a $$5 = $$3.a(jo.a.b);
         jo.a $$6 = $$3.a(jo.a.c);
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
