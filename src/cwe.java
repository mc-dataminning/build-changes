import java.util.Map;

public class cwe extends csk {
   public static final dfp a = cxw.a;
   public static final dfp b = cxw.b;
   public static final dfp c = cxw.c;
   public static final dfp d = cxw.d;
   public static final dfp e = cxw.e;
   public static final dfp f = cxw.f;
   private static final Map<hb, dfp> g = cxw.g;

   public cwe(dex.d $$0) {
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
   public dey a(cle $$0) {
      coq $$1 = $$0.q();
      gv $$2 = $$0.a();
      return this.n()
         .a(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(a, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$2.a(this) ? $$0.a(g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(g.get($$1.a(hb.c)), $$0.c(a))
         .a(g.get($$1.a(hb.d)), $$0.c(c))
         .a(g.get($$1.a(hb.f)), $$0.c(b))
         .a(g.get($$1.a(hb.e)), $$0.c(d))
         .a(g.get($$1.a(hb.b)), $$0.c(e))
         .a(g.get($$1.a(hb.a)), $$0.c(f));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a(g.get($$1.b(hb.c)), $$0.c(a))
         .a(g.get($$1.b(hb.d)), $$0.c(c))
         .a(g.get($$1.b(hb.f)), $$0.c(b))
         .a(g.get($$1.b(hb.e)), $$0.c(d))
         .a(g.get($$1.b(hb.b)), $$0.c(e))
         .a(g.get($$1.b(hb.a)), $$0.c(f));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
