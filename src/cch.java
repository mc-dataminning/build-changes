import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cch extends ccv {
   private static final cgo d = cgo.b().a(8.0).d();
   protected final cho a;
   private final Class<? extends cho> e;
   protected final arx b;
   @Nullable
   protected cho c;
   private int f;
   private final double g;

   public cch(cho $$0, double $$1) {
      this($$0, $$1, (Class<? extends cho>)$$0.getClass());
   }

   public cch(cho $$0, double $$1, Class<? extends cho> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(ccv.a.a, ccv.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gy()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bL() && this.c.gy() && this.f < 60 && !this.c.gl();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.H().a(this.c, 10.0F, (float)this.a.Z());
      this.a.L().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cho h() {
      List<? extends cho> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cho $$2 = null;

      for (cho $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gl() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a(this.b, this.c);
   }
}
