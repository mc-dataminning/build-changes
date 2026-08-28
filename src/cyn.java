public interface cyn {
   int a = 256;
   float b = 7.0F;
   ald<cyl> c = a("ponder_goat_horn");
   ald<cyl> d = a("sing_goat_horn");
   ald<cyl> e = a("seek_goat_horn");
   ald<cyl> f = a("feel_goat_horn");
   ald<cyl> g = a("admire_goat_horn");
   ald<cyl> h = a("call_goat_horn");
   ald<cyl> i = a("yearn_goat_horn");
   ald<cyl> j = a("dream_goat_horn");

   private static ald<cyl> a(String $$0) {
      return ald.a(mg.aS, ale.b($$0));
   }

   static void a(qh<cyl> $$0) {
      a($$0, c, (je<awk>)awl.nd.get(0), 7.0F, 256.0F);
      a($$0, d, (je<awk>)awl.nd.get(1), 7.0F, 256.0F);
      a($$0, e, (je<awk>)awl.nd.get(2), 7.0F, 256.0F);
      a($$0, f, (je<awk>)awl.nd.get(3), 7.0F, 256.0F);
      a($$0, g, (je<awk>)awl.nd.get(4), 7.0F, 256.0F);
      a($$0, h, (je<awk>)awl.nd.get(5), 7.0F, 256.0F);
      a($$0, i, (je<awk>)awl.nd.get(6), 7.0F, 256.0F);
      a($$0, j, (je<awk>)awl.nd.get(7), 7.0F, 256.0F);
   }

   static void a(qh<cyl> $$0, ald<cyl> $$1, je<awk> $$2, float $$3, float $$4) {
      xk $$5 = ww.c(af.a("instrument", $$1.a()));
      $$0.a($$1, new cyl($$2, $$3, $$4, $$5));
   }
}
