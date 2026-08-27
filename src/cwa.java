import com.mojang.serialization.MapCodec;

public class cwa extends cxh implements cxb {
   public static final MapCodec<cwa> a = b(cwa::new);
   private static final emv b = ems.a(cwy.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cwy.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cwa> a() {
      return a;
   }

   protected cwa(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(cxa.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      dje.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
