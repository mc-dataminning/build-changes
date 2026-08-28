import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw extends dkn implements dkg {
   public static final MapCodec<dqw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxd.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dqw::new)
   );
   public static final dyn f = dye.aX;
   protected static final float g = 6.0F;
   protected static final fcl h = dkd.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dxd i;

   @Override
   public MapCodec<? extends dqw> a() {
      return e;
   }

   protected dqw(dxd $$0, dxn.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return h;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arx $$0, jh $$1, dxo $$2, bac $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f);
   }
}
