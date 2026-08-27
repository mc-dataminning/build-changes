import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bsn extends btb {
   private static final bwt d = bwt.b().a(8.0).d();
   protected final bxs a;
   private final Class<? extends bxs> e;
   protected final cti b;
   @Nullable
   protected bxs c;
   private int f;
   private final double g;

   public bsn(bxs $$0, double $$1) {
      this($$0, $$1, (Class<? extends bxs>)$$0.getClass());
   }

   public bsn(bxs $$0, double $$1, Class<? extends bxs> $$2) {
      this.a = $$0;
      this.b = $$0.dM();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(btb.a.a, btb.a.b));
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
   private bxs h() {
      List<? extends bxs> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bxs $$2 = null;

      for (bxs $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gb() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((amz)this.b, this.c);
   }
}
