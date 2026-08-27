import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpl extends bqd {
   private final bvw a;
   @Nullable
   private cbw b;
   private final cpx c;
   private final float d;
   private int e;
   private final btu f;

   public bpl(bvw $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dL();
      this.d = $$1;
      this.f = btu.b().a((double)$$1);
      this.a(EnumSet.of(bqd.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bv()) {
         return false;
      } else {
         return this.a.f((bis)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
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
      this.a.G().a(this.b.dq(), this.b.du(), this.b.dw(), 10.0F, (float)this.a.Y());
      this.e--;
   }

   private boolean a(cbw $$0) {
      for (bgz $$1 : bgz.values()) {
         cjh $$2 = $$0.b($$1);
         if (this.a.s() && $$2.a(cjk.qL)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
