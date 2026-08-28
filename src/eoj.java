import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eoj(je<cyo> c, eol d) {
   public static final Codec<eoj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyo.e.fieldOf("display").forGetter($$0x -> $$0x.c), eol.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eoj::new)
   );
   public static final Codec<je<eoj>> b = ala.a(mg.aQ, a);

   public je<cyo> a() {
      return this.c;
   }

   public eol b() {
      return this.d;
   }
}
