public class cmz {
   public static final alq<cmy> a = a(cmz.a.a);
   public static final alq<cmy> b = a(cmz.a.b);
   public static final alq<cmy> c = a(cmz.a.c);
   public static final alq<cmy> d = a(cmz.a.d);
   public static final alq<cmy> e = a(cmz.a.e);
   public static final alq<cmy> f = a(cmz.a.f);
   public static final alq<cmy> g = a(cmz.a.g);

   private static alq<cmy> a(cmz.a $$0) {
      return alq.a(mi.bn, alr.b($$0.a()));
   }

   public static void a(qi<cmy> $$0) {
      a($$0, a, cmz.a.a);
      a($$0, b, cmz.a.b);
      a($$0, c, cmz.a.c);
      a($$0, d, cmz.a.d);
      a($$0, e, cmz.a.e);
      a($$0, f, cmz.a.f);
      a($$0, g, cmz.a.g);
   }

   private static void a(qi<cmy> $$0, alq<cmy> $$1, cmz.a $$2) {
      $$0.a($$1, awy.DS.get($$2));
   }

   public static jg<cmy> a(ju $$0, bai $$1) {
      return $$0.f(mi.bn).a($$1).orElseThrow();
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
