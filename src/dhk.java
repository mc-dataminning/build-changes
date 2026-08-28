import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhk(jj<dga> c, btl d) implements dhi {
   public static final MapCodec<dhk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ju.a(mh.aR).fieldOf("enchantments").forGetter(dhk::b), btl.c.fieldOf("cost").forGetter(dhk::c)).apply($$0, dhk::new)
   );

   @Override
   public void a(czn $$0, dgg.a $$1, azv $$2, bue $$3) {
      for (dgd $$5 : dgc.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dhk> a() {
      return b;
   }

   public jj<dga> b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }
}
