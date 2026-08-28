public interface cwi {
   int a = 256;
   float b = 7.0F;
   akt<cwg> c = a("ponder_goat_horn");
   akt<cwg> d = a("sing_goat_horn");
   akt<cwg> e = a("seek_goat_horn");
   akt<cwg> f = a("feel_goat_horn");
   akt<cwg> g = a("admire_goat_horn");
   akt<cwg> h = a("call_goat_horn");
   akt<cwg> i = a("yearn_goat_horn");
   akt<cwg> j = a("dream_goat_horn");

   private static akt<cwg> a(String $$0) {
      return akt.a(mc.I, aku.b($$0));
   }

   static void a(qe<cwg> $$0) {
      a($$0, c, (jr<avy>)avz.nd.get(0), 7.0F, 256.0F);
      a($$0, d, (jr<avy>)avz.nd.get(1), 7.0F, 256.0F);
      a($$0, e, (jr<avy>)avz.nd.get(2), 7.0F, 256.0F);
      a($$0, f, (jr<avy>)avz.nd.get(3), 7.0F, 256.0F);
      a($$0, g, (jr<avy>)avz.nd.get(4), 7.0F, 256.0F);
      a($$0, h, (jr<avy>)avz.nd.get(5), 7.0F, 256.0F);
      a($$0, i, (jr<avy>)avz.nd.get(6), 7.0F, 256.0F);
      a($$0, j, (jr<avy>)avz.nd.get(7), 7.0F, 256.0F);
   }

   static void a(qe<cwg> $$0, akt<cwg> $$1, jr<avy> $$2, float $$3, float $$4) {
      xc $$5 = wo.c(af.a("instrument", $$1.a()));
      $$0.a($$1, new cwg($$2, $$3, $$4, $$5));
   }
}
