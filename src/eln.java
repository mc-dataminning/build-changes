import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eln(jr<cwl> c, elp d) {
   public static final Codec<eln> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwl.e.fieldOf("display").forGetter($$0x -> $$0x.c), elp.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eln::new)
   );
   public static final Codec<jr<eln>> b = akq.a(mc.aQ, a);

   public jr<cwl> a() {
      return this.c;
   }

   public elp b() {
      return this.d;
   }
}
