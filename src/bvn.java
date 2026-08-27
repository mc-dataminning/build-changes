import java.util.EnumSet;
import javax.annotation.Nullable;

public class bvn extends bvu {
   protected final bpf a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final cwe f;

   public bvn(bpf $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dJ();
      this.a(EnumSet.of(bvu.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.q() != null) {
         return false;
      } else if (!this.f.P()) {
         return false;
      } else if (!this.a.bK()) {
         return false;
      } else if (!this.f.h(this.a.dj())) {
         return false;
      } else {
         return !this.a.c(bom.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      eov $$0 = this.i();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0.c;
         this.c = $$0.d;
         this.d = $$0.e;
         return true;
      }
   }

   @Override
   public boolean b() {
      return !this.a.N().l();
   }

   @Override
   public void c() {
      this.a.N().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected eov i() {
      awt $$0 = this.a.ef();
      ib $$1 = this.a.dj();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         ib $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.h($$3) < 0.0F) {
            return eov.c($$3);
         }
      }

      return null;
   }
}
