import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwi(jr<avz> e, float f, float g, wp h) {
   public static final Codec<cwi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cwi::a),
               ayi.o.fieldOf("use_duration").forGetter(cwi::b),
               ayi.o.fieldOf("range").forGetter(cwi::c),
               wr.a.fieldOf("description").forGetter(cwi::d)
            )
            .apply($$0, cwi::new)
   );
   public static final yn<wa, cwi> b = yn.a(avz.d, cwi::a, yl.l, cwi::b, yl.l, cwi::c, wr.b, cwi::d, cwi::new);
   public static final Codec<jr<cwi>> c = akr.a(mc.I, a);
   public static final yn<wa, jr<cwi>> d = yl.a(mc.I, b);

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
