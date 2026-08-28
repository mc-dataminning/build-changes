import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdg extends cdy {
   private final cka a;
   @Nullable
   private cqy b;
   private final arq c;
   private final float d;
   private int e;
   private final chr f;

   public cdg(cka $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = chr.b().a((double)$$1);
      this.a(EnumSet.of(cdy.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bK()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dY().a(40));
   }

   @Override
   public void e() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.J().a(this.b.dA(), this.b.dE(), this.b.dG(), 10.0F, (float)this.a.ac());
      this.e--;
   }

   private boolean a(cqy $$0) {
      for (bua $$1 : bua.values()) {
         cyy $$2 = $$0.b($$1);
         if ($$2.a(czc.sC) || this.a.j($$2)) {
            return true;
         }
      }

      return false;
   }
}
