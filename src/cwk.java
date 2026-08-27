import java.util.Map;

public class cwk extends csq {
   public static final dfv a = cyc.a;
   public static final dfv b = cyc.b;
   public static final dfv c = cyc.c;
   public static final dfv d = cyc.d;
   public static final dfv e = cyc.e;
   public static final dfv f = cyc.f;
   private static final Map<hc, dfv> g = cyc.g;

   public cwk(dfd.d $$0) {
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
   public dfe a(cli $$0) {
      cow $$1 = $$0.q();
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
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$2.a(this) ? $$0.a(g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(g.get($$1.a(hc.c)), $$0.c(a))
         .a(g.get($$1.a(hc.d)), $$0.c(c))
         .a(g.get($$1.a(hc.f)), $$0.c(b))
         .a(g.get($$1.a(hc.e)), $$0.c(d))
         .a(g.get($$1.a(hc.b)), $$0.c(e))
         .a(g.get($$1.a(hc.a)), $$0.c(f));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a(g.get($$1.b(hc.c)), $$0.c(a))
         .a(g.get($$1.b(hc.d)), $$0.c(c))
         .a(g.get($$1.b(hc.f)), $$0.c(b))
         .a(g.get($$1.b(hc.e)), $$0.c(d))
         .a(g.get($$1.b(hc.b)), $$0.c(e))
         .a(g.get($$1.b(hc.a)), $$0.c(f));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
