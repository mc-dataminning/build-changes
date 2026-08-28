import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccl extends ccz {
   private static final cgs d = cgs.b().a(8.0).d();
   protected final chs a;
   private final Class<? extends chs> e;
   protected final ash b;
   @Nullable
   protected chs c;
   private int f;
   private final double g;

   public ccl(chs $$0, double $$1) {
      this($$0, $$1, (Class<? extends chs>)$$0.getClass());
   }

   public ccl(chs $$0, double $$1, Class<? extends chs> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(ccz.a.a, ccz.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gw()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bL() && this.c.gw() && this.f < 60 && !this.c.gj();
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
   private chs h() {
      List<? extends chs> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      chs $$2 = null;

      for (chs $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gj() && this.a.g($$3) < $$1) {
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
