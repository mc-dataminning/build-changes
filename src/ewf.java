import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewf {
   protected final evv a;
   @Nullable
   private ewf[] b;

   ewf(evv $$0) {
      this.a = $$0;
   }

   public double b(je.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(je.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public evh a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new evh(this.b(je.a.a), this.b(je.a.b), this.b(je.a.c), this.c(je.a.a), this.c(je.a.b), this.c(je.a.c));
      }
   }

   public ewf b() {
      return this.c() ? ewc.a() : ewc.a(this.b(je.a.a), this.b(je.a.b), this.b(je.a.c), this.c(je.a.a), this.c(je.a.b), this.c(je.a.c));
   }

   protected double a(je.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   protected abstract DoubleList a(je.a var1);

   public boolean c() {
      return this.a.a();
   }

   public ewf a(double $$0, double $$1, double $$2) {
      return (ewf)(this.c() ? ewc.a() : new evo(this.a, new ewb(this.a(je.a.a), $$0), new ewb(this.a(je.a.b), $$1), new ewb(this.a(je.a.c), $$2)));
   }

   public ewf d() {
      ewf[] $$0 = new ewf[]{ewc.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = ewc.b($$0[0], ewc.a($$1, $$2, $$3, $$4, $$5, $$6), evq.o));
      return $$0[0];
   }

   public void a(ewc.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(je.a.a, $$1), this.a(je.a.b, $$2), this.a(je.a.c, $$3), this.a(je.a.a, $$4), this.a(je.a.b, $$5), this.a(je.a.c, $$6)
               ),
            true
         );
   }

   public void b(ewc.a $$0) {
      DoubleList $$1 = this.a(je.a.a);
      DoubleList $$2 = this.a(je.a.b);
      DoubleList $$3 = this.a(je.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<evh> e() {
      List<evh> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new evh($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(je.a $$0, double $$1, double $$2) {
      je.a $$3 = iw.b.a($$0);
      je.a $$4 = iw.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(je.a $$0, double $$1, double $$2) {
      je.a $$3 = iw.b.a($$0);
      je.a $$4 = iw.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(je.a $$0, double $$1) {
      return ayu.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public evi a(evm $$0, evm $$1, iz $$2) {
      if (this.c()) {
         return null;
      } else {
         evm $$3 = $$1.d($$0);
         if ($$3.g() < 1.0E-7) {
            return null;
         } else {
            evm $$4 = $$0.e($$3.a(0.001));
            return this.a.e(this.a(je.a.a, $$4.c - (double)$$2.u()), this.a(je.a.b, $$4.d - (double)$$2.v()), this.a(je.a.c, $$4.e - (double)$$2.w()))
               ? new evi($$4, je.a($$3.c, $$3.d, $$3.e).g(), $$2, true)
               : evh.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<evm> a(evm $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         evm[] $$1 = new evm[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = ayu.a($$0.a(), $$2, $$5);
            double $$9 = ayu.a($$0.b(), $$3, $$6);
            double $$10 = ayu.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new evm($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public ewf a(je $$0) {
      if (!this.c() && this != ewc.b()) {
         if (this.b != null) {
            ewf $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new ewf[6];
         }

         ewf $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private ewf b(je $$0) {
      je.a $$1 = $$0.o();
      DoubleList $$2 = this.a($$1);
      if ($$2.size() == 2 && DoubleMath.fuzzyEquals($$2.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$2.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         je.b $$3 = $$0.f();
         int $$4 = this.a($$1, $$3 == je.b.a ? 0.9999999 : 1.0E-7);
         return new ewd(this, $$1, $$4);
      }
   }

   public double a(je.a $$0, evh $$1, double $$2) {
      return this.a(iw.a($$0, je.a.a), $$1, $$2);
   }

   protected double a(iw $$0, evh $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         iw $$3 = $$0.a();
         je.a $$4 = $$3.a(je.a.a);
         je.a $$5 = $$3.a(je.a.b);
         je.a $$6 = $$3.a(je.a.c);
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
