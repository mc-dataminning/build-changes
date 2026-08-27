import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class byj extends byx {
   private static final ccq d = ccq.b().a(8.0).d();
   protected final cdp a;
   private final Class<? extends cdp> e;
   protected final dad b;
   @Nullable
   protected cdp c;
   private int f;
   private final double g;

   public byj(cdp $$0, double $$1) {
      this($$0, $$1, (Class<? extends cdp>)$$0.getClass());
   }

   public byj(cdp $$0, double $$1, Class<? extends cdp> $$2) {
      this.a = $$0;
      this.b = $$0.dN();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(byx.a.a, byx.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gt()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bB() && this.c.gt() && this.f < 60 && !this.c.gm();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.G().a(this.c, 10.0F, (float)this.a.Z());
      this.a.K().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cdp h() {
      List<? extends cdp> $$0 = this.b.a(this.e, d, this.a, this.a.cI().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cdp $$2 = null;

      for (cdp $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gm() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqh)this.b, this.c);
   }
}
