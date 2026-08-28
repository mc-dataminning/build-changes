public interface czi {
   int a = 256;
   float b = 7.0F;
   alf<czg> c = a("ponder_goat_horn");
   alf<czg> d = a("sing_goat_horn");
   alf<czg> e = a("seek_goat_horn");
   alf<czg> f = a("feel_goat_horn");
   alf<czg> g = a("admire_goat_horn");
   alf<czg> h = a("call_goat_horn");
   alf<czg> i = a("yearn_goat_horn");
   alf<czg> j = a("dream_goat_horn");

   private static alf<czg> a(String $$0) {
      return alf.a(mh.aU, alg.b($$0));
   }

   static void a(qh<czg> $$0) {
      a($$0, c, (jf<awm>)awn.nh.get(0), 7.0F, 256.0F);
      a($$0, d, (jf<awm>)awn.nh.get(1), 7.0F, 256.0F);
      a($$0, e, (jf<awm>)awn.nh.get(2), 7.0F, 256.0F);
      a($$0, f, (jf<awm>)awn.nh.get(3), 7.0F, 256.0F);
      a($$0, g, (jf<awm>)awn.nh.get(4), 7.0F, 256.0F);
      a($$0, h, (jf<awm>)awn.nh.get(5), 7.0F, 256.0F);
      a($$0, i, (jf<awm>)awn.nh.get(6), 7.0F, 256.0F);
      a($$0, j, (jf<awm>)awn.nh.get(7), 7.0F, 256.0F);
   }

   static void a(qh<czg> $$0, alf<czg> $$1, jf<awm> $$2, float $$3, float $$4) {
      xm $$5 = wy.c(ag.a("instrument", $$1.a()));
      $$0.a($$1, new czg($$2, $$3, $$4, $$5));
   }
}
