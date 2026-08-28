import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cei extends cea {
   public static final float a = 0.02F;
   protected final bxg b;
   @Nullable
   protected bwf c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bxe> f;
   protected final cht g;

   public cei(bxg $$0, Class<? extends bxe> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cei(bxg $$0, Class<? extends bxe> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cei(bxg $$0, Class<? extends bxe> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(cea.a.b));
      if ($$1 == crc.class) {
         Predicate<bwf> $$5 = bwm.b($$0);
         this.g = cht.b().a((double)$$2).a(($$1x, $$2x) -> $$5.test($$1x));
      } else {
         this.g = cht.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.dY().i() >= this.e) {
         return false;
      } else {
         if (this.b.f() != null) {
            this.c = this.b.f();
         }

         arq $$0 = a(this.b);
         if (this.f == crc.class) {
            this.c = $$0.a(this.g, this.b, this.b.dA(), this.b.dE(), this.b.dG());
         } else {
            this.c = $$0.a(
               this.b.dV().a(this.f, this.b.cR().c((double)this.d, 3.0, (double)this.d), $$0x -> true), this.g, this.b, this.b.dA(), this.b.dE(), this.b.dG()
            );
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bK()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.dY().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bK()) {
         double $$0 = this.i ? this.b.dE() : this.c.dE();
         this.b.J().a(this.c.dA(), $$0, this.c.dG());
         this.h--;
      }
   }
}
