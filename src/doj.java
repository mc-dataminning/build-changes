import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doj extends dnt implements dow {
   public static final MapCodec<doj> c = b(doj::new);
   protected static final fcl g = dkd.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<doj> a() {
      return c;
   }

   protected doj(dxn.d $$0) {
      super($$0, jm.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dxo $$0) {
      return $$0.a(dkf.J);
   }

   @Override
   protected dkd b() {
      return dkf.mF;
   }

   @Override
   protected boolean o(dxo $$0) {
      return !$$0.a(dkf.ll);
   }

   @Override
   public boolean a(@Nullable cpo $$0, dge $$1, jh $$2, dxo $$3, etp $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      return false;
   }

   @Override
   protected int a(bac $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return $$1.a(axq.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected etq b_(dxo $$0) {
      return etr.c.a(false);
   }
}
