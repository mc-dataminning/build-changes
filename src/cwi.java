import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwi(jr<avz> e, float f, float g, wo h) {
   public static final Codec<cwi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cwi::a),
               ayi.o.fieldOf("use_duration").forGetter(cwi::b),
               ayi.o.fieldOf("range").forGetter(cwi::c),
               wq.a.fieldOf("description").forGetter(cwi::d)
            )
            .apply($$0, cwi::new)
   );
   public static final ym<vz, cwi> b = ym.a(avz.d, cwi::a, yk.l, cwi::b, yk.l, cwi::c, wq.b, cwi::d, cwi::new);
   public static final Codec<jr<cwi>> c = akq.a(mc.I, a);
   public static final ym<vz, jr<cwi>> d = yk.a(mc.I, b);

   public jr<avz> a() {
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
