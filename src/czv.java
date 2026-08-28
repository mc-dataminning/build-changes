public interface czv {
   int a = 256;
   float b = 7.0F;
   alj<czt> c = a("ponder_goat_horn");
   alj<czt> d = a("sing_goat_horn");
   alj<czt> e = a("seek_goat_horn");
   alj<czt> f = a("feel_goat_horn");
   alj<czt> g = a("admire_goat_horn");
   alj<czt> h = a("call_goat_horn");
   alj<czt> i = a("yearn_goat_horn");
   alj<czt> j = a("dream_goat_horn");

   private static alj<czt> a(String $$0) {
      return alj.a(mi.aU, alk.b($$0));
   }

   static void a(qi<czt> $$0) {
      a($$0, c, (jg<awq>)awr.nh.get(0), 7.0F, 256.0F);
      a($$0, d, (jg<awq>)awr.nh.get(1), 7.0F, 256.0F);
      a($$0, e, (jg<awq>)awr.nh.get(2), 7.0F, 256.0F);
      a($$0, f, (jg<awq>)awr.nh.get(3), 7.0F, 256.0F);
      a($$0, g, (jg<awq>)awr.nh.get(4), 7.0F, 256.0F);
      a($$0, h, (jg<awq>)awr.nh.get(5), 7.0F, 256.0F);
      a($$0, i, (jg<awq>)awr.nh.get(6), 7.0F, 256.0F);
      a($$0, j, (jg<awq>)awr.nh.get(7), 7.0F, 256.0F);
   }

   static void a(qi<czt> $$0, alj<czt> $$1, jg<awq> $$2, float $$3, float $$4) {
      xq $$5 = xc.c(ag.a("instrument", $$1.a()));
      $$0.a($$1, new czt($$2, $$3, $$4, $$5));
   }
}
