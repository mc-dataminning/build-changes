import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bza extends bzo {
   private static final cdh d = cdh.b().a(8.0).d();
   protected final ceg a;
   private final Class<? extends ceg> e;
   protected final daz b;
   @Nullable
   protected ceg c;
   private int f;
   private final double g;

   public bza(ceg $$0, double $$1) {
      this($$0, $$1, (Class<? extends ceg>)$$0.getClass());
   }

   public bza(ceg $$0, double $$1, Class<? extends ceg> $$2) {
      this.a = $$0;
      this.b = $$0.dP();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bzo.a.a, bzo.a.b));
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
      return this.c.bD() && this.c.gt() && this.f < 60 && !this.c.gm();
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
   private ceg h() {
      List<? extends ceg> $$0 = this.b.a(this.e, d, this.a, this.a.cK().g(8.0));
      double $$1 = Double.MAX_VALUE;
      ceg $$2 = null;

      for (ceg $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gm() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqn)this.b, this.c);
   }
}
