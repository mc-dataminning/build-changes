import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edi(il<cre> c, edk d) {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajq.a(ks.F).fieldOf("display").forGetter($$0x -> $$0x.c), edk.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, edi::new)
   );
   public static final Codec<il<edi>> b = ajp.a(ks.aB, a);

   public il<cre> a() {
      return this.c;
   }

   public edk b() {
      return this.d;
   }
}
