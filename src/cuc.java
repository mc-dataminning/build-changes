import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuc(ji<avv> e, int f, float g) {
   public static final Codec<cuc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avv.b.fieldOf("sound_event").forGetter(cuc::a), ayc.l.fieldOf("use_duration").forGetter(cuc::b), ayc.m.fieldOf("range").forGetter(cuc::c)
            )
            .apply($$0, cuc::new)
   );
   public static final zj<ww, cuc> b = zj.a(avv.d, cuc::a, zh.g, cuc::b, zh.i, cuc::c, cuc::new);
   public static final Codec<ji<cuc>> c = akx.a(lq.E, a);
   public static final zj<ww, ji<cuc>> d = zh.a(lq.E, b);

   public ji<avv> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
