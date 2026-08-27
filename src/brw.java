import java.util.List;
import javax.annotation.Nullable;

public class brw extends bsb {
   private int a;
   private final blp b;
   @Nullable
   private cdu c;
   private brk d;

   public brw(blp $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cfn> $$0 = this.b.dN().a(cfn.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (cfn $$2 : $$0) {
         bkq $$3 = $$2.cO();
         if ($$3 instanceof cdu && (atm.e(((cdu)$$3).bk) > 0.0F || atm.e(((cdu)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (atm.e(this.c.bk) > 0.0F || atm.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (atm.e(this.c.bk) > 0.0F || atm.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cfn $$1 : this.b.dN().a(cfn.class, this.b.cH().g(5.0))) {
         if ($$1.cO() instanceof cdu $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = brk.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = atm.e(this.c.bk) > 0.0F || atm.e(this.c.bm) > 0.0F;
      float $$1 = this.d == brk.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new eju((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(blm.a, this.b.dq());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == brk.a) {
            ht $$2 = this.c.dn().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bkq)this.c) < 4.0F) {
               this.a = 0;
               this.d = brk.b;
            }
         } else if (this.d == brk.b) {
            hx $$3 = this.c.cF();
            ht $$4 = this.c.dn().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bkq)this.c) > 12.0F) {
               this.a = 0;
               this.d = brk.a;
            }
         }
      }
   }
}
