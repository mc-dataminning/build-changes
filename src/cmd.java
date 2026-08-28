public class cmd {
   public static final alf<cmc> a = a(cmd.a.a);
   public static final alf<cmc> b = a(cmd.a.b);
   public static final alf<cmc> c = a(cmd.a.c);
   public static final alf<cmc> d = a(cmd.a.d);
   public static final alf<cmc> e = a(cmd.a.e);
   public static final alf<cmc> f = a(cmd.a.f);
   public static final alf<cmc> g = a(cmd.a.g);

   private static alf<cmc> a(cmd.a $$0) {
      return alf.a(mh.bn, alg.b($$0.a()));
   }

   public static void a(qh<cmc> $$0) {
      a($$0, a, cmd.a.a);
      a($$0, b, cmd.a.b);
      a($$0, c, cmd.a.c);
      a($$0, d, cmd.a.d);
      a($$0, e, cmd.a.e);
      a($$0, f, cmd.a.f);
      a($$0, g, cmd.a.g);
   }

   private static void a(qh<cmc> $$0, alf<cmc> $$1, cmd.a $$2) {
      $$0.a($$1, awn.DS.get($$2));
   }

   public static jf<cmc> a(jt $$0, azv $$1) {
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
