import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class cck extends cby {
   protected final bvi a;
   private final double b;
   @Nullable
   private ery c;
   private jh d;
   private final boolean e;
   private final List<jh> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public cck(bvi $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(cby.a.a));
      if (!cfw.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean b() {
      if (!cfw.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dX().S()) {
            return false;
         } else {
            arn $$0 = (arn)this.a.dX();
            jh $$1 = this.a.dx();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               ezn $$2 = cfy.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<jh> $$3x = $$0.y().d($$0xx -> $$0xx.a(axl.b), this::a, $$2x, 10, cge.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<jh> $$3 = $$0.y().d($$0x -> $$0x.a(axl.b), this::a, jh.a((ka)$$2), 10, cge.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().j();
                     cel $$4 = (cel)this.a.P();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        ezn $$6 = cfv.a(this.a, 10, 7, ezn.c(this.d), (float) (Math.PI / 2));
                        if ($$6 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.P().a($$6.d, $$6.e, $$6.f, 0);
                        $$4.b($$5);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$7 = 0; $$7 < this.c.e(); $$7++) {
                        erw $$8 = this.c.a($$7);
                        jh $$9 = new jh($$8.a, $$8.b + 1, $$8.c);
                        if (dkk.a(this.a.dX(), $$9)) {
                           this.c = this.a.P().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
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
      return this.a.P().m() ? false : !this.d.a(this.a.dv(), (double)(this.a.ds() + (float)this.g));
   }

   @Override
   public void d() {
      this.a.P().a(this.c, this.b);
   }

   @Override
   public void e() {
      if (this.a.P().m() || this.d.a(this.a.dv(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(jh $$0) {
      for (jh $$1 : this.f) {
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
