import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bqe extends bps {
   protected final bjf a;
   private final double b;
   @Nullable
   private eaq c;
   private gv d;
   private final boolean e;
   private final List<gv> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bqe(bjf $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bps.a.a));
      if (!bto.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!bto.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dK().N()) {
            return false;
         } else {
            aki $$0 = (aki)this.a.dK();
            gv $$1 = this.a.dk();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               ehf $$2 = btq.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.b($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<gv> $$3x = $$0.w().d($$0xx -> $$0xx.a(apt.b), this::a, $$2x, 10, btw.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<gv> $$3 = $$0.w().d($$0x -> $$0x.a(apt.b), this::a, gv.a($$2), 10, btw.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     bsf $$4 = (bsf)this.a.H();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        ehf $$6 = btn.a(this.a, 10, 7, ehf.c(this.d), (float) (Math.PI / 2));
                        if ($$6 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.H().a($$6.c, $$6.d, $$6.e, 0);
                        $$4.b($$5);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$7 = 0; $$7 < this.c.e(); $$7++) {
                        eao $$8 = this.c.a($$7);
                        gv $$9 = new gv($$8.a, $$8.b + 1, $$8.c);
                        if (cum.a(this.a.dK(), $$9)) {
                           this.c = this.a.H().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
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
      return this.a.H().l() ? false : !this.d.a(this.a.di(), (double)(this.a.df() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.H().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.H().l() || this.d.a(this.a.di(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(gv $$0) {
      for (gv $$1 : this.f) {
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
