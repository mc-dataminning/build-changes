import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drc extends dkv implements dko {
   public static final MapCodec<drc> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxj.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, drc::new)
   );
   public static final dyt f = dyk.aV;
   protected static final float g = 6.0F;
   protected static final fcr h = dkl.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dxj i;

   @Override
   public MapCodec<? extends drc> a() {
      return e;
   }

   protected drc(dxj $$0, dxt.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return h;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ash $$0, jh $$1, dxu $$2, bam $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return true;
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f);
   }
}
