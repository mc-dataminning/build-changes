import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzw extends cak {
   private static final ced d = ced.b().a(8.0).d();
   protected final cfc a;
   private final Class<? extends cfc> e;
   protected final dcu b;
   @Nullable
   protected cfc c;
   private int f;
   private final double g;

   public bzw(cfc $$0, double $$1) {
      this($$0, $$1, (Class<? extends cfc>)$$0.getClass());
   }

   public bzw(cfc $$0, double $$1, Class<? extends cfc> $$2) {
      this.a = $$0;
      this.b = $$0.dQ();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gu()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bE() && this.c.gu() && this.f < 60 && !this.c.gj();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.F().a(this.c, 10.0F, (float)this.a.aa());
      this.a.J().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cfc h() {
      List<? extends cfc> $$0 = this.b.a(this.e, d, this.a, this.a.cL().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cfc $$2 = null;

      for (cfc $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gj() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqt)this.b, this.c);
   }
}
