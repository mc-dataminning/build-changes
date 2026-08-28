import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzh extends bzz {
   private final cfu a;
   @Nullable
   private cmk b;
   private final dcf c;
   private final float d;
   private int e;
   private final cds f;

   public bzh(cfu $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dQ();
      this.d = $$1;
      this.f = cds.b().a((double)$$1);
      this.a(EnumSet.of(bzz.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bE()) {
         return false;
      } else {
         return this.a.g((bsg)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dT().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.G().a(this.b.dv(), this.b.dz(), this.b.dB(), 10.0F, (float)this.a.aa());
      this.e--;
   }

   private boolean a(cmk $$0) {
      for (bqf $$1 : bqf.values()) {
         cuc $$2 = $$0.b($$1);
         if (this.a.s() && $$2.a(cuf.rz)) {
            return true;
         }

         if (this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
