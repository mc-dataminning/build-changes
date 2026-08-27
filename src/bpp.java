import java.util.List;
import javax.annotation.Nullable;

public class bpp extends bpu {
   private int a;
   private final bjh b;
   @Nullable
   private cbn c;
   private bpd d;

   public bpp(bjh $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cdg> $$0 = this.b.dK().a(cdg.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (cdg $$2 : $$0) {
         bii $$3 = $$2.cN();
         if ($$3 instanceof cbn && (arp.e(((cbn)$$3).bk) > 0.0F || arp.e(((cbn)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (arp.e(this.c.bk) > 0.0F || arp.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean J_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (arp.e(this.c.bk) > 0.0F || arp.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cdg $$1 : this.b.dK().a(cdg.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof cbn $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bpd.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = arp.e(this.c.bk) > 0.0F || arp.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bpd.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ehe((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bje.a, this.b.dn());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bpd.a) {
            gu $$2 = this.c.dk().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.H().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bii)this.c) < 4.0F) {
               this.a = 0;
               this.d = bpd.b;
            }
         } else if (this.d == bpd.b) {
            ha $$3 = this.c.cE();
            gu $$4 = this.c.dk().a($$3, 10);
            this.b.H().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bii)this.c) > 12.0F) {
               this.a = 0;
               this.d = bpd.a;
            }
         }
      }
   }
}
