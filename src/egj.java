import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egj(ji<cui> c, egl d) {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a(lq.G).fieldOf("display").forGetter($$0x -> $$0x.c), egl.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egj::new)
   );
   public static final Codec<ji<egj>> b = ala.a(lq.aF, a);

   public ji<cui> a() {
      return this.c;
   }

   public egl b() {
      return this.d;
   }
}
