import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cza(axf<btc> c) {
   public static final Codec<cza> a = RecordCodecBuilder.create($$0 -> $$0.group(axf.b(mc.s).fieldOf("types").forGetter(cza::a)).apply($$0, cza::new));
   public static final ym<vz, cza> b = ym.a(axf.c(mc.s), cza::a, cza::new);

   public boolean a(bta $$0) {
      return $$0.a(this.c);
   }

   public axf<btc> a() {
      return this.c;
   }
}
