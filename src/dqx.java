import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqx extends dko implements dkh {
   public static final MapCodec<dqx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxf.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dqx::new)
   );
   public static final dyq f = dyg.aX;
   private static final fcr a = dke.b(12.0, 0.0, 12.0);
   protected final dxf g;

   @Override
   public MapCodec<? extends dqx> a() {
      return e;
   }

   protected dqx(dxf $$0, dxp.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.B.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ard $$0, ji $$1, dxq $$2, azh $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(f);
   }
}
