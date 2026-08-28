import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cab extends cap {
   private static final cei d = cei.b().a(8.0).d();
   protected final cfh a;
   private final Class<? extends cfh> e;
   protected final dca b;
   @Nullable
   protected cfh c;
   private int f;
   private final double g;

   public cab(cfh $$0, double $$1) {
      this($$0, $$1, (Class<? extends cfh>)$$0.getClass());
   }

   public cab(cfh $$0, double $$1, Class<? extends cfh> $$2) {
      this.a = $$0;
      this.b = $$0.dP();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cap.a.a, cap.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gu()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bD() && this.c.gu() && this.f < 60 && !this.c.gn();
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
   private cfh h() {
      List<? extends cfh> $$0 = this.b.a(this.e, d, this.a, this.a.cK().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cfh $$2 = null;

      for (cfh $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gn() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((arf)this.b, this.c);
   }
}
