import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dte(hg<civ> c, dtg d) {
   public static final Codec<dte> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a(je.D).fieldOf("display").forGetter($$0x -> $$0x.c), dtg.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dte::new)
   );
   public static final Codec<hg<dte>> b = aeq.a(je.av, a);

   public hg<civ> a() {
      return this.c;
   }

   public dtg b() {
      return this.d;
   }
}
