import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cug(jm<avn> e, int f, float g) {
   public static final Codec<cug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avn.b.fieldOf("sound_event").forGetter(cug::a), axv.l.fieldOf("use_duration").forGetter(cug::b), axv.m.fieldOf("range").forGetter(cug::c)
            )
            .apply($$0, cug::new)
   );
   public static final yw<wj, cug> b = yw.a(avn.d, cug::a, yu.g, cug::b, yu.i, cug::c, cug::new);
   public static final Codec<jm<cug>> c = akm.a(lu.I, a);
   public static final yw<wj, jm<cug>> d = yu.a(lu.I, b);

   public jm<avn> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
