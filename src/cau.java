import java.util.EnumSet;
import javax.annotation.Nullable;

public class cau extends cam {
   public static final float a = 0.02F;
   protected final btp b;
   @Nullable
   protected bsr c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends btn> f;
   protected final cef g;

   public cau(btp $$0, Class<? extends btn> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cau(btp $$0, Class<? extends btn> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cau(btp $$0, Class<? extends btn> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(cam.a.b));
      if ($$1 == cmx.class) {
         this.g = cef.b().a((double)$$2).a($$1x -> bsw.b($$0).test($$1x));
      } else {
         this.g = cef.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.dR().i() >= this.e) {
         return false;
      } else {
         if (this.b.p() != null) {
            this.c = this.b.p();
         }

         if (this.f == cmx.class) {
            this.c = this.b.dO().a(this.g, this.b, this.b.dt(), this.b.dx(), this.b.dz());
         } else {
            this.c = this.b
               .dO()
               .a(this.b.dO().a(this.f, this.b.cK().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dt(), this.b.dx(), this.b.dz());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bE()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.dR().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bE()) {
         double $$0 = this.i ? this.b.dx() : this.c.dx();
         this.b.I().a(this.c.dt(), $$0, this.c.dz());
         this.h--;
      }
   }
}
