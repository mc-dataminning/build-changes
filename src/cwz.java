import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwz(jq<awu> e, float f, float g, xk h) {
   public static final Codec<cwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.b.fieldOf("sound_event").forGetter(cwz::a),
               azd.o.fieldOf("use_duration").forGetter(cwz::b),
               azd.o.fieldOf("range").forGetter(cwz::c),
               xm.a.fieldOf("description").forGetter(cwz::d)
            )
            .apply($$0, cwz::new)
   );
   public static final zi<wv, cwz> b = zi.a(awu.d, cwz::a, zg.l, cwz::b, zg.l, cwz::c, xm.b, cwz::d, cwz::new);
   public static final Codec<jq<cwz>> c = all.a(mb.I, a);
   public static final zi<wv, jq<cwz>> d = zg.a(mb.I, b);

   public jq<awu> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xk d() {
      return this.h;
   }
}
