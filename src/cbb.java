import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class cbb extends cap {
   protected final bua a;
   private final double b;
   @Nullable
   private eol c;
   private iz d;
   private final boolean e;
   private final List<iz> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public cbb(bua $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(cap.a.a));
      if (!cen.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!cen.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dP().R()) {
            return false;
         } else {
            arf $$0 = (arf)this.a.dP();
            iz $$1 = this.a.dp();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               evt $$2 = cep.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<iz> $$3x = $$0.y().d($$0xx -> $$0xx.a(axa.b), this::a, $$2x, 10, cev.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<iz> $$3 = $$0.y().d($$0x -> $$0x.a(axa.b), this::a, iz.a($$2), 10, cev.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     cdc $$4 = (cdc)this.a.K();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        evt $$6 = cem.a(this.a, 10, 7, evt.c(this.d), (float) (Math.PI / 2));
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
                        eoj $$8 = this.c.a($$7);
                        iz $$9 = new iz($$8.a, $$8.b + 1, $$8.c);
                        if (dhh.a(this.a.dP(), $$9)) {
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
      return this.a.K().l() ? false : !this.d.a(this.a.dn(), (double)(this.a.dj() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.K().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.K().l() || this.d.a(this.a.dn(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(iz $$0) {
      for (iz $$1 : this.f) {
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
