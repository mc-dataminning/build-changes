import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bpa extends bof<cfd> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private hx e;
   private long f;
   private int g;
   private final List<hx> h = Lists.newArrayList();

   public bpa() {
      super(ImmutableMap.of(bvq.n, bvr.b, bvq.m, bvr.b, bvq.f, bvr.a));
   }

   protected boolean a(ane $$0, cfd $$1) {
      if (!$$0.Z().b(ctt.c)) {
         return false;
      } else if ($$1.gq().b() != cfg.g) {
         return false;
      } else {
         hx.a $$2 = $$1.dl().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dq() + (double)$$3, $$1.ds() + (double)$$4, $$1.dw() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new hx($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private hx a(ane $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(hx $$0, ane $$1) {
      djp $$2 = $$1.a_($$0);
      cwy $$3 = $$2.b();
      cwy $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cyt && ((cyt)$$3).h($$2) || $$2.i() && $$4 instanceof czv;
   }

   protected void a(ane $$0, cfd $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dN().a(bvq.n, new boi(this.e));
         $$1.dN().a(bvq.m, new bvt(new boi(this.e), 0.5F, 1));
      }
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      $$1.dN().b(bvq.n);
      $$1.dN().b(bvq.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dj(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            djp $$3 = $$0.a_(this.e);
            cwy $$4 = $$3.b();
            cwy $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cyt && ((cyt)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof czv && $$1.gz()) {
               bkl $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cng $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(asq.aU) && $$8.d() instanceof cla $$10) {
                     djp $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dnz.i, this.e, dnz.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), art.fY, aru.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cng.f);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cyt && !((cyt)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dN().a(bvq.m, new bvt(new boi(this.e), 0.5F, 1));
                  $$1.dN().a(bvq.n, new boi(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ane $$0, cfd $$1, long $$2) {
      return this.g < 200;
   }
}
