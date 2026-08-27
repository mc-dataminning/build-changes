import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bsn extends bsb {
   protected final blp a;
   private final double b;
   @Nullable
   private edh c;
   private ht d;
   private final boolean e;
   private final List<ht> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bsn(blp $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bsb.a.a));
      if (!bvx.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!bvx.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.dN().O()) {
            return false;
         } else {
            ame $$0 = (ame)this.a.dN();
            ht $$1 = this.a.dn();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               eju $$2 = bvz.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.b($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<ht> $$3x = $$0.x().d($$0xx -> $$0xx.a(arq.b), this::a, $$2x, 10, bwf.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<ht> $$3 = $$0.x().d($$0x -> $$0x.a(arq.b), this::a, ht.a($$2), 10, bwf.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().i();
                     buo $$4 = (buo)this.a.N();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        eju $$6 = bvw.a(this.a, 10, 7, eju.c(this.d), (float) (Math.PI / 2));
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
                        edf $$8 = this.c.a($$7);
                        ht $$9 = new ht($$8.a, $$8.b + 1, $$8.c);
                        if (cxg.a(this.a.dN(), $$9)) {
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
      return this.a.N().l() ? false : !this.d.a(this.a.dl(), (double)(this.a.dh() + (float)this.g));
   }

   @Override
   public void c() {
      this.a.N().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.N().l() || this.d.a(this.a.dl(), (double)this.g)) {
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
