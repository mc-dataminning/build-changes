import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbv extends ccc {
   protected final bvm a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dff f;

   public cbv(bvm $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dY();
      this.a(EnumSet.of(ccc.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.m() != null) {
         return false;
      } else if (!this.f.S()) {
         return false;
      } else if (!this.a.ca()) {
         return false;
      } else if (!this.f.h(this.a.dy())) {
         return false;
      } else {
         return !this.a.a(buq.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      ezr $$0 = this.i();
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
   protected ezr i() {
      azv $$0 = this.a.eb();
      jh $$1 = this.a.dy();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         jh $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return ezr.c($$3);
         }
      }

      return null;
   }
}
