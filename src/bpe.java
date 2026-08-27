import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpe extends bpw {
   private final bvp a;
   @Nullable
   private cbp b;
   private final cpq c;
   private final float d;
   private int e;
   private final btn f;

   public bpe(bvp $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dK();
      this.d = $$1;
      this.f = btn.b().a((double)$$1);
      this.a(EnumSet.of(bpw.a.b));
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
         return this.a.f((bil)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.A(true);
      this.e = this.a(40 + this.a.ee().a(40));
   }

   @Override
   public void d() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.D().a(this.b.dp(), this.b.dt(), this.b.dv(), 10.0F, (float)this.a.W());
      this.e--;
   }

   private boolean a(cbp $$0) {
      for (bgs $$1 : bgs.values()) {
         cja $$2 = $$0.b($$1);
         if (this.a.p() && $$2.a(cjd.qL)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
