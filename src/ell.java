import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ell(jr<cwj> c, eln d) {
   public static final Codec<ell> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwj.e.fieldOf("display").forGetter($$0x -> $$0x.c), eln.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ell::new)
   );
   public static final Codec<jr<ell>> b = akq.a(mc.aQ, a);

   public jr<cwj> a() {
      return this.c;
   }

   public eln b() {
      return this.d;
   }
}
