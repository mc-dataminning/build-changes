import java.util.List;
import javax.annotation.Nullable;

public class bmq extends bmv {
   private int a;
   private final bgi b;
   @Nullable
   private byo c;
   private bme d;

   public bmq(bgi $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cah> $$0 = this.b.dI().a(cah.class, this.b.cE().g(5.0));
      boolean $$1 = false;

      for (cah $$2 : $$0) {
         bfj $$3 = $$2.cL();
         if ($$3 instanceof byo && (apa.e(((byo)$$3).bl) > 0.0F || apa.e(((byo)$$3).bn) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (apa.e(this.c.bl) > 0.0F || apa.e(this.c.bn) > 0.0F) || $$1;
   }

   @Override
   public boolean J_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bM() && (apa.e(this.c.bl) > 0.0F || apa.e(this.c.bn) > 0.0F);
   }

   @Override
   public void c() {
      for (cah $$1 : this.b.dI().a(cah.class, this.b.cE().g(5.0))) {
         if ($$1.cL() != null && $$1.cL() instanceof byo) {
            this.c = (byo)$$1.cL();
            break;
         }
      }

      this.a = 0;
      this.d = bme.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = apa.e(this.c.bl) > 0.0F || apa.e(this.c.bn) > 0.0F;
      float $$1 = this.d == bme.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new eei((double)this.b.bl, (double)this.b.bm, (double)this.b.bn));
      this.b.a(bgf.a, this.b.dl());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bme.a) {
            gu $$2 = this.c.di().a(this.c.cB().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.J().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bfj)this.c) < 4.0F) {
               this.a = 0;
               this.d = bme.b;
            }
         } else if (this.d == bme.b) {
            ha $$3 = this.c.cC();
            gu $$4 = this.c.di().a($$3, 10);
            this.b.J().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bfj)this.c) > 12.0F) {
               this.a = 0;
               this.d = bme.a;
            }
         }
      }
   }
}
