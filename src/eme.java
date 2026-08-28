import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eme(jq<cxc> c, emg d) {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxc.e.fieldOf("display").forGetter($$0x -> $$0x.c), emg.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eme::new)
   );
   public static final Codec<jq<eme>> b = all.a(mb.aQ, a);

   public jq<cxc> a() {
      return this.c;
   }

   public emg b() {
      return this.d;
   }
}
