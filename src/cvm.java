public interface cvm {
   int a = 256;
   float b = 7.0F;
   ald<cvk> c = a("ponder_goat_horn");
   ald<cvk> d = a("sing_goat_horn");
   ald<cvk> e = a("seek_goat_horn");
   ald<cvk> f = a("feel_goat_horn");
   ald<cvk> g = a("admire_goat_horn");
   ald<cvk> h = a("call_goat_horn");
   ald<cvk> i = a("yearn_goat_horn");
   ald<cvk> j = a("dream_goat_horn");

   private static ald<cvk> a(String $$0) {
      return ald.a(lw.I, ale.b($$0));
   }

   static void a(qu<cvk> $$0) {
      a($$0, c, (jo<awf>)awg.mG.get(0), 7.0F, 256.0F);
      a($$0, d, (jo<awf>)awg.mG.get(1), 7.0F, 256.0F);
      a($$0, e, (jo<awf>)awg.mG.get(2), 7.0F, 256.0F);
      a($$0, f, (jo<awf>)awg.mG.get(3), 7.0F, 256.0F);
      a($$0, g, (jo<awf>)awg.mG.get(4), 7.0F, 256.0F);
      a($$0, h, (jo<awf>)awg.mG.get(5), 7.0F, 256.0F);
      a($$0, i, (jo<awf>)awg.mG.get(6), 7.0F, 256.0F);
      a($$0, j, (jo<awf>)awg.mG.get(7), 7.0F, 256.0F);
   }

   static void a(qu<cvk> $$0, ald<cvk> $$1, jo<awf> $$2, float $$3, float $$4) {
      xs $$5 = xe.c(ad.a("instrument", $$1.a()));
      $$0.a($$1, new cvk($$2, $$3, $$4, $$5));
   }
}
