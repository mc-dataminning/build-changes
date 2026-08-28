import com.mojang.serialization.MapCodec;

public class ddw extends dfd implements dex {
   public static final MapCodec<ddw> a = b(ddw::new);
   private static final ewf b = ewc.a(deu.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), deu.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   protected ddw(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(dew.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      drm.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
