import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhm(jf<dga> c, btl d) implements dhi {
   public static final MapCodec<dhm> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dga.c.fieldOf("enchantment").forGetter(dhm::b), btl.c.fieldOf("level").forGetter(dhm::c)).apply($$0, dhm::new)
   );

   @Override
   public void a(czn $$0, dgg.a $$1, azv $$2, bue $$3) {
      $$1.b(this.c, azm.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dhm> a() {
      return b;
   }

   public jf<dga> b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }
}
