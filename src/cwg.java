import java.util.Map;

public class cwg extends csm {
   public static final dfr a = cxy.a;
   public static final dfr b = cxy.b;
   public static final dfr c = cxy.c;
   public static final dfr d = cxy.d;
   public static final dfr e = cxy.e;
   public static final dfr f = cxy.f;
   private static final Map<ha, dfr> g = cxy.g;

   public cwg(dez.d $$0) {
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
   public dfa a(clg $$0) {
      cos $$1 = $$0.q();
      gu $$2 = $$0.a();
      return this.n()
         .a(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(a, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$2.a(this) ? $$0.a(g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(g.get($$1.a(ha.c)), $$0.c(a))
         .a(g.get($$1.a(ha.d)), $$0.c(c))
         .a(g.get($$1.a(ha.f)), $$0.c(b))
         .a(g.get($$1.a(ha.e)), $$0.c(d))
         .a(g.get($$1.a(ha.b)), $$0.c(e))
         .a(g.get($$1.a(ha.a)), $$0.c(f));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a(g.get($$1.b(ha.c)), $$0.c(a))
         .a(g.get($$1.b(ha.d)), $$0.c(c))
         .a(g.get($$1.b(ha.f)), $$0.c(b))
         .a(g.get($$1.b(ha.e)), $$0.c(d))
         .a(g.get($$1.b(ha.b)), $$0.c(e))
         .a(g.get($$1.b(ha.a)), $$0.c(f));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
