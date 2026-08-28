import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbf extends cbt {
   private static final cfm d = cfm.b().a(8.0).d();
   protected final cgm a;
   private final Class<? extends cgm> e;
   protected final dev b;
   @Nullable
   protected cgm c;
   private int f;
   private final double g;

   public cbf(cgm $$0, double $$1) {
      this($$0, $$1, (Class<? extends cgm>)$$0.getClass());
   }

   public cbf(cgm $$0, double $$1, Class<? extends cgm> $$2) {
      this.a = $$0;
      this.b = $$0.dX();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cbt.a.a, cbt.a.b));
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
      return this.c.bM() && this.c.gF() && this.f < 60 && !this.c.gs();
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
   private cgm h() {
      List<? extends cgm> $$0 = this.b.a(this.e, d, this.a, this.a.cS().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cgm $$2 = null;

      for (cgm $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gs() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((arm)this.b, this.c);
   }
}
