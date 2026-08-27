import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clg(ig<aqu> b, int c, float d) {
   public static final Codec<clg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqu.b.fieldOf("sound_event").forGetter(clg::a), asy.j.fieldOf("use_duration").forGetter(clg::b), asy.k.fieldOf("range").forGetter(clg::c)
            )
            .apply($$0, clg::new)
   );

   public ig<aqu> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
