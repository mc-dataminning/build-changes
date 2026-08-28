public interface cvf {
   int a = 256;
   float b = 7.0F;
   ala<cvd> c = a("ponder_goat_horn");
   ala<cvd> d = a("sing_goat_horn");
   ala<cvd> e = a("seek_goat_horn");
   ala<cvd> f = a("feel_goat_horn");
   ala<cvd> g = a("admire_goat_horn");
   ala<cvd> h = a("call_goat_horn");
   ala<cvd> i = a("yearn_goat_horn");
   ala<cvd> j = a("dream_goat_horn");

   private static ala<cvd> a(String $$0) {
      return ala.a(lv.I, alb.b($$0));
   }

   static void a(qt<cvd> $$0) {
      a($$0, c, (jn<awc>)awd.mG.get(0), 7.0F, 256.0F);
      a($$0, d, (jn<awc>)awd.mG.get(1), 7.0F, 256.0F);
      a($$0, e, (jn<awc>)awd.mG.get(2), 7.0F, 256.0F);
      a($$0, f, (jn<awc>)awd.mG.get(3), 7.0F, 256.0F);
      a($$0, g, (jn<awc>)awd.mG.get(4), 7.0F, 256.0F);
      a($$0, h, (jn<awc>)awd.mG.get(5), 7.0F, 256.0F);
      a($$0, i, (jn<awc>)awd.mG.get(6), 7.0F, 256.0F);
      a($$0, j, (jn<awc>)awd.mG.get(7), 7.0F, 256.0F);
   }

   static void a(qt<cvd> $$0, ala<cvd> $$1, jn<awc> $$2, float $$3, float $$4) {
      xr $$5 = xd.c(ad.a("instrument", $$1.a()));
      $$0.a($$1, new cvd($$2, $$3, $$4, $$5));
   }
}
