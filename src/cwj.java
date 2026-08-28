import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwj(jr<avz> e, float f, float g, wp h) {
   public static final Codec<cwj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cwj::a),
               ayi.o.fieldOf("use_duration").forGetter(cwj::b),
               ayi.o.fieldOf("range").forGetter(cwj::c),
               wr.a.fieldOf("description").forGetter(cwj::d)
            )
            .apply($$0, cwj::new)
   );
   public static final yn<wa, cwj> b = yn.a(avz.d, cwj::a, yl.l, cwj::b, yl.l, cwj::c, wr.b, cwj::d, cwj::new);
   public static final Codec<jr<cwj>> c = akr.a(mc.I, a);
   public static final yn<wa, jr<cwj>> d = yl.a(mc.I, b);

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
