import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bpe extends bps {
   private static final btj d = btj.b().a(8.0).d();
   protected final bui a;
   private final Class<? extends bui> e;
   protected final cpk b;
   @Nullable
   protected bui c;
   private int f;
   private final double g;

   public bpe(bui $$0, double $$1) {
      this($$0, $$1, (Class<? extends bui>)$$0.getClass());
   }

   public bpe(bui $$0, double $$1, Class<? extends bui> $$2) {
      this.a = $$0;
      this.b = $$0.dK();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bps.a.a, bps.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gd()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bv() && this.c.gd() && this.f < 60;
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.D().a(this.c, 10.0F, (float)this.a.W());
      this.a.H().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private bui h() {
      List<? extends bui> $$0 = this.b.a(this.e, d, this.a, this.a.cG().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bui $$2 = null;

      for (bui $$3 : $$0) {
         if (this.a.a($$3) && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aki)this.b, this.c);
   }
}
