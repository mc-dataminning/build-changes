import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eip(jn<cvg> c, eir d) {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aky.a(lv.K).fieldOf("display").forGetter($$0x -> $$0x.c), eir.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eip::new)
   );
   public static final Codec<jn<eip>> b = akx.a(lv.aN, a);

   public jn<cvg> a() {
      return this.c;
   }

   public eir b() {
      return this.d;
   }
}
