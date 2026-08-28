import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drg extends dkn implements dkg, dow {
   public static final MapCodec<drg> a = b(drg::new);
   protected static final float b = 6.0F;
   protected static final fcl c = dkd.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   protected drg(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dkf.ll);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return $$1.a(axq.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      dxo $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$0.a_($$1.d()).a(dkf.J);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   protected etq b_(dxo $$0) {
      return etr.c.a(false);
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      dxo $$4 = dkf.bE.m();
      dxo $$5 = $$4.b(dso.d, dyj.a);
      jh $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cpo $$0, dge $$1, jh $$2, dxo $$3, etp $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      return false;
   }
}
