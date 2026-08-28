import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqv extends dko implements dkh {
   public static final MapCodec<dqv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxc.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dqv::new)
   );
   public static final dym f = dyd.aV;
   protected static final float g = 6.0F;
   protected static final fcm h = dke.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dxc i;

   @Override
   public MapCodec<? extends dqv> a() {
      return e;
   }

   protected dqv(dxc $$0, dxm.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return h;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ash $$0, jh $$1, dxn $$2, bam $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return true;
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f);
   }
}
