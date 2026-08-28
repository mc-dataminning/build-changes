import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxu extends bwz<coh> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ji e;
   private long f;
   private int g;
   private final List<ji> h = Lists.newArrayList();

   public bxu() {
      super(ImmutableMap.of(cek.n, cel.b, cek.m, cel.b, cek.f, cel.a));
   }

   protected boolean a(ard $$0, coh $$1) {
      if (!$$0.O().b(dgd.c)) {
         return false;
      } else if ($$1.gC().b() != cok.g) {
         return false;
      } else {
         ji.a $$2 = $$1.dv().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dA() + (double)$$3, $$1.dC() + (double)$$4, $$1.dG() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ji($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ji a(ard $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.H_().a(this.h.size()));
   }

   private boolean a(ji $$0, ard $$1) {
      dww $$2 = $$1.a_($$0);
      djl $$3 = $$2.b();
      djl $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dlh && ((dlh)$$3).i($$2) || $$2.l() && $$4 instanceof dmj;
   }

   protected void a(ard $$0, coh $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.eb().a(cek.n, new bxc(this.e));
         $$1.eb().a(cek.m, new cen(new bxc(this.e), 0.5F, 1));
      }
   }

   protected void b(ard $$0, coh $$1, long $$2) {
      $$1.eb().b(cek.n);
      $$1.eb().b(cek.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ard $$0, coh $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dww $$3 = $$0.a_(this.e);
            djl $$4 = $$3.b();
            djl $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dlh && ((dlh)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dmj && $$1.gL()) {
               bsq $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cwo $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(awy.bM) && $$8.h() instanceof cuu $$10) {
                     dww $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(ebs.i, this.e, ebs.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awa.gH, awb.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cwo.j);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dlh && !((dlh)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.eb().a(cek.m, new cen(new bxc(this.e), 0.5F, 1));
                  $$1.eb().a(cek.n, new bxc(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ard $$0, coh $$1, long $$2) {
      return this.g < 200;
   }
}
