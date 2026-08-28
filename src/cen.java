import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cen extends cfb {
   private static final ciu d = ciu.b().a(8.0).d();
   protected final cjv a;
   private final Class<? extends cjv> e;
   protected final asb b;
   @Nullable
   protected cjv c;
   private int f;
   private final double g;

   public cen(cjv $$0, double $$1) {
      this($$0, $$1, (Class<? extends cjv>)$$0.getClass());
   }

   public cen(cjv $$0, double $$1, Class<? extends cjv> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cfb.a.a, cfb.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gE()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bJ() && this.c.gE() && this.f < 60 && !this.c.gr();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.I().a(this.c, 10.0F, (float)this.a.ac());
      this.a.N().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cjv h() {
      List<? extends cjv> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cjv $$2 = null;

      for (cjv $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gr() && this.a.g($$3) < $$1) {
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
