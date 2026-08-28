public interface cwa {
   int a = 256;
   float b = 7.0F;
   alk<cvy> c = a("ponder_goat_horn");
   alk<cvy> d = a("sing_goat_horn");
   alk<cvy> e = a("seek_goat_horn");
   alk<cvy> f = a("feel_goat_horn");
   alk<cvy> g = a("admire_goat_horn");
   alk<cvy> h = a("call_goat_horn");
   alk<cvy> i = a("yearn_goat_horn");
   alk<cvy> j = a("dream_goat_horn");

   private static alk<cvy> a(String $$0) {
      return alk.a(ma.I, all.b($$0));
   }

   static void a(rb<cvy> $$0) {
      a($$0, c, (jq<awn>)awo.mE.get(0), 7.0F, 256.0F);
      a($$0, d, (jq<awn>)awo.mE.get(1), 7.0F, 256.0F);
      a($$0, e, (jq<awn>)awo.mE.get(2), 7.0F, 256.0F);
      a($$0, f, (jq<awn>)awo.mE.get(3), 7.0F, 256.0F);
      a($$0, g, (jq<awn>)awo.mE.get(4), 7.0F, 256.0F);
      a($$0, h, (jq<awn>)awo.mE.get(5), 7.0F, 256.0F);
      a($$0, i, (jq<awn>)awo.mE.get(6), 7.0F, 256.0F);
      a($$0, j, (jq<awn>)awo.mE.get(7), 7.0F, 256.0F);
   }

   static void a(rb<cvy> $$0, alk<cvy> $$1, jq<awn> $$2, float $$3, float $$4) {
      xz $$5 = xl.c(ae.a("instrument", $$1.a()));
      $$0.a($$1, new cvy($$2, $$3, $$4, $$5));
   }
}
