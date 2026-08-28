import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bym extends bxr<cpd> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ji e;
   private long f;
   private int g;
   private final List<ji> h = Lists.newArrayList();

   public bym() {
      super(ImmutableMap.of(cfc.n, cfd.b, cfc.m, cfd.b, cfc.f, cfd.a));
   }

   protected boolean a(ard $$0, cpd $$1) {
      if (!$$0.O().b(dgv.c)) {
         return false;
      } else if ($$1.gA().b() != cpg.g) {
         return false;
      } else {
         ji.a $$2 = $$1.du().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dz() + (double)$$3, $$1.dB() + (double)$$4, $$1.dF() + (double)$$5);
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
      return this.h.isEmpty() ? null : this.h.get($$0.C_().a(this.h.size()));
   }

   private boolean a(ji $$0, ard $$1) {
      dxq $$2 = $$1.a_($$0);
      dke $$3 = $$2.b();
      dke $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dma && ((dma)$$3).i($$2) || $$2.l() && $$4 instanceof dnc;
   }

   protected void a(ard $$0, cpd $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ea().a(cfc.n, new bxu(this.e));
         $$1.ea().a(cfc.m, new cff(new bxu(this.e), 0.5F, 1));
      }
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      $$1.ea().b(cfc.n);
      $$1.ea().b(cfc.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      if (this.e == null || this.e.a($$1.ds(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dxq $$3 = $$0.a_(this.e);
            dke $$4 = $$3.b();
            dke $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dma && ((dma)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dnc && $$1.gK()) {
               btf $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cxh $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(awy.bM) && $$8.h() instanceof cvo $$10) {
                     dxq $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(ecp.i, this.e, ecp.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awa.gH, awb.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cxh.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dma && !((dma)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ea().a(cfc.m, new cff(new bxu(this.e), 0.5F, 1));
                  $$1.ea().a(cfc.n, new bxu(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ard $$0, cpd $$1, long $$2) {
      return this.g < 200;
   }
}
