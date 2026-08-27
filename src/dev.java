import com.mojang.serialization.MapCodec;

public class dev extends dbt {
   public static final MapCodec<dev> a = b(dev::new);
   protected static final etc b = dch.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(dph.d $$0) {
      super($$0);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dof($$0, $$1);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if ($$1 instanceof apu && $$3.ct() && esz.c(esz.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), esn.i)) {
         aju<czg> $$4 = $$1.ae() == czg.j ? czg.h : czg.j;
         apu $$5 = ((apu)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(kn.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return crs.i;
   }

   @Override
   protected boolean a(dpi $$0, ela $$1) {
      return false;
   }
}
