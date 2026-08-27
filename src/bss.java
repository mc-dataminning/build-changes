import java.util.EnumSet;
import javax.annotation.Nullable;

public class bss extends btk {
   private final bzf a;
   @Nullable
   private cfq b;
   private final ctx c;
   private final float d;
   private int e;
   private final bxd f;

   public bss(bzf $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dL();
      this.d = $$1;
      this.f = bxd.b().a((double)$$1);
      this.a(EnumSet.of(btk.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bx()) {
         return false;
      } else {
         return this.a.f((blw)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.B(true);
      this.e = this.a(40 + this.a.eg().a(40));
   }

   @Override
   public void d() {
      this.a.B(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.I().a(this.b.dq(), this.b.du(), this.b.dw(), 10.0F, (float)this.a.ab());
      this.e--;
   }

   private boolean a(cfq $$0) {
      for (bkb $$1 : bkb.values()) {
         cng $$2 = $$0.b($$1);
         if (this.a.u() && $$2.a(cnj.ry)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
