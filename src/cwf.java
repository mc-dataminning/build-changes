import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwf(jq<awm> e, float f, float g, xj h) {
   public static final Codec<cwf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(cwf::a),
               ayv.o.fieldOf("use_duration").forGetter(cwf::b),
               ayv.o.fieldOf("range").forGetter(cwf::c),
               xl.a.fieldOf("description").forGetter(cwf::d)
            )
            .apply($$0, cwf::new)
   );
   public static final zh<wu, cwf> b = zh.a(awm.d, cwf::a, zf.k, cwf::b, zf.k, cwf::c, xl.b, cwf::d, cwf::new);
   public static final Codec<jq<cwf>> c = alf.a(ma.I, a);
   public static final zh<wu, jq<cwf>> d = zf.a(ma.I, b);

   public jq<awm> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xj d() {
      return this.h;
   }
}
