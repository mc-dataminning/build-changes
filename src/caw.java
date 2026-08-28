import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class caw extends cbk {
   private static final cfd d = cfd.b().a(8.0).d();
   protected final cgd a;
   private final Class<? extends cgd> e;
   protected final dej b;
   @Nullable
   protected cgd c;
   private int f;
   private final double g;

   public caw(cgd $$0, double $$1) {
      this($$0, $$1, (Class<? extends cgd>)$$0.getClass());
   }

   public caw(cgd $$0, double $$1, Class<? extends cgd> $$2) {
      this.a = $$0;
      this.b = $$0.dS();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cbk.a.a, cbk.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gy()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bI() && this.c.gy() && this.f < 60 && !this.c.gl();
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
   private cgd h() {
      List<? extends cgd> $$0 = this.b.a(this.e, d, this.a, this.a.cO().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cgd $$2 = null;

      for (cgd $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gl() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((arj)this.b, this.c);
   }
}
