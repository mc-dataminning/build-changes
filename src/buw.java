import java.util.List;
import javax.annotation.Nullable;

public class buw extends bvb {
   private int a;
   private final boo b;
   @Nullable
   private chh c;
   private buk d;

   public buw(boo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cjc> $$0 = this.b.dM().a(cjc.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (cjc $$2 : $$0) {
         bno $$3 = $$2.cN();
         if ($$3 instanceof chh && (awh.e(((chh)$$3).bk) > 0.0F || awh.e(((chh)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (awh.e(this.c.bk) > 0.0F || awh.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (awh.e(this.c.bk) > 0.0F || awh.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cjc $$1 : this.b.dM().a(cjc.class, this.b.cH().g(5.0))) {
         if ($$1.cN() instanceof chh $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = buk.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = awh.e(this.c.bk) > 0.0F || awh.e(this.c.bm) > 0.0F;
      float $$1 = this.d == buk.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ens((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bol.a, this.b.dp());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == buk.a) {
            hz $$2 = this.c.dm().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bno)this.c) < 4.0F) {
               this.a = 0;
               this.d = buk.b;
            }
         } else if (this.d == buk.b) {
            ie $$3 = this.c.cF();
            hz $$4 = this.c.dm().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bno)this.c) > 12.0F) {
               this.a = 0;
               this.d = buk.a;
            }
         }
      }
   }
}
