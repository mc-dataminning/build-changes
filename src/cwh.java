import javax.annotation.Nullable;

public class cwh extends cpa implements cwo {
   public static final dcs a = dcr.F;
   public static final dcs b = dcr.C;
   public static final dcs c = dcr.G;
   protected static final efb d = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(ha.a.b);

   public cwh(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
      if ($$0 instanceof aif $$4) {
         aig $$5 = dat.a($$3);
         if ($$5 != null) {
            $$4.a($$1, czp.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if ($$1 instanceof aif $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, czp.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, czp.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      return d;
   }

   @Override
   public efb f(dcb $$0, cls $$1, gu $$2) {
      return d;
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Nullable
   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dat($$0, $$1);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == dxf.c));
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(b) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bcz.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return !$$0.B ? cpa.a($$2, czp.L, ($$0x, $$1x, $$2x, $$3) -> dgu.c.a($$0x, $$3.gb(), $$3.gc())) : null;
   }
}
