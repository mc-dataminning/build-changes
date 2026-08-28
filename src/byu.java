import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class byu extends bxz<cpj> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jh e;
   private long f;
   private int g;
   private final List<jh> h = Lists.newArrayList();

   public byu() {
      super(ImmutableMap.of(cfk.n, cfl.b, cfk.m, cfl.b, cfk.f, cfl.a));
   }

   protected boolean a(ash $$0, cpj $$1) {
      if (!$$0.N().b(dhe.c)) {
         return false;
      } else if ($$1.gy().b() != cpm.g) {
         return false;
      } else {
         jh.a $$2 = $$1.dw().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dB() + (double)$$3, $$1.dD() + (double)$$4, $$1.dH() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jh($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jh a(ash $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.H_().a(this.h.size()));
   }

   private boolean a(jh $$0, ash $$1) {
      dxv $$2 = $$1.a_($$0);
      dkm $$3 = $$2.b();
      dkm $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dmj && ((dmj)$$3).i($$2) || $$2.l() && $$4 instanceof dnk;
   }

   protected void a(ash $$0, cpj $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ec().a(cfk.n, new byc(this.e));
         $$1.ec().a(cfk.m, new cfn(new byc(this.e), 0.5F, 1));
      }
   }

   protected void b(ash $$0, cpj $$1, long $$2) {
      $$1.ec().b(cfk.n);
      $$1.ec().b(cfk.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ash $$0, cpj $$1, long $$2) {
      if (this.e == null || this.e.a($$1.du(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dxv $$3 = $$0.a_(this.e);
            dkm $$4 = $$3.b();
            dkm $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dmj && ((dmj)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dnk && $$1.gH()) {
               btq $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cxp $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(ayd.bP) && $$8.h() instanceof cvv $$10) {
                     dxv $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(ecr.i, this.e, ecr.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), axf.gG, axg.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cxp.j);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dmj && !((dmj)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ec().a(cfk.m, new cfn(new byc(this.e), 0.5F, 1));
                  $$1.ec().a(cfk.n, new byc(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ash $$0, cpj $$1, long $$2) {
      return this.g < 200;
   }
}
