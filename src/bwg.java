import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bwg extends bvu {
   protected final bpf a;
   private final double b;
   @Nullable
   private eig c;
   private ib d;
   private final boolean e;
   private final List<ib> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bwg(bpf $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bvu.a.a));
      if (!bzs.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!bzs.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dJ().P()) {
            return false;
         } else {
            apa $$0 = (apa)this.a.dJ();
            ib $$1 = this.a.dj();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               eov $$2 = bzu.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<ib> $$3x = $$0.y().d($$0xx -> $$0xx.a(auo.b), this::a, $$2x, 10, caa.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<ib> $$3 = $$0.y().d($$0x -> $$0x.a(auo.b), this::a, ib.a($$2), 10, caa.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     byh $$4 = (byh)this.a.N();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        eov $$6 = bzr.a(this.a, 10, 7, eov.c(this.d), (float) (Math.PI / 2));
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
                        eie $$8 = this.c.a($$7);
                        ib $$9 = new ib($$8.a, $$8.b + 1, $$8.c);
                        if (dbl.a(this.a.dJ(), $$9)) {
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
      return this.a.N().l() ? false : !this.d.a(this.a.dh(), (double)(this.a.dd() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.N().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.N().l() || this.d.a(this.a.dh(), (double)this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(ib $$0) {
      for (ib $$1 : this.f) {
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
