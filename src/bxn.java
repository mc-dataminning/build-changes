import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bxn extends byb {
   private static final cbu d = cbu.b().a(8.0).d();
   protected final cct a;
   private final Class<? extends cct> e;
   protected final czu b;
   @Nullable
   protected cct c;
   private int f;
   private final double g;

   public bxn(cct $$0, double $$1) {
      this($$0, $$1, (Class<? extends cct>)$$0.getClass());
   }

   public bxn(cct $$0, double $$1, Class<? extends cct> $$2) {
      this.a = $$0;
      this.b = $$0.dN();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(byb.a.a, byb.a.b));
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
   private cct h() {
      List<? extends cct> $$0 = this.b.a(this.e, d, this.a, this.a.cI().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cct $$2 = null;

      for (cct $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gm() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqe)this.b, this.c);
   }
}
