import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bqt extends bqh {
   protected final bjv a;
   private final double b;
   @Nullable
   private eav c;
   private gw d;
   private final boolean e;
   private final List<gw> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bqt(bjv $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bqh.a.a));
      if (!bud.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!bud.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dL().N()) {
            return false;
         } else {
            akt $$0 = (akt)this.a.dL();
            gw $$1 = this.a.dl();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               ehh $$2 = buf.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.b($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<gw> $$3x = $$0.w().d($$0xx -> $$0xx.a(aqf.b), this::a, $$2x, 10, bul.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<gw> $$3 = $$0.w().d($$0x -> $$0x.a(aqf.b), this::a, gw.a($$2), 10, bul.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     bsu $$4 = (bsu)this.a.L();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        ehh $$6 = buc.a(this.a, 10, 7, ehh.c(this.d), (float) (Math.PI / 2));
                        if ($$6 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.L().a($$6.c, $$6.d, $$6.e, 0);
                        $$4.b($$5);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$7 = 0; $$7 < this.c.e(); $$7++) {
                        eat $$8 = this.c.a($$7);
                        gw $$9 = new gw($$8.a, $$8.b + 1, $$8.c);
                        if (cvg.a(this.a.dL(), $$9)) {
                           this.c = this.a.L().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
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
      return this.a.L().l() ? false : !this.d.a(this.a.dj(), (double)(this.a.df() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.L().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.L().l() || this.d.a(this.a.dj(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(gw $$0) {
      for (gw $$1 : this.f) {
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
