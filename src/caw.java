import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class caw extends cak {
   protected final btu a;
   private final double b;
   @Nullable
   private epm c;
   private jd d;
   private final boolean e;
   private final List<jd> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public caw(btu $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(cak.a.a));
      if (!cei.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean b() {
      if (!cei.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dQ().R()) {
            return false;
         } else {
            aqt $$0 = (aqt)this.a.dQ();
            jd $$1 = this.a.dq();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               eww $$2 = cek.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<jd> $$3x = $$0.y().d($$0xx -> $$0xx.a(awo.b), this::a, $$2x, 10, ceq.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<jd> $$3 = $$0.y().d($$0x -> $$0x.a(awo.b), this::a, jd.a((jw)$$2), 10, ceq.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     ccx $$4 = (ccx)this.a.J();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        eww $$6 = ceh.a(this.a, 10, 7, eww.c(this.d), (float) (Math.PI / 2));
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
                        epk $$8 = this.c.a($$7);
                        jd $$9 = new jd($$8.a, $$8.b + 1, $$8.c);
                        if (dic.a(this.a.dQ(), $$9)) {
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
   public boolean c() {
      return this.a.J().l() ? false : !this.d.a(this.a.do(), (double)(this.a.dk() + (float)this.g));
   }

   @Override
   public void d() {
      this.a.J().a(this.c, this.b);
   }

   @Override
   public void e() {
      if (this.a.J().l() || this.d.a(this.a.do(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(jd $$0) {
      for (jd $$1 : this.f) {
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
