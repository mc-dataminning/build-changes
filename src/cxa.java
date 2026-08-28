import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxa(jr<avz> e, float f, float g, wp h) {
   public static final Codec<cxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cxa::a),
               ayi.o.fieldOf("use_duration").forGetter(cxa::b),
               ayi.o.fieldOf("range").forGetter(cxa::c),
               wr.a.fieldOf("description").forGetter(cxa::d)
            )
            .apply($$0, cxa::new)
   );
   public static final yn<wa, cxa> b = yn.a(avz.d, cxa::a, yl.l, cxa::b, yl.l, cxa::c, wr.b, cxa::d, cxa::new);
   public static final Codec<jr<cxa>> c = akq.a(mc.I, a);
   public static final yn<wa, jr<cxa>> d = yl.a(mc.I, b);

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
