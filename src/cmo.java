public class cmo {
   public static final alh<cmn> a = a(cmo.a.a);
   public static final alh<cmn> b = a(cmo.a.b);
   public static final alh<cmn> c = a(cmo.a.c);
   public static final alh<cmn> d = a(cmo.a.d);
   public static final alh<cmn> e = a(cmo.a.e);
   public static final alh<cmn> f = a(cmo.a.f);
   public static final alh<cmn> g = a(cmo.a.g);

   private static alh<cmn> a(cmo.a $$0) {
      return alh.a(mh.bn, ali.b($$0.a()));
   }

   public static void a(qh<cmn> $$0) {
      a($$0, a, cmo.a.a);
      a($$0, b, cmo.a.b);
      a($$0, c, cmo.a.c);
      a($$0, d, cmo.a.d);
      a($$0, e, cmo.a.e);
      a($$0, f, cmo.a.f);
      a($$0, g, cmo.a.g);
   }

   private static void a(qh<cmn> $$0, alh<cmn> $$1, cmo.a $$2) {
      $$0.a($$1, awp.DS.get($$2));
   }

   public static jf<cmn> a(jt $$0, azx $$1) {
      return $$0.f(mh.bn).a($$1).orElseThrow();
   }

   public static enum a {
      a("classic", ""),
      b("puglin", "_puglin"),
      c("sad", "_sad"),
      d("angry", "_angry"),
      e("grumpy", "_grumpy"),
      f("big", "_big"),
      g("cute", "_cute");

      private final String h;
      private final String i;

      private a(final String $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public String a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }
   }
}
