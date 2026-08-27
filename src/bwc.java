import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwc extends bvu {
   public static final float a = 0.02F;
   protected final boz b;
   @Nullable
   protected bof c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends box> f;
   protected final bzn g;

   public bwc(boz $$0, Class<? extends box> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bwc(boz $$0, Class<? extends box> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bwc(boz $$0, Class<? extends box> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bvu.a.b));
      if ($$1 == cia.class) {
         this.g = bzn.b().a((double)$$2).a($$1x -> bok.b($$0).test($$1x));
      } else {
         this.g = bzn.b().a((double)$$2);
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

         if (this.f == cia.class) {
            this.c = this.b.dJ().a(this.g, this.b, this.b.do(), this.b.ds(), this.b.du());
         } else {
            this.c = this.b
               .dJ()
               .a(this.b.dJ().a(this.f, this.b.cE().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.do(), this.b.ds(), this.b.du());
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
      this.h = this.a(40 + this.b.ef().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bx()) {
         double $$0 = this.i ? this.b.ds() : this.c.ds();
         this.b.I().a(this.c.do(), $$0, this.c.du());
         this.h--;
      }
   }
}
