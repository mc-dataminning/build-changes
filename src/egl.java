import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egl(ji<cuk> c, egn d) {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alc.a(lq.G).fieldOf("display").forGetter($$0x -> $$0x.c), egn.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egl::new)
   );
   public static final Codec<ji<egl>> b = alb.a(lq.aF, a);

   public ji<cuk> a() {
      return this.c;
   }

   public egn b() {
      return this.d;
   }
}
