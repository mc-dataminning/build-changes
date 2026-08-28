import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddx(jr<avz> d, bro e, bro f) implements ddr {
   public static final MapCodec<ddx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound").forGetter(ddx::b),
               bro.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(ddx::c),
               bro.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(ddx::d)
            )
            .apply($$0, ddx::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      azh $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public jr<avz> b() {
      return this.d;
   }

   public bro c() {
      return this.e;
   }

   public bro d() {
      return this.f;
   }
}
