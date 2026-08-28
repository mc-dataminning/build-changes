public interface cvs {
   int a = 256;
   float b = 7.0F;
   alg<cvq> c = a("ponder_goat_horn");
   alg<cvq> d = a("sing_goat_horn");
   alg<cvq> e = a("seek_goat_horn");
   alg<cvq> f = a("feel_goat_horn");
   alg<cvq> g = a("admire_goat_horn");
   alg<cvq> h = a("call_goat_horn");
   alg<cvq> i = a("yearn_goat_horn");
   alg<cvq> j = a("dream_goat_horn");

   private static alg<cvq> a(String $$0) {
      return alg.a(ly.I, alh.b($$0));
   }

   static void a(qx<cvq> $$0) {
      a($$0, c, (jp<awj>)awk.mE.get(0), 7.0F, 256.0F);
      a($$0, d, (jp<awj>)awk.mE.get(1), 7.0F, 256.0F);
      a($$0, e, (jp<awj>)awk.mE.get(2), 7.0F, 256.0F);
      a($$0, f, (jp<awj>)awk.mE.get(3), 7.0F, 256.0F);
      a($$0, g, (jp<awj>)awk.mE.get(4), 7.0F, 256.0F);
      a($$0, h, (jp<awj>)awk.mE.get(5), 7.0F, 256.0F);
      a($$0, i, (jp<awj>)awk.mE.get(6), 7.0F, 256.0F);
      a($$0, j, (jp<awj>)awk.mE.get(7), 7.0F, 256.0F);
   }

   static void a(qx<cvq> $$0, alg<cvq> $$1, jp<awj> $$2, float $$3, float $$4) {
      xv $$5 = xh.c(ad.a("instrument", $$1.a()));
      $$0.a($$1, new cvq($$2, $$3, $$4, $$5));
   }
}
