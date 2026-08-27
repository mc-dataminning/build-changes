import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bqq extends bre {
   private static final buv d = buv.b().a(8.0).d();
   protected final bvu a;
   private final Class<? extends bvu> e;
   protected final cqz b;
   @Nullable
   protected bvu c;
   private int f;
   private final double g;

   public bqq(bvu $$0, double $$1) {
      this($$0, $$1, (Class<? extends bvu>)$$0.getClass());
   }

   public bqq(bvu $$0, double $$1, Class<? extends bvu> $$2) {
      this.a = $$0;
      this.b = $$0.dL();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bre.a.a, bre.a.b));
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
      return this.c.bv() && this.c.gi() && this.f < 60 && !this.c.gb();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.G().a(this.c, 10.0F, (float)this.a.Y());
      this.a.L().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private bvu h() {
      List<? extends bvu> $$0 = this.b.a(this.e, d, this.a, this.a.cG().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bvu $$2 = null;

      for (bvu $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gb() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((alq)this.b, this.c);
   }
}
