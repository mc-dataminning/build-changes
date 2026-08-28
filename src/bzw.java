import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzw extends cao {
   private final cgj a;
   @Nullable
   private cmy b;
   private final dbz c;
   private final float d;
   private int e;
   private final ceh f;

   public bzw(cgj $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dP();
      this.d = $$1;
      this.f = ceh.b().a((double)$$1);
      this.a(EnumSet.of(cao.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bD()) {
         return false;
      } else {
         return this.a.g((bsv)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.el().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.G().a(this.b.du(), this.b.dy(), this.b.dA(), 10.0F, (float)this.a.aa());
      this.e--;
   }

   private boolean a(cmy $$0) {
      for (bqu $$1 : bqu.values()) {
         cuq $$2 = $$0.b($$1);
         if (this.a.s() && $$2.a(cut.rz)) {
            return true;
         }

         if (this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
