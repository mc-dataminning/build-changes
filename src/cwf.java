import java.util.Map;

public class cwf extends csl {
   public static final dfq a = cxx.a;
   public static final dfq b = cxx.b;
   public static final dfq c = cxx.c;
   public static final dfq d = cxx.d;
   public static final dfq e = cxx.e;
   public static final dfq f = cxx.f;
   private static final Map<ha, dfq> g = cxx.g;

   public cwf(dey.d $$0) {
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
   public dez a(clf $$0) {
      cor $$1 = $$0.q();
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
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$2.a(this) ? $$0.a(g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(g.get($$1.a(ha.c)), $$0.c(a))
         .a(g.get($$1.a(ha.d)), $$0.c(c))
         .a(g.get($$1.a(ha.f)), $$0.c(b))
         .a(g.get($$1.a(ha.e)), $$0.c(d))
         .a(g.get($$1.a(ha.b)), $$0.c(e))
         .a(g.get($$1.a(ha.a)), $$0.c(f));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a(g.get($$1.b(ha.c)), $$0.c(a))
         .a(g.get($$1.b(ha.d)), $$0.c(c))
         .a(g.get($$1.b(ha.f)), $$0.c(b))
         .a(g.get($$1.b(ha.e)), $$0.c(d))
         .a(g.get($$1.b(ha.b)), $$0.c(e))
         .a(g.get($$1.b(ha.a)), $$0.c(f));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
