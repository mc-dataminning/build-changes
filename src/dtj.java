import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtj(he<cja> c, dtl d) {
   public static final Codec<dtj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aet.a(jc.D).fieldOf("display").forGetter($$0x -> $$0x.c), dtl.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dtj::new)
   );
   public static final Codec<he<dtj>> b = aes.a(jc.av, a);

   public he<cja> a() {
      return this.c;
   }

   public dtl b() {
      return this.d;
   }
}
