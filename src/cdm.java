import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdm extends cea {
   private static final cht d = cht.b().a(8.0).d();
   protected final ciu a;
   private final Class<? extends ciu> e;
   protected final arq b;
   @Nullable
   protected ciu c;
   private int f;
   private final double g;

   public cdm(ciu $$0, double $$1) {
      this($$0, $$1, (Class<? extends ciu>)$$0.getClass());
   }

   public cdm(ciu $$0, double $$1, Class<? extends ciu> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cea.a.a, cea.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gB()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bK() && this.c.gB() && this.f < 60 && !this.c.go();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.J().a(this.c, 10.0F, (float)this.a.ac());
      this.a.O().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private ciu h() {
      List<? extends ciu> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      ciu $$2 = null;

      for (ciu $$3 : $$0) {
         if (this.a.a($$3) && !$$3.go() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a(this.b, this.c);
   }
}
