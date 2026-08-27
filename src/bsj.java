import java.util.EnumSet;
import javax.annotation.Nullable;

public class bsj extends bsb {
   public static final float a = 0.02F;
   protected final bli b;
   @Nullable
   protected bkq c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends blg> f;
   protected final bvs g;

   public bsj(bli $$0, Class<? extends blg> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bsj(bli $$0, Class<? extends blg> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bsj(bli $$0, Class<? extends blg> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bsb.a.b));
      if ($$1 == cdu.class) {
         this.g = bvs.b().a((double)$$2).a($$1x -> bkt.b($$0).test($$1x));
      } else {
         this.g = bvs.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.eh().i() >= this.e) {
         return false;
      } else {
         if (this.b.q() != null) {
            this.c = this.b.q();
         }

         if (this.f == cdu.class) {
            this.c = this.b.dN().a(this.g, this.b, this.b.ds(), this.b.dw(), this.b.dy());
         } else {
            this.c = this.b
               .dN()
               .a(this.b.dN().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.ds(), this.b.dw(), this.b.dy());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bx()) {
         return false;
      } else {
         return this.b.f(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.eh().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bx()) {
         double $$0 = this.i ? this.b.dw() : this.c.dw();
         this.b.I().a(this.c.ds(), $$0, this.c.dy());
         this.h--;
      }
   }
}
