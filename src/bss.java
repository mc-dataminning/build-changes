import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bss extends btg {
   private static final bwy d = bwy.b().a(8.0).d();
   protected final bxx a;
   private final Class<? extends bxx> e;
   protected final cto b;
   @Nullable
   protected bxx c;
   private int f;
   private final double g;

   public bss(bxx $$0, double $$1) {
      this($$0, $$1, (Class<? extends bxx>)$$0.getClass());
   }

   public bss(bxx $$0, double $$1, Class<? extends bxx> $$2) {
      this.a = $$0;
      this.b = $$0.dM();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(btg.a.a, btg.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gi()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bx() && this.c.gi() && this.f < 60 && !this.c.gb();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.I().a(this.c, 10.0F, (float)this.a.aa());
      this.a.N().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private bxx h() {
      List<? extends bxx> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bxx $$2 = null;

      for (bxx $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gb() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((and)this.b, this.c);
   }
}
