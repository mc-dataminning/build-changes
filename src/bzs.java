import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzs extends cak {
   private final cgf a;
   @Nullable
   private cmv b;
   private final dcu c;
   private final float d;
   private int e;
   private final ced f;

   public bzs(cgf $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dQ();
      this.d = $$1;
      this.f = ced.b().a((double)$$1);
      this.a(EnumSet.of(cak.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bE()) {
         return false;
      } else {
         return this.a.g((bsq)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dT().a(40));
   }

   @Override
   public void e() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.F().a(this.b.dv(), this.b.dz(), this.b.dB(), 10.0F, (float)this.a.aa());
      this.e--;
   }

   private boolean a(cmv $$0) {
      for (bqp $$1 : bqp.values()) {
         cuo $$2 = $$0.b($$1);
         if ($$2.a(cur.rz) || this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
