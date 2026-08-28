import com.mojang.serialization.MapCodec;

public class doc extends dpz implements dqr {
   public static final MapCodec<doc> b = b(doc::new);
   public static final dxn c = dxm.J;
   public static final dxn d = dxm.B;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<doc> a() {
      return b;
   }

   public doc(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esz.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dww $$0, dgh $$1, ji $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dww $$0, dgh $$1, ji $$2) {
      jn $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, euc.a($$1, $$3, null));
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$1.af() && (long)$$1.A.a(200) <= $$1.ad() % 200L && $$2.v() == $$1.a(ecr.a.b, $$2.u(), $$2.w()) - 1) {
         azd.a($$0.c(a).o(), $$1, $$2, 0.125, lt.aV, bru.a(1, 2));
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }
}
