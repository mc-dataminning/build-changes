import com.mojang.serialization.MapCodec;

public class drw extends dij {
   public static final MapCodec<drw> a = b(drw::new);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      ezr $$4 = new ezr(0.25, 0.05F, 0.25);
      if ($$3 instanceof bve $$5 && $$5.b(btp.K)) {
         $$4 = new ezr(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
