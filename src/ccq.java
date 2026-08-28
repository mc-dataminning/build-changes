import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class ccq extends cce {
   protected final bvo a;
   private final double b;
   @Nullable
   private etm c;
   private ji d;
   private final boolean e;
   private final List<ji> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public ccq(bvo $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(cce.a.a));
      if (!cgc.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean b() {
      if (!cgc.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dV().V()) {
            return false;
         } else {
            ard $$0 = (ard)this.a.dV();
            ji $$1 = this.a.dv();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               faz $$2 = cge.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<ji> $$3x = $$0.A().d($$0xx -> $$0xx.a(axa.b), this::a, $$2x, 10, cgk.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<ji> $$3 = $$0.A().d($$0x -> $$0x.a(axa.b), this::a, ji.a((kb)$$2), 10, cgk.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().j();
                     cer $$4 = (cer)this.a.P();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b(true);
                     if (this.c == null) {
                        faz $$5 = cgb.a(this.a, 10, 7, faz.c(this.d), (float) (Math.PI / 2));
                        if ($$5 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.P().a($$5.d, $$5.e, $$5.f, 0);
                        $$4.b(true);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$6 = 0; $$6 < this.c.e(); $$6++) {
                        etk $$7 = this.c.a($$6);
                        ji $$8 = new ji($$7.a, $$7.b + 1, $$7.c);
                        if (dls.a(this.a.dV(), $$8)) {
                           this.c = this.a.P().a((double)$$7.a, (double)$$7.b, (double)$$7.c, 0);
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
   public boolean c() {
      return this.a.P().k() ? false : !this.d.a(this.a.dt(), (double)(this.a.dq() + (float)this.g));
   }

   @Override
   public void d() {
      this.a.P().a(this.c, this.b);
   }

   @Override
   public void e() {
      if (this.a.P().k() || this.d.a(this.a.dt(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(ji $$0) {
      for (ji $$1 : this.f) {
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
