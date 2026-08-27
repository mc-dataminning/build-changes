import java.util.EnumSet;
import javax.annotation.Nullable;

public class bsu extends btb {
   protected final bmo a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final cti f;

   public bsu(bmo $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dM();
      this.a(EnumSet.of(btb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.q() != null) {
         return false;
      } else if (!this.f.P()) {
         return false;
      } else if (!this.a.bN()) {
         return false;
      } else if (!this.f.h(this.a.dm())) {
         return false;
      } else {
         return !this.a.c(blu.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      elm $$0 = this.i();
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
   protected elm i() {
      aup $$0 = this.a.eg();
      hx $$1 = this.a.dm();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         hx $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.h($$3) < 0.0F) {
            return elm.c($$3);
         }
      }

      return null;
   }
}
