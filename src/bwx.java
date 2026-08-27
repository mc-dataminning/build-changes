import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bwx extends bwl {
   protected final bpw a;
   private final double b;
   @Nullable
   private ejc c;
   private ib d;
   private final boolean e;
   private final List<ib> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bwx(bpw $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bwl.a.a));
      if (!caj.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!caj.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dM().P()) {
            return false;
         } else {
            apf $$0 = (apf)this.a.dM();
            ib $$1 = this.a.dm();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               epr $$2 = cal.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<ib> $$3x = $$0.y().d($$0xx -> $$0xx.a(auy.b), this::a, $$2x, 10, car.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<ib> $$3 = $$0.y().d($$0x -> $$0x.a(auy.b), this::a, ib.a($$2), 10, car.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     byy $$4 = (byy)this.a.K();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        epr $$6 = cai.a(this.a, 10, 7, epr.c(this.d), (float) (Math.PI / 2));
                        if ($$6 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.K().a($$6.c, $$6.d, $$6.e, 0);
                        $$4.b($$5);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$7 = 0; $$7 < this.c.e(); $$7++) {
                        eja $$8 = this.c.a($$7);
                        ib $$9 = new ib($$8.a, $$8.b + 1, $$8.c);
                        if (dcg.a(this.a.dM(), $$9)) {
                           this.c = this.a.K().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
                           break;
                        }
                     }

                     return this.c != null;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean b() {
      return this.a.K().l() ? false : !this.d.a(this.a.dk(), (double)(this.a.dg() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.K().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.K().l() || this.d.a(this.a.dk(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(ib $$0) {
      for (ib $$1 : this.f) {
         if (Objects.equals($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   private void h() {
      if (this.f.size() > 15) {
         this.f.remove(0);
      }
   }
}
