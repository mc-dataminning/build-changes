public interface cwk {
   int a = 256;
   float b = 7.0F;
   aku<cwi> c = a("ponder_goat_horn");
   aku<cwi> d = a("sing_goat_horn");
   aku<cwi> e = a("seek_goat_horn");
   aku<cwi> f = a("feel_goat_horn");
   aku<cwi> g = a("admire_goat_horn");
   aku<cwi> h = a("call_goat_horn");
   aku<cwi> i = a("yearn_goat_horn");
   aku<cwi> j = a("dream_goat_horn");

   private static aku<cwi> a(String $$0) {
      return aku.a(mc.I, akv.b($$0));
   }

   static void a(qe<cwi> $$0) {
      a($$0, c, (jr<avz>)awa.nd.get(0), 7.0F, 256.0F);
      a($$0, d, (jr<avz>)awa.nd.get(1), 7.0F, 256.0F);
      a($$0, e, (jr<avz>)awa.nd.get(2), 7.0F, 256.0F);
      a($$0, f, (jr<avz>)awa.nd.get(3), 7.0F, 256.0F);
      a($$0, g, (jr<avz>)awa.nd.get(4), 7.0F, 256.0F);
      a($$0, h, (jr<avz>)awa.nd.get(5), 7.0F, 256.0F);
      a($$0, i, (jr<avz>)awa.nd.get(6), 7.0F, 256.0F);
      a($$0, j, (jr<avz>)awa.nd.get(7), 7.0F, 256.0F);
   }

   static void a(qe<cwi> $$0, aku<cwi> $$1, jr<avz> $$2, float $$3, float $$4) {
      xd $$5 = wp.c(af.a("instrument", $$1.a()));
      $$0.a($$1, new cwi($$2, $$3, $$4, $$5));
   }
}
