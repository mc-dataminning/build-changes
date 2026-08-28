import java.util.EnumSet;
import javax.annotation.Nullable;

public class cak extends cbc {
   private final cgy a;
   @Nullable
   private cnp b;
   private final dds c;
   private final float d;
   private int e;
   private final cev f;

   public cak(cgy $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dS();
      this.d = $$1;
      this.f = cev.b().a((double)$$1);
      this.a(EnumSet.of(cbc.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bI()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.A(true);
      this.e = this.a(40 + this.a.dV().a(40));
   }

   @Override
   public void e() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.K().a(this.b.dx(), this.b.dB(), this.b.dD(), 10.0F, (float)this.a.ae());
      this.e--;
   }

   private boolean a(cnp $$0) {
      for (brj $$1 : brj.values()) {
         cvl $$2 = $$0.b($$1);
         if ($$2.a(cvo.rA) || this.a.p($$2)) {
            return true;
         }
      }

      return false;
   }
}
