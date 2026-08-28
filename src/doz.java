import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doz extends dnw {
   public static final MapCodec<doz> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.m.fieldOf("chance").forGetter($$0x -> $$0x.h), lt.bi.fieldOf("particle").forGetter($$0x -> $$0x.g), t()).apply($$0, doz::new)
   );
   private final lr g;
   private final int h;

   @Override
   public MapCodec<doz> a() {
      return f;
   }

   public doz(int $$0, lr $$1, dwu.d $$2) {
      super($$2);
      this.h = $$0;
      this.g = $$1;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(this.h) == 0) {
         ji $$4 = $$2.e();
         dwv $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jn.b)) {
            azc.a($$1, $$2, $$3, this.g);
         }
      }
   }
}
