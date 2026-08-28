import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuj(ji<avz> e, int f, float g) {
   public static final Codec<cuj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cuj::a), ayh.l.fieldOf("use_duration").forGetter(cuj::b), ayh.m.fieldOf("range").forGetter(cuj::c)
            )
            .apply($$0, cuj::new)
   );
   public static final zn<xa, cuj> b = zn.a(avz.d, cuj::a, zl.g, cuj::b, zl.i, cuj::c, cuj::new);
   public static final Codec<ji<cuj>> c = alb.a(lq.E, a);
   public static final zn<xa, ji<cuj>> d = zl.a(lq.E, b);

   public ji<avz> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
