import com.mojang.serialization.MapCodec;

public class dmb extends dnw implements doo {
   public static final MapCodec<dmb> b = b(dmb::new);
   public static final dvj c = dvi.C;
   public static final dvj d = dvi.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dmb> a() {
      return b;
   }

   public dmb(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jk.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == equ.c;
      return this.n().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dus $$0, dej $$1, jf $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dus $$0, dej $$1, jf $$2) {
      jk $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, erx.a($$1, $$3, null));
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$1.ad() && (long)$$1.z.a(200) <= $$1.aa() % 200L && $$2.v() == $$1.a(eao.a.b, $$2.u(), $$2.w()) - 1) {
         azj.a($$0.c(a).o(), $$1, $$2, 0.125, lo.aT, brd.a(1, 2));
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }
}
