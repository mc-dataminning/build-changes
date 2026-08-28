import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwg(jr<avy> e, float f, float g, wo h) {
   public static final Codec<cwg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avy.b.fieldOf("sound_event").forGetter(cwg::a),
               ayh.o.fieldOf("use_duration").forGetter(cwg::b),
               ayh.o.fieldOf("range").forGetter(cwg::c),
               wq.a.fieldOf("description").forGetter(cwg::d)
            )
            .apply($$0, cwg::new)
   );
   public static final ym<vz, cwg> b = ym.a(avy.d, cwg::a, yk.l, cwg::b, yk.l, cwg::c, wq.b, cwg::d, cwg::new);
   public static final Codec<jr<cwg>> c = akq.a(mc.I, a);
   public static final ym<vz, jr<cwg>> d = yk.a(mc.I, b);

   public jr<avy> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public wo d() {
      return this.h;
   }
}
