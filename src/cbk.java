import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbk extends cby {
   private static final cfr d = cfr.b().a(8.0).d();
   protected final cgr a;
   private final Class<? extends cgr> e;
   protected final dfb b;
   @Nullable
   protected cgr c;
   private int f;
   private final double g;

   public cbk(cgr $$0, double $$1) {
      this($$0, $$1, (Class<? extends cgr>)$$0.getClass());
   }

   public cbk(cgr $$0, double $$1, Class<? extends cgr> $$2) {
      this.a = $$0;
      this.b = $$0.dX();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cby.a.a, cby.a.b));
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
      return this.c.bM() && this.c.gE() && this.f < 60 && !this.c.gr();
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
   private cgr h() {
      List<? extends cgr> $$0 = this.b.a(this.e, d, this.a, this.a.cS().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cgr $$2 = null;

      for (cgr $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gr() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((arn)this.b, this.c);
   }
}
