import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgh extends cfb {
   private static final int a = 10;
   private final byn b;
   private final int c;
   @Nullable
   private iw d;

   public cgh(byn $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cfb.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cX()) {
         return false;
      } else if (this.b.dV().V()) {
         return false;
      } else if (this.b.dY().a(this.c) != 0) {
         return false;
      } else {
         asb $$0 = (asb)this.b.dV();
         iw $$1 = this.b.dv();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fgc $$2 = cjb.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jz.a($$1x))));
            this.d = $$2 == null ? null : iw.a((jq)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.N().k() && this.b.N().g().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         chp $$0 = this.b.N();
         if ($$0.k() && !this.d.a(this.b.dt(), 10.0)) {
            fgc $$1 = fgc.c(this.d);
            fgc $$2 = this.b.dt();
            fgc $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fgc $$4 = $$1.d($$2).d().c(10.0).e($$2);
            iw $$5 = iw.a((jq)$$4);
            $$5 = this.b.dV().a(ehp.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      bai $$0 = this.b.dY();
      iw $$1 = this.b.dV().a(ehp.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
