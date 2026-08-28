import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddw(jr<avz> d, brn e, brn f) implements ddq {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound").forGetter(ddw::b),
               brn.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(ddw::c),
               brn.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(ddw::d)
            )
            .apply($$0, ddw::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcy $$2, bul $$3, fba $$4) {
      azh $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public jr<avz> b() {
      return this.d;
   }

   public brn c() {
      return this.e;
   }

   public brn d() {
      return this.f;
   }
}
