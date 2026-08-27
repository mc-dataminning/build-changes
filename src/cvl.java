import com.mojang.serialization.MapCodec;

public class cvl extends cws implements cwm {
   public static final MapCodec<cvl> a = b(cvl::new);
   private static final emf b = emc.a(cwj.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cwj.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cvl> a() {
      return a;
   }

   protected cvl(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(cwl.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      dip.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
