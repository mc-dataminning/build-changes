import java.util.EnumSet;
import javax.annotation.Nullable;

public class bro extends bsg {
   private final bxz a;
   @Nullable
   private cdz b;
   private final csf c;
   private final float d;
   private int e;
   private final bvx f;

   public bro(bxz $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dN();
      this.d = $$1;
      this.f = bvx.b().a((double)$$1);
      this.a(EnumSet.of(bsg.a.b));
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
         return this.a.f((bkv)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.A(true);
      this.e = this.a(40 + this.a.eh().a(40));
   }

   @Override
   public void d() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.I().a(this.b.ds(), this.b.dw(), this.b.dy(), 10.0F, (float)this.a.aa());
      this.e--;
   }

   private boolean a(cdz $$0) {
      for (bja $$1 : bja.values()) {
         clo $$2 = $$0.b($$1);
         if (this.a.u() && $$2.a(clr.rw)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
