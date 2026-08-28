public interface cxt {
   int a = 256;
   float b = 7.0F;
   alc<cxr> c = a("ponder_goat_horn");
   alc<cxr> d = a("sing_goat_horn");
   alc<cxr> e = a("seek_goat_horn");
   alc<cxr> f = a("feel_goat_horn");
   alc<cxr> g = a("admire_goat_horn");
   alc<cxr> h = a("call_goat_horn");
   alc<cxr> i = a("yearn_goat_horn");
   alc<cxr> j = a("dream_goat_horn");

   private static alc<cxr> a(String $$0) {
      return alc.a(me.I, ald.b($$0));
   }

   static void a(qg<cxr> $$0) {
      a($$0, c, (js<awj>)awk.nd.get(0), 7.0F, 256.0F);
      a($$0, d, (js<awj>)awk.nd.get(1), 7.0F, 256.0F);
      a($$0, e, (js<awj>)awk.nd.get(2), 7.0F, 256.0F);
      a($$0, f, (js<awj>)awk.nd.get(3), 7.0F, 256.0F);
      a($$0, g, (js<awj>)awk.nd.get(4), 7.0F, 256.0F);
      a($$0, h, (js<awj>)awk.nd.get(5), 7.0F, 256.0F);
      a($$0, i, (js<awj>)awk.nd.get(6), 7.0F, 256.0F);
      a($$0, j, (js<awj>)awk.nd.get(7), 7.0F, 256.0F);
   }

   static void a(qg<cxr> $$0, alc<cxr> $$1, js<awj> $$2, float $$3, float $$4) {
      xj $$5 = wv.c(af.a("instrument", $$1.a()));
      $$0.a($$1, new cxr($$2, $$3, $$4, $$5));
   }
}
