import java.util.EnumSet;
import javax.annotation.Nullable;

public class bnd extends bmv {
   public static final float a = 0.02F;
   protected final bgb b;
   @Nullable
   protected bfj c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bfz> f;
   protected final bqm g;

   public bnd(bgb $$0, Class<? extends bfz> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bnd(bgb $$0, Class<? extends bfz> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bnd(bgb $$0, Class<? extends bfz> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bmv.a.b));
      if ($$1 == byo.class) {
         this.g = bqm.b().a((double)$$2).a($$1x -> bfm.b($$0).test($$1x));
      } else {
         this.g = bqm.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.ec().i() >= this.e) {
         return false;
      } else {
         if (this.b.j() != null) {
            this.c = this.b.j();
         }

         if (this.f == byo.class) {
            this.c = this.b.dI().a(this.g, this.b, this.b.dn(), this.b.dr(), this.b.dt());
         } else {
            this.c = this.b
               .dI()
               .a(this.b.dI().a(this.f, this.b.cE().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dn(), this.b.dr(), this.b.dt());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bs()) {
         return false;
      } else {
         return this.b.f(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.ec().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bs()) {
         double $$0 = this.i ? this.b.dr() : this.c.dr();
         this.b.E().a(this.c.dn(), $$0, this.c.dt());
         this.h--;
      }
   }
}
