import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddu(jr<avy> d, brl e, brl f) implements ddo {
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avy.b.fieldOf("sound").forGetter(ddu::b),
               brl.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(ddu::c),
               brl.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(ddu::d)
            )
            .apply($$0, ddu::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      azg $$5 = $$3.dZ();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dn(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public jr<avy> b() {
      return this.d;
   }

   public brl c() {
      return this.e;
   }

   public brl d() {
      return this.f;
   }
}
