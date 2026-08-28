public interface cwh {
   int a = 256;
   float b = 7.0F;
   ali<cwf> c = a("ponder_goat_horn");
   ali<cwf> d = a("sing_goat_horn");
   ali<cwf> e = a("seek_goat_horn");
   ali<cwf> f = a("feel_goat_horn");
   ali<cwf> g = a("admire_goat_horn");
   ali<cwf> h = a("call_goat_horn");
   ali<cwf> i = a("yearn_goat_horn");
   ali<cwf> j = a("dream_goat_horn");

   private static ali<cwf> a(String $$0) {
      return ali.a(ma.I, alj.b($$0));
   }

   static void a(qz<cwf> $$0) {
      a($$0, c, (jq<awm>)awn.mE.get(0), 7.0F, 256.0F);
      a($$0, d, (jq<awm>)awn.mE.get(1), 7.0F, 256.0F);
      a($$0, e, (jq<awm>)awn.mE.get(2), 7.0F, 256.0F);
      a($$0, f, (jq<awm>)awn.mE.get(3), 7.0F, 256.0F);
      a($$0, g, (jq<awm>)awn.mE.get(4), 7.0F, 256.0F);
      a($$0, h, (jq<awm>)awn.mE.get(5), 7.0F, 256.0F);
      a($$0, i, (jq<awm>)awn.mE.get(6), 7.0F, 256.0F);
      a($$0, j, (jq<awm>)awn.mE.get(7), 7.0F, 256.0F);
   }

   static void a(qz<cwf> $$0, ali<cwf> $$1, jq<awm> $$2, float $$3, float $$4) {
      xx $$5 = xj.c(ae.a("instrument", $$1.a()));
      $$0.a($$1, new cwf($$2, $$3, $$4, $$5));
   }
}
