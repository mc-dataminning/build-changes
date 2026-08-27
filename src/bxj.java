import java.util.EnumSet;
import javax.annotation.Nullable;

public class bxj extends byb {
   private final cdw a;
   @Nullable
   private ckl b;
   private final czu c;
   private final float d;
   private int e;
   private final cbu f;

   public bxj(cdw $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dN();
      this.d = $$1;
      this.f = cbu.b().a((double)$$1);
      this.a(EnumSet.of(byb.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bB()) {
         return false;
      } else {
         return this.a.g((bql)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.ej().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.G().a(this.b.ds(), this.b.dw(), this.b.dy(), 10.0F, (float)this.a.Z());
      this.e--;
   }

   private boolean a(ckl $$0) {
      for (bop $$1 : bop.values()) {
         csd $$2 = $$0.b($$1);
         if (this.a.r() && $$2.a(csg.rz)) {
            return true;
         }

         if (this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
