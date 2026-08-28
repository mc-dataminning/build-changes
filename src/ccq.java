import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccq extends cde {
   private static final cgx d = cgx.b().a(8.0).d();
   protected final chx a;
   private final Class<? extends chx> e;
   protected final ash b;
   @Nullable
   protected chx c;
   private int f;
   private final double g;

   public ccq(chx $$0, double $$1) {
      this($$0, $$1, (Class<? extends chx>)$$0.getClass());
   }

   public ccq(chx $$0, double $$1, Class<? extends chx> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cde.a.a, cde.a.b));
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
   private chx h() {
      List<? extends chx> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      chx $$2 = null;

      for (chx $$3 : $$0) {
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
