import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsz(he<cis> c, dtb d) {
   public static final Codec<dsz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aeo.a(jc.D).fieldOf("display").forGetter($$0x -> $$0x.c), dtb.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dsz::new)
   );
   public static final Codec<he<dsz>> b = aen.a(jc.av, a);

   public he<cis> a() {
      return this.c;
   }

   public dtb b() {
      return this.d;
   }
}
