public interface cvw {
   int a = 256;
   float b = 7.0F;
   alh<cvu> c = a("ponder_goat_horn");
   alh<cvu> d = a("sing_goat_horn");
   alh<cvu> e = a("seek_goat_horn");
   alh<cvu> f = a("feel_goat_horn");
   alh<cvu> g = a("admire_goat_horn");
   alh<cvu> h = a("call_goat_horn");
   alh<cvu> i = a("yearn_goat_horn");
   alh<cvu> j = a("dream_goat_horn");

   private static alh<cvu> a(String $$0) {
      return alh.a(lz.I, ali.b($$0));
   }

   static void a(qy<cvu> $$0) {
      a($$0, c, (jq<awk>)awl.mE.get(0), 7.0F, 256.0F);
      a($$0, d, (jq<awk>)awl.mE.get(1), 7.0F, 256.0F);
      a($$0, e, (jq<awk>)awl.mE.get(2), 7.0F, 256.0F);
      a($$0, f, (jq<awk>)awl.mE.get(3), 7.0F, 256.0F);
      a($$0, g, (jq<awk>)awl.mE.get(4), 7.0F, 256.0F);
      a($$0, h, (jq<awk>)awl.mE.get(5), 7.0F, 256.0F);
      a($$0, i, (jq<awk>)awl.mE.get(6), 7.0F, 256.0F);
      a($$0, j, (jq<awk>)awl.mE.get(7), 7.0F, 256.0F);
   }

   static void a(qy<cvu> $$0, alh<cvu> $$1, jq<awk> $$2, float $$3, float $$4) {
      xw $$5 = xi.c(ae.a("instrument", $$1.a()));
      $$0.a($$1, new cvu($$2, $$3, $$4, $$5));
   }
}
