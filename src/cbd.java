import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbd extends cbk {
   protected final buv a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dej f;

   public cbd(buv $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dS();
      this.a(EnumSet.of(cbk.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.m() != null) {
         return false;
      } else if (!this.f.S()) {
         return false;
      } else if (!this.a.bV()) {
         return false;
      } else if (!this.f.h(this.a.ds())) {
         return false;
      } else {
         return !this.a.a(btz.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      eyw $$0 = this.i();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0.d;
         this.c = $$0.e;
         this.d = $$0.f;
         return true;
      }
   }

   @Override
   public boolean c() {
      return !this.a.P().m();
   }

   @Override
   public void d() {
      this.a.P().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected eyw i() {
      azn $$0 = this.a.dV();
      jf $$1 = this.a.ds();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         jf $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return eyw.c($$3);
         }
      }

      return null;
   }
}
