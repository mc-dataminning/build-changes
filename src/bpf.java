import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bpf extends bpt {
   private static final btk d = btk.b().a(8.0).d();
   protected final buj a;
   private final Class<? extends buj> e;
   protected final cpl b;
   @Nullable
   protected buj c;
   private int f;
   private final double g;

   public bpf(buj $$0, double $$1) {
      this($$0, $$1, (Class<? extends buj>)$$0.getClass());
   }

   public bpf(buj $$0, double $$1, Class<? extends buj> $$2) {
      this.a = $$0;
      this.b = $$0.dK();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bpt.a.a, bpt.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.ge()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bv() && this.c.ge() && this.f < 60;
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.D().a(this.c, 10.0F, (float)this.a.W());
      this.a.H().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private buj h() {
      List<? extends buj> $$0 = this.b.a(this.e, d, this.a, this.a.cG().g(8.0));
      double $$1 = Double.MAX_VALUE;
      buj $$2 = null;

      for (buj $$3 : $$0) {
         if (this.a.a($$3) && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((akk)this.b, this.c);
   }
}
