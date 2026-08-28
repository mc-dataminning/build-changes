import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cui(ji<avz> e, int f, float g) {
   public static final Codec<cui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cui::a), ayh.l.fieldOf("use_duration").forGetter(cui::b), ayh.m.fieldOf("range").forGetter(cui::c)
            )
            .apply($$0, cui::new)
   );
   public static final zn<xa, cui> b = zn.a(avz.d, cui::a, zl.g, cui::b, zl.i, cui::c, cui::new);
   public static final Codec<ji<cui>> c = alb.a(lq.E, a);
   public static final zn<xa, ji<cui>> d = zl.a(lq.E, b);

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
