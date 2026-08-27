import java.util.EnumSet;
import javax.annotation.Nullable;

public class bmd extends bmv {
   private final bso a;
   @Nullable
   private byo b;
   private final cmm c;
   private final float d;
   private int e;
   private final bqm f;

   public bmd(bso $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dI();
      this.d = $$1;
      this.f = bqm.b().a((double)$$1);
      this.a(EnumSet.of(bmv.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bs()) {
         return false;
      } else {
         return this.a.f((bfj)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.A(true);
      this.e = this.a(40 + this.a.ec().a(40));
   }

   @Override
   public void d() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.E().a(this.b.dn(), this.b.dr(), this.b.dt(), 10.0F, (float)this.a.X());
      this.e--;
   }

   private boolean a(byo $$0) {
      for (bdw $$1 : bdw.values()) {
         cfz $$2 = $$0.b($$1);
         if (this.a.q() && $$2.a(cgc.qL)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
