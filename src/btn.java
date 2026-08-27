import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class btn extends btb {
   protected final bmo a;
   private final double b;
   @Nullable
   private eez c;
   private hx d;
   private final boolean e;
   private final List<hx> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public btn(bmo $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(btb.a.a));
      if (!bwy.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!bwy.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dM().P()) {
            return false;
         } else {
            amz $$0 = (amz)this.a.dM();
            hx $$1 = this.a.dm();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               elm $$2 = bxa.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<hx> $$3x = $$0.y().d($$0xx -> $$0xx.a(asl.b), this::a, $$2x, 10, bxg.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<hx> $$3 = $$0.y().d($$0x -> $$0x.a(asl.b), this::a, hx.a($$2), 10, bxg.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     bvo $$4 = (bvo)this.a.N();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        elm $$6 = bwx.a(this.a, 10, 7, elm.c(this.d), (float) (Math.PI / 2));
                        if ($$6 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.N().a($$6.c, $$6.d, $$6.e, 0);
                        $$4.b($$5);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$7 = 0; $$7 < this.c.e(); $$7++) {
                        eex $$8 = this.c.a($$7);
                        hx $$9 = new hx($$8.a, $$8.b + 1, $$8.c);
                        if (cyp.a(this.a.dM(), $$9)) {
                           this.c = this.a.N().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
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
      return this.a.N().l() ? false : !this.d.a(this.a.dk(), (double)(this.a.dg() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.N().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.N().l() || this.d.a(this.a.dk(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(hx $$0) {
      for (hx $$1 : this.f) {
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
