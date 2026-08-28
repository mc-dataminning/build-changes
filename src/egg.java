import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egg(ji<cuf> c, egi d) {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aky.a(lq.G).fieldOf("display").forGetter($$0x -> $$0x.c), egi.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egg::new)
   );
   public static final Codec<ji<egg>> b = akx.a(lq.aF, a);

   public ji<cuf> a() {
      return this.c;
   }

   public egi b() {
      return this.d;
   }
}
