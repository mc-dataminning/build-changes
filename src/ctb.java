import javax.annotation.Nullable;

public class ctb extends csk implements cvo {
   private static final dgl b = dgb.bv;
   public static final int a = 2;
   private final csx c;
   private final ape d;
   private final ape e;

   public ctb(csx $$0, dfk.d $$1, ape $$2, ape $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.e = $$3;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.c_($$2) instanceof ddb $$4) {
         $$4.c();
      }

      if (cvp.h($$1.a_($$2.d())) && $$2.v() >= $$1.H_()) {
         byo $$5 = byo.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, byo $$2) {
      ehp $$3 = $$2.cG().f();
      $$0.c(2001, gw.a($$3), csx.i($$2.t()));
      $$0.a($$2, djv.f, $$3);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$3.a(16) == 0) {
         gw $$4 = $$2.d();
         if (cvp.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ip(ix.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddb($$0, $$1);
   }

   public csx a() {
      return this.c;
   }

   public ape b() {
      return this.d;
   }

   public ape c() {
      return this.e;
   }
}
