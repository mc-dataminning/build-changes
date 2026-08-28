import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record day(jm<avo> d, bpu e, bpu f) implements das {
   public static final MapCodec<day> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avo.b.fieldOf("sound").forGetter(day::b),
               bpu.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(day::c),
               bpu.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(day::d)
            )
            .apply($$0, day::new)
   );

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      ayw $$5 = $$3.dR();
      if (!$$3.aX()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.de(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<day> a() {
      return a;
   }

   public jm<avo> b() {
      return this.d;
   }

   public bpu c() {
      return this.e;
   }

   public bpu d() {
      return this.f;
   }
}
