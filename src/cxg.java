import java.util.function.ToIntFunction;

public class cxg extends csv implements czw {
   public static final int a = 15;
   public static final dgj b = dfz.aP;
   public static final dga c = dfz.C;
   public static final ToIntFunction<dfj> d = $$0 -> $$0.c(b);

   public cxg(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(15)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b, c);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if (!$$1.B && $$3.go()) {
         $$1.a($$2, $$0.a(b), 2);
         return bgy.a;
      } else {
         return bgy.b;
      }
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return $$3.a(cji.hg) ? eid.b() : eid.a();
   }

   @Override
   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return true;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.a;
   }

   @Override
   public float b(dfj $$0, cpb $$1, gw $$2) {
      return 1.0F;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(c) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(b));
   }

   public static cjf a(cjf $$0, int $$1) {
      if ($$1 != 15) {
         qy $$2 = new qy();
         $$2.a(b.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
