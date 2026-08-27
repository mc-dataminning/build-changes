import java.util.List;
import javax.annotation.Nullable;

public class btf extends btk {
   private int a;
   private final bmx b;
   @Nullable
   private cfq c;
   private bst d;

   public btf(bmx $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<chk> $$0 = this.b.dL().a(chk.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (chk $$2 : $$0) {
         blw $$3 = $$2.cN();
         if ($$3 instanceof cfq && (aup.e(((cfq)$$3).bk) > 0.0F || aup.e(((cfq)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (aup.e(this.c.bk) > 0.0F || aup.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (aup.e(this.c.bk) > 0.0F || aup.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (chk $$1 : this.b.dL().a(chk.class, this.b.cH().g(5.0))) {
         if ($$1.cN() instanceof cfq $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bst.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = aup.e(this.c.bk) > 0.0F || aup.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bst.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new emc((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bmu.a, this.b.do());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bst.a) {
            hx $$2 = this.c.dl().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((blw)this.c) < 4.0F) {
               this.a = 0;
               this.d = bst.b;
            }
         } else if (this.d == bst.b) {
            ic $$3 = this.c.cF();
            hx $$4 = this.c.dl().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((blw)this.c) > 12.0F) {
               this.a = 0;
               this.d = bst.a;
            }
         }
      }
   }
}
