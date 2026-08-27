import java.util.Map;

public class cwr extends csx {
   public static final dgc a = cyj.a;
   public static final dgc b = cyj.b;
   public static final dgc c = cyj.c;
   public static final dgc d = cyj.d;
   public static final dgc e = cyj.e;
   public static final dgc f = cyj.f;
   private static final Map<hc, dgc> g = cyj.g;

   public cwr(dfk.d $$0) {
      super($$0);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(true))
            .a(b, Boolean.valueOf(true))
            .a(c, Boolean.valueOf(true))
            .a(d, Boolean.valueOf(true))
            .a(e, Boolean.valueOf(true))
            .a(f, Boolean.valueOf(true))
      );
   }

   @Override
   public dfl a(clp $$0) {
      cpd $$1 = $$0.q();
      gw $$2 = $$0.a();
      return this.n()
         .a(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(a, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$2.a(this) ? $$0.a(g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(g.get($$1.a(hc.c)), $$0.c(a))
         .a(g.get($$1.a(hc.d)), $$0.c(c))
         .a(g.get($$1.a(hc.f)), $$0.c(b))
         .a(g.get($$1.a(hc.e)), $$0.c(d))
         .a(g.get($$1.a(hc.b)), $$0.c(e))
         .a(g.get($$1.a(hc.a)), $$0.c(f));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a(g.get($$1.b(hc.c)), $$0.c(a))
         .a(g.get($$1.b(hc.d)), $$0.c(c))
         .a(g.get($$1.b(hc.f)), $$0.c(b))
         .a(g.get($$1.b(hc.e)), $$0.c(d))
         .a(g.get($$1.b(hc.b)), $$0.c(e))
         .a(g.get($$1.b(hc.a)), $$0.c(f));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
