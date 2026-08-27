import java.util.List;
import javax.annotation.Nullable;

public class bva extends bvf {
   private int a;
   private final boq b;
   @Nullable
   private chl c;
   private buo d;

   public bva(boq $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cjg> $$0 = this.b.dM().a(cjg.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (cjg $$2 : $$0) {
         bnq $$3 = $$2.cN();
         if ($$3 instanceof chl && (awi.e(((chl)$$3).bk) > 0.0F || awi.e(((chl)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (awi.e(this.c.bk) > 0.0F || awi.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (awi.e(this.c.bk) > 0.0F || awi.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cjg $$1 : this.b.dM().a(cjg.class, this.b.cH().g(5.0))) {
         if ($$1.cN() instanceof chl $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = buo.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = awi.e(this.c.bk) > 0.0F || awi.e(this.c.bm) > 0.0F;
      float $$1 = this.d == buo.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new enz((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bon.a, this.b.dp());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == buo.a) {
            hz $$2 = this.c.dm().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bnq)this.c) < 4.0F) {
               this.a = 0;
               this.d = buo.b;
            }
         } else if (this.d == buo.b) {
            ie $$3 = this.c.cF();
            hz $$4 = this.c.dm().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bnq)this.c) > 12.0F) {
               this.a = 0;
               this.d = buo.a;
            }
         }
      }
   }
}
