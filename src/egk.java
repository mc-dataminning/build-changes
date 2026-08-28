import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egk(ji<cuj> c, egm d) {
   public static final Codec<egk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a(lq.G).fieldOf("display").forGetter($$0x -> $$0x.c), egm.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egk::new)
   );
   public static final Codec<ji<egk>> b = ala.a(lq.aF, a);

   public ji<cuj> a() {
      return this.c;
   }

   public egm b() {
      return this.d;
   }
}
