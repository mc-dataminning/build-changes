import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvy extends dvt {
   public static final Codec<dvy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bhl.b(dvt.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dvy::new)
   );
   private final bhl<dvt> b;

   public dvy(bhl<dvt> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(atw $$0, dnt $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dvu<?> a() {
      return dvu.f;
   }
}
