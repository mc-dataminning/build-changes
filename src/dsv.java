import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsv extends dvj implements dmd {
   public static final MapCodec<dsv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzn.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dsv::new)
   );
   public static final eaz f = eap.aX;
   private static final ffc a = dma.b(12.0, 0.0, 12.0);
   protected final dzn g;

   @Override
   public MapCodec<? extends dsv> a() {
      return e;
   }

   protected dsv(dzn $$0, dzy.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.B.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.B($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arq $$0, iu $$1, dzz $$2, azv $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return true;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(f);
   }
}
