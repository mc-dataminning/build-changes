import java.util.Map;

public class cwp extends csv {
   public static final dga a = cyh.a;
   public static final dga b = cyh.b;
   public static final dga c = cyh.c;
   public static final dga d = cyh.d;
   public static final dga e = cyh.e;
   public static final dga f = cyh.f;
   private static final Map<hc, dga> g = cyh.g;

   public cwp(dfi.d $$0) {
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
   public dfj a(cln $$0) {
      cpb $$1 = $$0.q();
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
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$2.a(this) ? $$0.a(g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(g.get($$1.a(hc.c)), $$0.c(a))
         .a(g.get($$1.a(hc.d)), $$0.c(c))
         .a(g.get($$1.a(hc.f)), $$0.c(b))
         .a(g.get($$1.a(hc.e)), $$0.c(d))
         .a(g.get($$1.a(hc.b)), $$0.c(e))
         .a(g.get($$1.a(hc.a)), $$0.c(f));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a(g.get($$1.b(hc.c)), $$0.c(a))
         .a(g.get($$1.b(hc.d)), $$0.c(c))
         .a(g.get($$1.b(hc.f)), $$0.c(b))
         .a(g.get($$1.b(hc.e)), $$0.c(d))
         .a(g.get($$1.b(hc.b)), $$0.c(e))
         .a(g.get($$1.b(hc.a)), $$0.c(f));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
