import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bqf extends bpt {
   protected final bjh a;
   private final double b;
   @Nullable
   private ear c;
   private gu d;
   private final boolean e;
   private final List<gu> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bqf(bjh $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bpt.a.a));
      if (!btp.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!btp.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dK().N()) {
            return false;
         } else {
            akk $$0 = (akk)this.a.dK();
            gu $$1 = this.a.dk();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               ehd $$2 = btr.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.b($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<gu> $$3x = $$0.w().d($$0xx -> $$0xx.a(apv.b), this::a, $$2x, 10, btx.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<gu> $$3 = $$0.w().d($$0x -> $$0x.a(apv.b), this::a, gu.a($$2), 10, btx.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     bsg $$4 = (bsg)this.a.H();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        ehd $$6 = bto.a(this.a, 10, 7, ehd.c(this.d), (float) (Math.PI / 2));
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
                        eap $$8 = this.c.a($$7);
                        gu $$9 = new gu($$8.a, $$8.b + 1, $$8.c);
                        if (cun.a(this.a.dK(), $$9)) {
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

   private boolean a(gu $$0) {
      for (gu $$1 : this.f) {
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
