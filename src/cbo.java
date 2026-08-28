import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbo extends ccc {
   private static final cfv d = cfv.b().a(8.0).d();
   protected final cgv a;
   private final Class<? extends cgv> e;
   protected final dff b;
   @Nullable
   protected cgv c;
   private int f;
   private final double g;

   public cbo(cgv $$0, double $$1) {
      this($$0, $$1, (Class<? extends cgv>)$$0.getClass());
   }

   public cbo(cgv $$0, double $$1, Class<? extends cgv> $$2) {
      this.a = $$0;
      this.b = $$0.dY();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gF()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bN() && this.c.gF() && this.f < 60 && !this.c.gs();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.K().a(this.c, 10.0F, (float)this.a.ad());
      this.a.P().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cgv h() {
      List<? extends cgv> $$0 = this.b.a(this.e, d, this.a, this.a.cT().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cgv $$2 = null;

      for (cgv $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gs() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((arq)this.b, this.c);
   }
}
