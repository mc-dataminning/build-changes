import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brf extends brt {
   private static final bvk d = bvk.b().a(8.0).d();
   protected final bwj a;
   private final Class<? extends bwj> e;
   protected final crs b;
   @Nullable
   protected bwj c;
   private int f;
   private final double g;

   public brf(bwj $$0, double $$1) {
      this($$0, $$1, (Class<? extends bwj>)$$0.getClass());
   }

   public brf(bwj $$0, double $$1, Class<? extends bwj> $$2) {
      this.a = $$0;
      this.b = $$0.dL();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(brt.a.a, brt.a.b));
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
   private bwj h() {
      List<? extends bwj> $$0 = this.b.a(this.e, d, this.a, this.a.cG().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bwj $$2 = null;

      for (bwj $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gb() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((ama)this.b, this.c);
   }
}
