import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddz(jv<cxd> c) {
   public static final Codec<ddz> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.K).fieldOf("items").forGetter(ddz::a)).apply($$0, ddz::new));
   public static final yn<wa, ddz> b = yn.a(yl.c(mc.K), ddz::a, ddz::new);

   public boolean a(cxh $$0) {
      return $$0.a(this.c);
   }

   public jv<cxd> a() {
      return this.c;
   }
}
