import java.util.EnumSet;
import javax.annotation.Nullable;

public class byj extends byb {
   public static final float a = 0.02F;
   protected final brg b;
   @Nullable
   protected bql c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bre> f;
   protected final cbu g;

   public byj(brg $$0, Class<? extends bre> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public byj(brg $$0, Class<? extends bre> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public byj(brg $$0, Class<? extends bre> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(byb.a.b));
      if ($$1 == ckl.class) {
         this.g = cbu.b().a((double)$$2).a($$1x -> bqq.b($$0).test($$1x));
      } else {
         this.g = cbu.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.ej().i() >= this.e) {
         return false;
      } else {
         if (this.b.p() != null) {
            this.c = this.b.p();
         }

         if (this.f == ckl.class) {
            this.c = this.b.dN().a(this.g, this.b, this.b.ds(), this.b.dw(), this.b.dy());
         } else {
            this.c = this.b
               .dN()
               .a(this.b.dN().a(this.f, this.b.cI().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.ds(), this.b.dw(), this.b.dy());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bB()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.ej().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bB()) {
         double $$0 = this.i ? this.b.dw() : this.c.dw();
         this.b.G().a(this.c.ds(), $$0, this.c.dy());
         this.h--;
      }
   }
}
