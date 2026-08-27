import javax.annotation.Nullable;

public class coo extends csf {
   public static final dcv a = ctg.aC;
   private static final efb b = cpn.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final efb c = cpn.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final efb d = cpn.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final efb e = cpn.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final efb f = cpn.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final efb g = cpn.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final efb h = cpn.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final efb i = eey.a(b, c, d, e);
   private static final efb j = eey.a(b, f, g, h);
   private static final sw k = sw.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public coo(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.g().h());
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(amr.aC);
         return bdx.b;
      }
   }

   @Nullable
   @Override
   public bea b(dcb $$0, cmm $$1, gu $$2) {
      return new bef(($$2x, $$3, $$4) -> new cbh($$2x, $$3, cbq.a($$1, $$2)), k);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      ha $$4 = $$0.c(a);
      return $$4.o() == ha.a.a ? i : j;
   }

   @Override
   protected void a(bvg $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, dcb $$3, bvg $$4) {
      if (!$$4.aQ()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, bvg $$2) {
      if (!$$2.aQ()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public ben a(bfj $$0) {
      return $$0.dJ().b($$0);
   }

   @Nullable
   public static dcb e(dcb $$0) {
      if ($$0.a(cpo.gS)) {
         return cpo.gT.n().a(a, $$0.c(a));
      } else {
         return $$0.a(cpo.gT) ? cpo.gU.n().a(a, $$0.c(a)) : null;
      }
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   @Override
   public int d(dcb $$0, cls $$1, gu $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
