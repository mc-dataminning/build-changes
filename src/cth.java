import java.util.Map;

public class cth extends cpn {
   public static final dcs a = cuz.a;
   public static final dcs b = cuz.b;
   public static final dcs c = cuz.c;
   public static final dcs d = cuz.d;
   public static final dcs e = cuz.e;
   public static final dcs f = cuz.f;
   private static final Map<ha, dcs> g = cuz.g;

   public cth(dca.d $$0) {
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
   public dcb a(cih $$0) {
      cls $$1 = $$0.q();
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
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$2.a(this) ? $$0.a(g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(g.get($$1.a(ha.c)), $$0.c(a))
         .a(g.get($$1.a(ha.d)), $$0.c(c))
         .a(g.get($$1.a(ha.f)), $$0.c(b))
         .a(g.get($$1.a(ha.e)), $$0.c(d))
         .a(g.get($$1.a(ha.b)), $$0.c(e))
         .a(g.get($$1.a(ha.a)), $$0.c(f));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a(g.get($$1.b(ha.c)), $$0.c(a))
         .a(g.get($$1.b(ha.d)), $$0.c(c))
         .a(g.get($$1.b(ha.f)), $$0.c(b))
         .a(g.get($$1.b(ha.e)), $$0.c(d))
         .a(g.get($$1.b(ha.b)), $$0.c(e))
         .a(g.get($$1.b(ha.a)), $$0.c(f));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
