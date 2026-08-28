import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzm extends caa {
   private static final cdt d = cdt.b().a(8.0).d();
   protected final ces a;
   private final Class<? extends ces> e;
   protected final dcg b;
   @Nullable
   protected ces c;
   private int f;
   private final double g;

   public bzm(ces $$0, double $$1) {
      this($$0, $$1, (Class<? extends ces>)$$0.getClass());
   }

   public bzm(ces $$0, double $$1, Class<? extends ces> $$2) {
      this.a = $$0;
      this.b = $$0.dR();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(caa.a.a, caa.a.b));
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
      return this.c.bF() && this.c.gr() && this.f < 60 && !this.c.gk();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.F().a(this.c, 10.0F, (float)this.a.aa());
      this.a.J().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private ces h() {
      List<? extends ces> $$0 = this.b.a(this.e, d, this.a, this.a.cM().g(8.0));
      double $$1 = Double.MAX_VALUE;
      ces $$2 = null;

      for (ces $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gk() && this.a.g($$3) < $$1) {
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
