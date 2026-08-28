import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drd extends dkw implements dkp {
   public static final MapCodec<drd> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, drd::new)
   );
   public static final dyu f = dyl.aV;
   protected static final float g = 6.0F;
   protected static final fcs h = dkm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dxk i;

   @Override
   public MapCodec<? extends drd> a() {
      return e;
   }

   protected drd(dxk $$0, dxu.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return h;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ash $$0, jh $$1, dxv $$2, bam $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return true;
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f);
   }
}
