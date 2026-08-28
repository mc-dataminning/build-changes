public interface cxj {
   int a = 256;
   float b = 7.0F;
   aly<cxh> c = a("ponder_goat_horn");
   aly<cxh> d = a("sing_goat_horn");
   aly<cxh> e = a("seek_goat_horn");
   aly<cxh> f = a("feel_goat_horn");
   aly<cxh> g = a("admire_goat_horn");
   aly<cxh> h = a("call_goat_horn");
   aly<cxh> i = a("yearn_goat_horn");
   aly<cxh> j = a("dream_goat_horn");

   private static aly<cxh> a(String $$0) {
      return aly.a(mb.I, alz.b($$0));
   }

   static void a(rk<cxh> $$0) {
      a($$0, c, (jq<axe>)axf.mX.get(0), 7.0F, 256.0F);
      a($$0, d, (jq<axe>)axf.mX.get(1), 7.0F, 256.0F);
      a($$0, e, (jq<axe>)axf.mX.get(2), 7.0F, 256.0F);
      a($$0, f, (jq<axe>)axf.mX.get(3), 7.0F, 256.0F);
      a($$0, g, (jq<axe>)axf.mX.get(4), 7.0F, 256.0F);
      a($$0, h, (jq<axe>)axf.mX.get(5), 7.0F, 256.0F);
      a($$0, i, (jq<axe>)axf.mX.get(6), 7.0F, 256.0F);
      a($$0, j, (jq<axe>)axf.mX.get(7), 7.0F, 256.0F);
   }

   static void a(rk<cxh> $$0, aly<cxh> $$1, jq<axe> $$2, float $$3, float $$4) {
      yj $$5 = xv.c(ae.a("instrument", $$1.a()));
      $$0.a($$1, new cxh($$2, $$3, $$4, $$5));
   }
}
