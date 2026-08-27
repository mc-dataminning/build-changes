import com.mojang.serialization.MapCodec;

public class cxu extends czb implements cyv {
   public static final MapCodec<cxu> a = b(cxu::new);
   private static final eos b = eop.a(cys.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cys.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cxu> a() {
      return a;
   }

   protected cxu(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(cyu.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      dky.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
