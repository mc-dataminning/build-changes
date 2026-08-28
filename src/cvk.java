import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvk(jo<awf> e, float f, float g, xe h) {
   public static final Codec<cvk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awf.b.fieldOf("sound_event").forGetter(cvk::a),
               ayo.n.fieldOf("use_duration").forGetter(cvk::b),
               ayo.n.fieldOf("range").forGetter(cvk::c),
               xg.a.fieldOf("description").forGetter(cvk::d)
            )
            .apply($$0, cvk::new)
   );
   public static final zc<wp, cvk> b = zc.a(awf.d, cvk::a, za.j, cvk::b, za.j, cvk::c, xg.b, cvk::d, cvk::new);
   public static final Codec<jo<cvk>> c = ala.a(lw.I, a);
   public static final zc<wp, jo<cvk>> d = za.a(lw.I, b);

   public jo<awf> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xe d() {
      return this.h;
   }
}
