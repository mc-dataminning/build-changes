import java.util.EnumSet;
import javax.annotation.Nullable;

public class bql extends bqd {
   public static final float a = 0.02F;
   protected final bjk b;
   @Nullable
   protected bis c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bji> f;
   protected final btu g;

   public bql(bjk $$0, Class<? extends bji> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bql(bjk $$0, Class<? extends bji> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bql(bjk $$0, Class<? extends bji> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bqd.a.b));
      if ($$1 == cbw.class) {
         this.g = btu.b().a((double)$$2).a($$1x -> biv.b($$0).test($$1x));
      } else {
         this.g = btu.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.ef().i() >= this.e) {
         return false;
      } else {
         if (this.b.q() != null) {
            this.c = this.b.q();
         }

         if (this.f == cbw.class) {
            this.c = this.b.dL().a(this.g, this.b, this.b.dq(), this.b.du(), this.b.dw());
         } else {
            this.c = this.b
               .dL()
               .a(this.b.dL().a(this.f, this.b.cG().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dq(), this.b.du(), this.b.dw());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bv()) {
         return false;
      } else {
         return this.b.f(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.ef().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bv()) {
         double $$0 = this.i ? this.b.du() : this.c.du();
         this.b.G().a(this.c.dq(), $$0, this.c.dw());
         this.h--;
      }
   }
}
