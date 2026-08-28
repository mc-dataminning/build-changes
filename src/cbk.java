import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbk extends cbc {
   public static final float a = 0.02F;
   protected final buh b;
   @Nullable
   protected btj c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends buf> f;
   protected final cev g;

   public cbk(buh $$0, Class<? extends buf> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cbk(buh $$0, Class<? extends buf> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cbk(buh $$0, Class<? extends buf> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(cbc.a.b));
      if ($$1 == cnp.class) {
         this.g = cev.b().a((double)$$2).a($$1x -> bto.b($$0).test($$1x));
      } else {
         this.g = cev.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.dV().i() >= this.e) {
         return false;
      } else {
         if (this.b.m() != null) {
            this.c = this.b.m();
         }

         if (this.f == cnp.class) {
            this.c = this.b.dS().a(this.g, this.b, this.b.dx(), this.b.dB(), this.b.dD());
         } else {
            this.c = this.b
               .dS()
               .a(this.b.dS().a(this.f, this.b.cO().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dx(), this.b.dB(), this.b.dD());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bI()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.dV().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bI()) {
         double $$0 = this.i ? this.b.dB() : this.c.dB();
         this.b.K().a(this.c.dx(), $$0, this.c.dD());
         this.h--;
      }
   }
}
