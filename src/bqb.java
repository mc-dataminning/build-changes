import java.util.EnumSet;
import javax.annotation.Nullable;

public class bqb extends bpt {
   public static final float a = 0.02F;
   protected final bja b;
   @Nullable
   protected bii c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends biy> f;
   protected final btk g;

   public bqb(bja $$0, Class<? extends biy> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bqb(bja $$0, Class<? extends biy> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bqb(bja $$0, Class<? extends biy> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bpt.a.b));
      if ($$1 == cbm.class) {
         this.g = btk.b().a((double)$$2).a($$1x -> bil.b($$0).test($$1x));
      } else {
         this.g = btk.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.ee().i() >= this.e) {
         return false;
      } else {
         if (this.b.j() != null) {
            this.c = this.b.j();
         }

         if (this.f == cbm.class) {
            this.c = this.b.dK().a(this.g, this.b, this.b.dp(), this.b.dt(), this.b.dv());
         } else {
            this.c = this.b
               .dK()
               .a(this.b.dK().a(this.f, this.b.cG().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dp(), this.b.dt(), this.b.dv());
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
      this.h = this.a(40 + this.b.ee().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bv()) {
         double $$0 = this.i ? this.b.dt() : this.c.dt();
         this.b.D().a(this.c.dp(), $$0, this.c.dv());
         this.h--;
      }
   }
}
