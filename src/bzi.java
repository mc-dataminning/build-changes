import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzi extends bzw {
   private static final cdp d = cdp.b().a(8.0).d();
   protected final ceo a;
   private final Class<? extends ceo> e;
   protected final dcd b;
   @Nullable
   protected ceo c;
   private int f;
   private final double g;

   public bzi(ceo $$0, double $$1) {
      this($$0, $$1, (Class<? extends ceo>)$$0.getClass());
   }

   public bzi(ceo $$0, double $$1, Class<? extends ceo> $$2) {
      this.a = $$0;
      this.b = $$0.dP();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bzw.a.a, bzw.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gr()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bD() && this.c.gr() && this.f < 60 && !this.c.gk();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.G().a(this.c, 10.0F, (float)this.a.aa());
      this.a.K().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private ceo h() {
      List<? extends ceo> $$0 = this.b.a(this.e, d, this.a, this.a.cK().g(8.0));
      double $$1 = Double.MAX_VALUE;
      ceo $$2 = null;

      for (ceo $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gk() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqk)this.b, this.c);
   }
}
