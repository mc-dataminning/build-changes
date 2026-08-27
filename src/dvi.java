import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvi(ib<cle> c, dvk d) {
   public static final Codec<dvi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agf.a(jz.E).fieldOf("display").forGetter($$0x -> $$0x.c), dvk.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dvi::new)
   );
   public static final Codec<ib<dvi>> b = age.a(jz.ax, a);

   public ib<cle> a() {
      return this.c;
   }

   public dvk b() {
      return this.d;
   }
}
