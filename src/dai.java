import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dai(jj<avg> d, bpk e, bpk f) implements dac {
   public static final MapCodec<dai> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avg.b.fieldOf("sound").forGetter(dai::b),
               bpk.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dai::c),
               bpk.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dai::d)
            )
            .apply($$0, dai::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      ayo $$5 = $$3.dU();
      if (!$$3.aY()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dg(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public jj<avg> b() {
      return this.d;
   }

   public bpk c() {
      return this.e;
   }

   public bpk d() {
      return this.f;
   }
}
