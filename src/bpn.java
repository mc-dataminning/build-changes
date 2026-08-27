import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bpn extends bqb {
   private static final bts d = bts.b().a(8.0).d();
   protected final bur a;
   private final Class<? extends bur> e;
   protected final cpv b;
   @Nullable
   protected bur c;
   private int f;
   private final double g;

   public bpn(bur $$0, double $$1) {
      this($$0, $$1, (Class<? extends bur>)$$0.getClass());
   }

   public bpn(bur $$0, double $$1, Class<? extends bur> $$2) {
      this.a = $$0;
      this.b = $$0.dL();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bqb.a.a, bqb.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gh()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bw() && this.c.gh() && this.f < 60 && !this.c.ga();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.G().a(this.c, 10.0F, (float)this.a.Z());
      this.a.L().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private bur h() {
      List<? extends bur> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bur $$2 = null;

      for (bur $$3 : $$0) {
         if (this.a.a($$3) && !$$3.ga() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((akr)this.b, this.c);
   }
}
