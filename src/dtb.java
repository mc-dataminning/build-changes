import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtb extends dvr implements dmi {
   public static final MapCodec<dtb> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzv.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dtb::new)
   );
   public static final ebh f = eax.aX;
   private static final ffk a = dmf.b(12.0, 0.0, 12.0);
   protected final dzv g;

   @Override
   public MapCodec<? extends dtb> a() {
      return e;
   }

   protected dtb(dzv $$0, eag.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.B($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arq $$0, iu $$1, eah $$2, azv $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return true;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(f);
   }
}
