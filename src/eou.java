import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eou(je<cyu> c, eow d) {
   public static final Codec<eou> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyu.e.fieldOf("display").forGetter($$0x -> $$0x.c), eow.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eou::new)
   );
   public static final Codec<je<eou>> b = alc.a(mg.aR, a);

   public je<cyu> a() {
      return this.c;
   }

   public eow b() {
      return this.d;
   }
}
