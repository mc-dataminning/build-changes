import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cza(axf<btd> c) {
   public static final Codec<cza> a = RecordCodecBuilder.create($$0 -> $$0.group(axf.b(mc.s).fieldOf("types").forGetter(cza::a)).apply($$0, cza::new));
   public static final yn<wa, cza> b = yn.a(axf.c(mc.s), cza::a, cza::new);

   public boolean a(btb $$0) {
      return $$0.a(this.c);
   }

   public axf<btd> a() {
      return this.c;
   }
}
