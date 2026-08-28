import java.util.EnumSet;
import javax.annotation.Nullable;

public class cas extends cbk {
   private final chg a;
   @Nullable
   private cnx b;
   private final dej c;
   private final float d;
   private int e;
   private final cfd f;

   public cas(chg $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dS();
      this.d = $$1;
      this.f = cfd.b().a((double)$$1);
      this.a(EnumSet.of(cbk.a.b));
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
      this.a.K().a(this.b.dx(), this.b.dB(), this.b.dD(), 10.0F, (float)this.a.ad());
      this.e--;
   }

   private boolean a(cnx $$0) {
      for (brr $$1 : brr.values()) {
         cvs $$2 = $$0.b($$1);
         if ($$2.a(cvw.rA) || this.a.n($$2)) {
            return true;
         }
      }

      return false;
   }
}
