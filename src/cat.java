import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cat extends cbh {
   private static final cfa d = cfa.b().a(8.0).d();
   protected final cga a;
   private final Class<? extends cga> e;
   protected final deg b;
   @Nullable
   protected cga c;
   private int f;
   private final double g;

   public cat(cga $$0, double $$1) {
      this($$0, $$1, (Class<? extends cga>)$$0.getClass());
   }

   public cat(cga $$0, double $$1, Class<? extends cga> $$2) {
      this.a = $$0;
      this.b = $$0.dS();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cbh.a.a, cbh.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gz()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bI() && this.c.gz() && this.f < 60 && !this.c.gm();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.K().a(this.c, 10.0F, (float)this.a.ae());
      this.a.P().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cga h() {
      List<? extends cga> $$0 = this.b.a(this.e, d, this.a, this.a.cO().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cga $$2 = null;

      for (cga $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gm() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((arh)this.b, this.c);
   }
}
