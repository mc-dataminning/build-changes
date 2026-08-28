import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbg extends cby {
   private final chu a;
   @Nullable
   private com b;
   private final dfb c;
   private final float d;
   private int e;
   private final cfr f;

   public cbg(chu $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dX();
      this.d = $$1;
      this.f = cfr.b().a((double)$$1);
      this.a(EnumSet.of(cby.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bM()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.A(true);
      this.e = this.a(40 + this.a.ea().a(40));
   }

   @Override
   public void e() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.K().a(this.b.dC(), this.b.dG(), this.b.dI(), 10.0F, (float)this.a.ad());
      this.e--;
   }

   private boolean a(com $$0) {
      for (bsc $$1 : bsc.values()) {
         cwb $$2 = $$0.b($$1);
         if ($$2.a(cwf.rA) || this.a.l($$2)) {
            return true;
         }
      }

      return false;
   }
}
