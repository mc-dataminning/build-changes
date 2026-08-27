import com.mojang.serialization.MapCodec;

public class dfx extends deh {
   public static final MapCodec<dfx> a = b(dfx::new);
   protected static final float b = 6.0F;
   protected static final evd c = ddy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   protected dfx(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(avw.cl);
   }
}
