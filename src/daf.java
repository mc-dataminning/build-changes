public interface daf {
   int a = 256;
   float b = 7.0F;
   alq<dad> c = a("ponder_goat_horn");
   alq<dad> d = a("sing_goat_horn");
   alq<dad> e = a("seek_goat_horn");
   alq<dad> f = a("feel_goat_horn");
   alq<dad> g = a("admire_goat_horn");
   alq<dad> h = a("call_goat_horn");
   alq<dad> i = a("yearn_goat_horn");
   alq<dad> j = a("dream_goat_horn");

   private static alq<dad> a(String $$0) {
      return alq.a(mi.aU, alr.b($$0));
   }

   static void a(qi<dad> $$0) {
      a($$0, c, (jg<awx>)awy.nh.get(0), 7.0F, 256.0F);
      a($$0, d, (jg<awx>)awy.nh.get(1), 7.0F, 256.0F);
      a($$0, e, (jg<awx>)awy.nh.get(2), 7.0F, 256.0F);
      a($$0, f, (jg<awx>)awy.nh.get(3), 7.0F, 256.0F);
      a($$0, g, (jg<awx>)awy.nh.get(4), 7.0F, 256.0F);
      a($$0, h, (jg<awx>)awy.nh.get(5), 7.0F, 256.0F);
      a($$0, i, (jg<awx>)awy.nh.get(6), 7.0F, 256.0F);
      a($$0, j, (jg<awx>)awy.nh.get(7), 7.0F, 256.0F);
   }

   static void a(qi<dad> $$0, alq<dad> $$1, jg<awx> $$2, float $$3, float $$4) {
      xu $$5 = xg.c(ag.a("instrument", $$1.a()));
      $$0.a($$1, new dad($$2, $$3, $$4, $$5));
   }
}
