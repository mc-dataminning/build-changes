import java.util.EnumSet;
import javax.annotation.Nullable;

public class cck extends ccc {
   public static final float a = 0.02F;
   protected final bvg b;
   @Nullable
   protected bui c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bve> f;
   protected final cfv g;

   public cck(bvg $$0, Class<? extends bve> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cck(bvg $$0, Class<? extends bve> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cck(bvg $$0, Class<? extends bve> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(ccc.a.b));
      if ($$1 == cor.class) {
         this.g = cfv.b().a((double)$$2).a($$1x -> bun.b($$0).test($$1x));
      } else {
         this.g = cfv.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.eb().i() >= this.e) {
         return false;
      } else {
         if (this.b.m() != null) {
            this.c = this.b.m();
         }

         if (this.f == cor.class) {
            this.c = this.b.dY().a(this.g, this.b, this.b.dD(), this.b.dH(), this.b.dJ());
         } else {
            this.c = this.b
               .dY()
               .a(this.b.dY().a(this.f, this.b.cT().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dD(), this.b.dH(), this.b.dJ());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bN()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.eb().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bN()) {
         double $$0 = this.i ? this.b.dH() : this.c.dH();
         this.b.K().a(this.c.dD(), $$0, this.c.dJ());
         this.h--;
      }
   }
}
