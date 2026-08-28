import com.mojang.serialization.MapCodec;

public class dod extends dqa implements dqs {
   public static final MapCodec<dod> b = b(dod::new);
   public static final dxo c = dxn.J;
   public static final dxo d = dxn.B;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dod> a() {
      return b;
   }

   public dod(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eta.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dwx $$0, dgi $$1, ji $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dwx $$0, dgi $$1, ji $$2) {
      jn $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eud.a($$1, $$3, null));
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$1.af() && (long)$$1.A.a(200) <= $$1.ad() % 200L && $$2.v() == $$1.a(ecs.a.b, $$2.u(), $$2.w()) - 1) {
         azd.a($$0.c(a).o(), $$1, $$2, 0.125, lt.aV, bru.a(1, 2));
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }
}
