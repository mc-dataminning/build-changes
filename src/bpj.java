import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpj extends bqb {
   private final bvu a;
   @Nullable
   private cbu b;
   private final cpv c;
   private final float d;
   private int e;
   private final bts f;

   public bpj(bvu $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dL();
      this.d = $$1;
      this.f = bts.b().a((double)$$1);
      this.a(EnumSet.of(bqb.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bw()) {
         return false;
      } else {
         return this.a.f((biq)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.A(true);
      this.e = this.a(40 + this.a.ef().a(40));
   }

   @Override
   public void d() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.G().a(this.b.dq(), this.b.du(), this.b.dw(), 10.0F, (float)this.a.Z());
      this.e--;
   }

   private boolean a(cbu $$0) {
      for (bgx $$1 : bgx.values()) {
         cjf $$2 = $$0.b($$1);
         if (this.a.s() && $$2.a(cji.qL)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
