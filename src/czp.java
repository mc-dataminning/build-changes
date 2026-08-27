import javax.annotation.Nullable;

public class czp extends csi implements czw {
   public static final dga a = dfz.F;
   public static final dga b = dfz.C;
   public static final dga c = dfz.G;
   protected static final eig d = csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(ha.a.b);

   public czp(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, biq $$3) {
      if ($$0 instanceof akq $$4) {
         akr $$5 = deb.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dcx.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if ($$1 instanceof akq $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, dcx.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, dcx.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return d;
   }

   @Override
   public eig f(dfj $$0, cpb $$1, gw $$2) {
      return d;
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new deb($$0, $$1);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ean.c));
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, cjf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bga.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return !$$0.B ? csi.a($$2, dcx.L, ($$0x, $$1x, $$2x, $$3) -> dkc.c.a($$0x, $$3.gf(), $$3.gg())) : null;
   }
}
