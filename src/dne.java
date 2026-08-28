import com.mojang.serialization.MapCodec;

public class dne extends doz implements dpr {
   public static final MapCodec<dne> b = b(dne::new);
   public static final dwm c = dwl.C;
   public static final dwm d = dwl.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dne> a() {
      return b;
   }

   public dne(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erw.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dvv $$0, dfm $$1, jh $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dvv $$0, dfm $$1, jh $$2) {
      jm $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, esz.a($$1, $$3, null));
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$1.ad() && (long)$$1.A.a(200) <= $$1.ab() % 200L && $$2.v() == $$1.a(ebq.a.b, $$2.u(), $$2.w()) - 1) {
         azq.a($$0.c(a).o(), $$1, $$2, 0.125, ls.aT, brv.a(1, 2));
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.S().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }
}
