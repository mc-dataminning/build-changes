public class cmq {
   public static final alj<cmp> a = a(cmq.a.a);
   public static final alj<cmp> b = a(cmq.a.b);
   public static final alj<cmp> c = a(cmq.a.c);
   public static final alj<cmp> d = a(cmq.a.d);
   public static final alj<cmp> e = a(cmq.a.e);
   public static final alj<cmp> f = a(cmq.a.f);
   public static final alj<cmp> g = a(cmq.a.g);

   private static alj<cmp> a(cmq.a $$0) {
      return alj.a(mi.bn, alk.b($$0.a()));
   }

   public static void a(qi<cmp> $$0) {
      a($$0, a, cmq.a.a);
      a($$0, b, cmq.a.b);
      a($$0, c, cmq.a.c);
      a($$0, d, cmq.a.d);
      a($$0, e, cmq.a.e);
      a($$0, f, cmq.a.f);
      a($$0, g, cmq.a.g);
   }

   private static void a(qi<cmp> $$0, alj<cmp> $$1, cmq.a $$2) {
      $$0.a($$1, awr.DS.get($$2));
   }

   public static jg<cmp> a(ju $$0, azz $$1) {
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
