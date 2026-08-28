import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dch(jn<awd> d, bqs e, bqs f) implements dcb {
   public static final MapCodec<dch> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awd.b.fieldOf("sound").forGetter(dch::b),
               bqs.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dch::c),
               bqs.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dch::d)
            )
            .apply($$0, dch::new)
   );

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      azl $$5 = $$3.dV();
      if (!$$3.ba()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.di(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   public jn<awd> b() {
      return this.d;
   }

   public bqs c() {
      return this.e;
   }

   public bqs d() {
      return this.f;
   }
}
