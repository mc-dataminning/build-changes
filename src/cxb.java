public interface cxb {
   int a = 256;
   float b = 7.0F;
   alo<cwz> c = a("ponder_goat_horn");
   alo<cwz> d = a("sing_goat_horn");
   alo<cwz> e = a("seek_goat_horn");
   alo<cwz> f = a("feel_goat_horn");
   alo<cwz> g = a("admire_goat_horn");
   alo<cwz> h = a("call_goat_horn");
   alo<cwz> i = a("yearn_goat_horn");
   alo<cwz> j = a("dream_goat_horn");

   private static alo<cwz> a(String $$0) {
      return alo.a(mb.I, alp.b($$0));
   }

   static void a(ra<cwz> $$0) {
      a($$0, c, (jq<awu>)awv.nd.get(0), 7.0F, 256.0F);
      a($$0, d, (jq<awu>)awv.nd.get(1), 7.0F, 256.0F);
      a($$0, e, (jq<awu>)awv.nd.get(2), 7.0F, 256.0F);
      a($$0, f, (jq<awu>)awv.nd.get(3), 7.0F, 256.0F);
      a($$0, g, (jq<awu>)awv.nd.get(4), 7.0F, 256.0F);
      a($$0, h, (jq<awu>)awv.nd.get(5), 7.0F, 256.0F);
      a($$0, i, (jq<awu>)awv.nd.get(6), 7.0F, 256.0F);
      a($$0, j, (jq<awu>)awv.nd.get(7), 7.0F, 256.0F);
   }

   static void a(ra<cwz> $$0, alo<cwz> $$1, jq<awu> $$2, float $$3, float $$4) {
      xy $$5 = xk.c(ae.a("instrument", $$1.a()));
      $$0.a($$1, new cwz($$2, $$3, $$4, $$5));
   }
}
