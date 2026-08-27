import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bzx extends bzl {
   protected final bsw a;
   private final double b;
   @Nullable
   private eps c;
   private ir d;
   private final boolean e;
   private final List<ir> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bzx(bsw $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bzl.a.a));
      if (!cdj.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!cdj.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dU().R()) {
            return false;
         } else {
            aqt $$0 = (aqt)this.a.dU();
            ir $$1 = this.a.du();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               ewu $$2 = cdl.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<ir> $$3x = $$0.y().d($$0xx -> $$0xx.a(awo.b), this::a, $$2x, 10, cdr.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<ir> $$3 = $$0.y().d($$0x -> $$0x.a(awo.b), this::a, ir.a($$2), 10, cdr.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     cby $$4 = (cby)this.a.J();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        ewu $$6 = cdi.a(this.a, 10, 7, ewu.c(this.d), (float) (Math.PI / 2));
                        if ($$6 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.J().a($$6.c, $$6.d, $$6.e, 0);
                        $$4.b($$5);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$7 = 0; $$7 < this.c.e(); $$7++) {
                        epq $$8 = this.c.a($$7);
                        ir $$9 = new ir($$8.a, $$8.b + 1, $$8.c);
                        if (dhj.b(this.a.dU(), $$9)) {
                           this.c = this.a.J().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
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
      return this.a.J().l() ? false : !this.d.a(this.a.ds(), (double)(this.a.do() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.J().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.J().l() || this.d.a(this.a.ds(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(ir $$0) {
      for (ir $$1 : this.f) {
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
