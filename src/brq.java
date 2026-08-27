import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class brq extends bre {
   protected final bks a;
   private final double b;
   @Nullable
   private ebt c;
   private ht d;
   private final boolean e;
   private final List<ht> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public brq(bks $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bre.a.a));
      if (!bva.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!bva.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dL().N()) {
            return false;
         } else {
            alq $$0 = (alq)this.a.dL();
            ht $$1 = this.a.dl();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               eif $$2 = bvc.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.b($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<ht> $$3x = $$0.w().d($$0xx -> $$0xx.a(arc.b), this::a, $$2x, 10, bvi.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<ht> $$3 = $$0.w().d($$0x -> $$0x.a(arc.b), this::a, ht.a($$2), 10, bvi.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     btr $$4 = (btr)this.a.L();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        eif $$6 = buz.a(this.a, 10, 7, eif.c(this.d), (float) (Math.PI / 2));
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
                        ebr $$8 = this.c.a($$7);
                        ht $$9 = new ht($$8.a, $$8.b + 1, $$8.c);
                        if (cwe.a(this.a.dL(), $$9)) {
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

   private boolean a(ht $$0) {
      for (ht $$1 : this.f) {
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
