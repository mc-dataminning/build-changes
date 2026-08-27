import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bvb extends bug<cll> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ir e;
   private long f;
   private int g;
   private final List<ir> h = Lists.newArrayList();

   public bvb() {
      super(ImmutableMap.of(cbr.n, cbs.b, cbr.m, cbs.b, cbr.f, cbs.a));
   }

   protected boolean a(aqt $$0, cll $$1) {
      if (!$$0.ab().b(dbw.c)) {
         return false;
      } else if ($$1.gL().b() != clo.g) {
         return false;
      } else {
         ir.a $$2 = $$1.du().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dz() + (double)$$3, $$1.dB() + (double)$$4, $$1.dF() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ir($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ir a(aqt $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(ir $$0, aqt $$1) {
      dtc $$2 = $$1.a_($$0);
      dfc $$3 = $$2.b();
      dfc $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dgy && ((dgy)$$3).h($$2) || $$2.i() && $$4 instanceof dic;
   }

   protected void a(aqt $$0, cll $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dZ().a(cbr.n, new buj(this.e));
         $$1.dZ().a(cbr.m, new cbu(new buj(this.e), 0.5F, 1));
      }
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      $$1.dZ().b(cbr.n);
      $$1.dZ().b(cbr.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      if (this.e == null || this.e.a($$1.ds(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dtc $$3 = $$0.a_(this.e);
            dfc $$4 = $$3.b();
            dfc $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dgy && ((dgy)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dic && $$1.gS()) {
               bqj $$6 = $$1.x();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cuh $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.d() && $$8.a(awm.bz) && $$8.f() instanceof csc $$10) {
                     dtc $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dxv.i, this.e, dxv.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avo.gm, avq.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.d()) {
                        $$6.a($$7, cuh.i);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dgy && !((dgy)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dZ().a(cbr.m, new cbu(new buj(this.e), 0.5F, 1));
                  $$1.dZ().a(cbr.n, new buj(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqt $$0, cll $$1, long $$2) {
      return this.g < 200;
   }
}
