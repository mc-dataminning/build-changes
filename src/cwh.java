import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwh(jr<avz> e, float f, float g, wp h) {
   public static final Codec<cwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cwh::a),
               ayi.o.fieldOf("use_duration").forGetter(cwh::b),
               ayi.o.fieldOf("range").forGetter(cwh::c),
               wr.a.fieldOf("description").forGetter(cwh::d)
            )
            .apply($$0, cwh::new)
   );
   public static final yn<wa, cwh> b = yn.a(avz.d, cwh::a, yl.l, cwh::b, yl.l, cwh::c, wr.b, cwh::d, cwh::new);
   public static final Codec<jr<cwh>> c = akr.a(mc.I, a);
   public static final yn<wa, jr<cwh>> d = yl.a(mc.I, b);

   public jr<avz> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public wp d() {
      return this.h;
   }
}
