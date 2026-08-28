import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class cek extends cdy {
   protected final bxk a;
   private final double b;
   @Nullable
   private ewu c;
   private iu d;
   private final boolean e;
   private final List<iu> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public cek(bxk $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(cdy.a.a));
      if (!chw.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean b() {
      if (!chw.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dV().V()) {
            return false;
         } else {
            arq $$0 = (arq)this.a.dV();
            iu $$1 = this.a.dv();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               fei $$2 = chy.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<iu> $$3x = $$0.A().d($$0xx -> $$0xx.a(axm.b), this::a, $$2x, 10, cie.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<iu> $$3 = $$0.A().d($$0x -> $$0x.a(axm.b), this::a, iu.a((jo)$$2), 10, cie.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().j();
                     cgl $$4 = (cgl)this.a.O();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b(true);
                     if (this.c == null) {
                        fei $$5 = chv.a(this.a, 10, 7, fei.c(this.d), (float) (Math.PI / 2));
                        if ($$5 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.O().a($$5.d, $$5.e, $$5.f, 0);
                        $$4.b(true);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$6 = 0; $$6 < this.c.e(); $$6++) {
                        ews $$7 = this.c.a($$6);
                        iu $$8 = new iu($$7.a, $$7.b + 1, $$7.c);
                        if (doh.a(this.a.dV(), $$8)) {
                           this.c = this.a.O().a((double)$$7.a, (double)$$7.b, (double)$$7.c, 0);
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
      return this.a.O().k() ? false : !this.d.a(this.a.dt(), (double)(this.a.dq() + (float)this.g));
   }

   @Override
   public void d() {
      this.a.O().a(this.c, this.b);
   }

   @Override
   public void e() {
      if (this.a.O().k() || this.d.a(this.a.dt(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(iu $$0) {
      for (iu $$1 : this.f) {
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
