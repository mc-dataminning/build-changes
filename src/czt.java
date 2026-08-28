public interface czt {
   int a = 256;
   float b = 7.0F;
   alh<czr> c = a("ponder_goat_horn");
   alh<czr> d = a("sing_goat_horn");
   alh<czr> e = a("seek_goat_horn");
   alh<czr> f = a("feel_goat_horn");
   alh<czr> g = a("admire_goat_horn");
   alh<czr> h = a("call_goat_horn");
   alh<czr> i = a("yearn_goat_horn");
   alh<czr> j = a("dream_goat_horn");

   private static alh<czr> a(String $$0) {
      return alh.a(mh.aU, ali.b($$0));
   }

   static void a(qh<czr> $$0) {
      a($$0, c, (jf<awo>)awp.nh.get(0), 7.0F, 256.0F);
      a($$0, d, (jf<awo>)awp.nh.get(1), 7.0F, 256.0F);
      a($$0, e, (jf<awo>)awp.nh.get(2), 7.0F, 256.0F);
      a($$0, f, (jf<awo>)awp.nh.get(3), 7.0F, 256.0F);
      a($$0, g, (jf<awo>)awp.nh.get(4), 7.0F, 256.0F);
      a($$0, h, (jf<awo>)awp.nh.get(5), 7.0F, 256.0F);
      a($$0, i, (jf<awo>)awp.nh.get(6), 7.0F, 256.0F);
      a($$0, j, (jf<awo>)awp.nh.get(7), 7.0F, 256.0F);
   }

   static void a(qh<czr> $$0, alh<czr> $$1, jf<awo> $$2, float $$3, float $$4) {
      xo $$5 = xa.c(ag.a("instrument", $$1.a()));
      $$0.a($$1, new czr($$2, $$3, $$4, $$5));
   }
}
