import javax.annotation.Nullable;

public class crm extends cvd {
   public static final dft a = cwe.aC;
   private static final ehw b = csl.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ehw c = csl.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ehw d = csl.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ehw e = csl.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ehw f = csl.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ehw g = csl.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ehw h = csl.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ehw i = eht.a(b, c, d, e);
   private static final ehw j = eht.a(b, f, g, h);
   private static final tf k = tf.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public crm(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.g().h());
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apg.aC);
         return bgq.b;
      }
   }

   @Nullable
   @Override
   public bgt b(dez $$0, cpl $$1, gu $$2) {
      return new bgy(($$2x, $$3, $$4) -> new cef($$2x, $$3, ceo.a($$1, $$2)), k);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ha $$4 = $$0.c(a);
      return $$4.o() == ha.a.a ? i : j;
   }

   @Override
   protected void a(bye $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, dez $$3, bye $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, bye $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bhg a(bii $$0) {
      return $$0.dL().b($$0);
   }

   @Nullable
   public static dez e(dez $$0) {
      if ($$0.a(csm.gS)) {
         return csm.gT.n().a(a, $$0.c(a));
      } else {
         return $$0.a(csm.gT) ? csm.gU.n().a(a, $$0.c(a)) : null;
      }
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public int d(dez $$0, cor $$1, gu $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
