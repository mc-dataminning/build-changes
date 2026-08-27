import com.mojang.serialization.MapCodec;

public class dht extends djn implements dkf {
   public static final MapCodec<dht> b = b(dht::new);
   public static final dqy c = dqx.C;
   public static final dqy d = dqx.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dht> a() {
      return b;
   }

   public dht(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, is.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emb.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dqh $$0, dad $$1, in $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dqh $$0, dad $$1, in $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$1.ab() && (long)$$1.z.a(200) <= $$1.Y() % 200L && $$2.v() == $$1.a(dvz.a.b, $$2.u(), $$2.w()) - 1) {
         ayc.a($$0.c(a).o(), $$1, $$2, 0.125, kx.aQ, box.a(1, 2));
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      if ($$0.ab() && $$3 instanceof cmm && ((cmm)$$3).K()) {
         in $$4 = $$2.a();
         if ($$0.h($$4)) {
            brz $$5 = brn.al.a($$0);
            if ($$5 != null) {
               $$5.e(etp.c($$4.c()));
               brh $$6 = $$3.u();
               $$5.b($$6 instanceof aqi ? (aqi)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, avc.zt, avd.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }
}
