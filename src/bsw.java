import java.util.List;
import javax.annotation.Nullable;

public class bsw extends btb {
   private int a;
   private final bmo b;
   @Nullable
   private cfb c;
   private bsk d;

   public bsw(bmo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cgv> $$0 = this.b.dM().a(cgv.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (cgv $$2 : $$0) {
         blp $$3 = $$2.cN();
         if ($$3 instanceof cfb && (aui.e(((cfb)$$3).bk) > 0.0F || aui.e(((cfb)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (aui.e(this.c.bk) > 0.0F || aui.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (aui.e(this.c.bk) > 0.0F || aui.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cgv $$1 : this.b.dM().a(cgv.class, this.b.cH().g(5.0))) {
         if ($$1.cN() instanceof cfb $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bsk.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = aui.e(this.c.bk) > 0.0F || aui.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bsk.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new elm((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bml.a, this.b.dp());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bsk.a) {
            hx $$2 = this.c.dm().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((blp)this.c) < 4.0F) {
               this.a = 0;
               this.d = bsk.b;
            }
         } else if (this.d == bsk.b) {
            ic $$3 = this.c.cF();
            hx $$4 = this.c.dm().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((blp)this.c) > 12.0F) {
               this.a = 0;
               this.d = bsk.a;
            }
         }
      }
   }
}
