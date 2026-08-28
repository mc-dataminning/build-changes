import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyz(axf<btc> c) {
   public static final Codec<cyz> a = RecordCodecBuilder.create($$0 -> $$0.group(axf.b(mc.s).fieldOf("types").forGetter(cyz::a)).apply($$0, cyz::new));
   public static final yn<wa, cyz> b = yn.a(axf.c(mc.s), cyz::a, cyz::new);

   public boolean a(bta $$0) {
      return $$0.a(this.c);
   }

   public axf<btc> a() {
      return this.c;
   }
}
