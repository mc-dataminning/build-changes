import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtn extends dwd implements dmu {
   public static final MapCodec<dtn> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eah.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dtn::new)
   );
   public static final ebt f = ebj.aX;
   private static final ffw a = dmr.b(12.0, 0.0, 12.0);
   protected final eah g;

   @Override
   public MapCodec<? extends dtn> a() {
      return e;
   }

   protected dtn(eah $$0, eas.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return a;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.B($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arq $$0, iv $$1, eat $$2, azv $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return true;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(f);
   }
}
