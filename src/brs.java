import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brs extends bsg {
   private static final bvx d = bvx.b().a(8.0).d();
   protected final bww a;
   private final Class<? extends bww> e;
   protected final csf b;
   @Nullable
   protected bww c;
   private int f;
   private final double g;

   public brs(bww $$0, double $$1) {
      this($$0, $$1, (Class<? extends bww>)$$0.getClass());
   }

   public brs(bww $$0, double $$1, Class<? extends bww> $$2) {
      this.a = $$0;
      this.b = $$0.dN();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bsg.a.a, bsg.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gj()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bx() && this.c.gj() && this.f < 60 && !this.c.gc();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.I().a(this.c, 10.0F, (float)this.a.aa());
      this.a.N().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private bww h() {
      List<? extends bww> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bww $$2 = null;

      for (bww $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gc() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((ami)this.b, this.c);
   }
}
