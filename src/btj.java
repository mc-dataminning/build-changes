import java.util.EnumSet;
import javax.annotation.Nullable;

public class btj extends btb {
   public static final float a = 0.02F;
   protected final bmh b;
   @Nullable
   protected blp c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bmf> f;
   protected final bwt g;

   public btj(bmh $$0, Class<? extends bmf> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public btj(bmh $$0, Class<? extends bmf> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public btj(bmh $$0, Class<? extends bmf> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(btb.a.b));
      if ($$1 == cfb.class) {
         this.g = bwt.b().a((double)$$2).a($$1x -> bls.b($$0).test($$1x));
      } else {
         this.g = bwt.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.eg().i() >= this.e) {
         return false;
      } else {
         if (this.b.q() != null) {
            this.c = this.b.q();
         }

         if (this.f == cfb.class) {
            this.c = this.b.dM().a(this.g, this.b, this.b.dr(), this.b.dv(), this.b.dx());
         } else {
            this.c = this.b
               .dM()
               .a(this.b.dM().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dr(), this.b.dv(), this.b.dx());
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
      this.h = this.a(40 + this.b.eg().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bx()) {
         double $$0 = this.i ? this.b.dv() : this.c.dv();
         this.b.I().a(this.c.dr(), $$0, this.c.dx());
         this.h--;
      }
   }
}
