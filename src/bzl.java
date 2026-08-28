import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzl extends bzz {
   private static final cds d = cds.b().a(8.0).d();
   protected final cer a;
   private final Class<? extends cer> e;
   protected final dcf b;
   @Nullable
   protected cer c;
   private int f;
   private final double g;

   public bzl(cer $$0, double $$1) {
      this($$0, $$1, (Class<? extends cer>)$$0.getClass());
   }

   public bzl(cer $$0, double $$1, Class<? extends cer> $$2) {
      this.a = $$0;
      this.b = $$0.dQ();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bzz.a.a, bzz.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gs()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bE() && this.c.gs() && this.f < 60 && !this.c.gl();
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
   private cer h() {
      List<? extends cer> $$0 = this.b.a(this.e, d, this.a, this.a.cL().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cer $$2 = null;

      for (cer $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gl() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqm)this.b, this.c);
   }
}
