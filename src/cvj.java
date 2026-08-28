public interface cvj {
   int a = 256;
   float b = 7.0F;
   alb<cvh> c = a("ponder_goat_horn");
   alb<cvh> d = a("sing_goat_horn");
   alb<cvh> e = a("seek_goat_horn");
   alb<cvh> f = a("feel_goat_horn");
   alb<cvh> g = a("admire_goat_horn");
   alb<cvh> h = a("call_goat_horn");
   alb<cvh> i = a("yearn_goat_horn");
   alb<cvh> j = a("dream_goat_horn");

   private static alb<cvh> a(String $$0) {
      return alb.a(lv.I, alc.b($$0));
   }

   static void a(qt<cvh> $$0) {
      a($$0, c, (jn<awd>)awe.mG.get(0), 7.0F, 256.0F);
      a($$0, d, (jn<awd>)awe.mG.get(1), 7.0F, 256.0F);
      a($$0, e, (jn<awd>)awe.mG.get(2), 7.0F, 256.0F);
      a($$0, f, (jn<awd>)awe.mG.get(3), 7.0F, 256.0F);
      a($$0, g, (jn<awd>)awe.mG.get(4), 7.0F, 256.0F);
      a($$0, h, (jn<awd>)awe.mG.get(5), 7.0F, 256.0F);
      a($$0, i, (jn<awd>)awe.mG.get(6), 7.0F, 256.0F);
      a($$0, j, (jn<awd>)awe.mG.get(7), 7.0F, 256.0F);
   }

   static void a(qt<cvh> $$0, alb<cvh> $$1, jn<awd> $$2, float $$3, float $$4) {
      xr $$5 = xd.c(ad.a("instrument", $$1.a()));
      $$0.a($$1, new cvh($$2, $$3, $$4, $$5));
   }
}
