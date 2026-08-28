import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbk extends ccc {
   private final chy a;
   @Nullable
   private cor b;
   private final dff c;
   private final float d;
   private int e;
   private final cfv f;

   public cbk(chy $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dY();
      this.d = $$1;
      this.f = cfv.b().a((double)$$1);
      this.a(EnumSet.of(ccc.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bN()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.A(true);
      this.e = this.a(40 + this.a.eb().a(40));
   }

   @Override
   public void e() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.K().a(this.b.dD(), this.b.dH(), this.b.dJ(), 10.0F, (float)this.a.ad());
      this.e--;
   }

   private boolean a(cor $$0) {
      for (bsg $$1 : bsg.values()) {
         cwf $$2 = $$0.b($$1);
         if ($$2.a(cwj.rQ) || this.a.l($$2)) {
            return true;
         }
      }

      return false;
   }
}
