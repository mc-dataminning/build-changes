import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdr extends cef {
   private static final chy d = chy.b().a(8.0).d();
   protected final ciz a;
   private final Class<? extends ciz> e;
   protected final arq b;
   @Nullable
   protected ciz c;
   private int f;
   private final double g;

   public cdr(ciz $$0, double $$1) {
      this($$0, $$1, (Class<? extends ciz>)$$0.getClass());
   }

   public cdr(ciz $$0, double $$1, Class<? extends ciz> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cef.a.a, cef.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gD()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bI() && this.c.gD() && this.f < 60 && !this.c.gq();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.J().a(this.c, 10.0F, (float)this.a.ad());
      this.a.O().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private ciz h() {
      List<? extends ciz> $$0 = this.b.a(this.e, d, this.a, this.a.cQ().g(8.0));
      double $$1 = Double.MAX_VALUE;
      ciz $$2 = null;

      for (ciz $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gq() && this.a.g($$3) < $$1) {
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
