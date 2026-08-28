import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuh(ji<avz> e, int f, float g) {
   public static final Codec<cuh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cuh::a), ayh.l.fieldOf("use_duration").forGetter(cuh::b), ayh.m.fieldOf("range").forGetter(cuh::c)
            )
            .apply($$0, cuh::new)
   );
   public static final zn<xa, cuh> b = zn.a(avz.d, cuh::a, zl.g, cuh::b, zl.i, cuh::c, cuh::new);
   public static final Codec<ji<cuh>> c = alb.a(lq.E, a);
   public static final zn<xa, ji<cuh>> d = zl.a(lq.E, b);

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
