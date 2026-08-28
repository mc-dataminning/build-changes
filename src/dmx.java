import com.mojang.serialization.MapCodec;

public class dmx extends djp {
   public static final MapCodec<dmx> b = b(dmx::new);
   public static final dvj c = dvi.w;

   @Override
   public MapCodec<dmx> a() {
      return b;
   }

   public dmx(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jk.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dek $$0, jf $$1) {
      if (!$$0.x_() && !$$0.R().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dej $$0, jf $$1, dus $$2) {
      jk $$3 = $$2.c(a);
      jf $$4 = $$1.a($$3.g());
      esb $$5 = erx.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.R().a($$2, this)) {
            dus $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.R().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(a, $$0.d().g().g());
   }
}
