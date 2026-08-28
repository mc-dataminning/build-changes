import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvu(jq<awk> e, float f, float g, xi h) {
   public static final Codec<cvu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awk.b.fieldOf("sound_event").forGetter(cvu::a),
               ayt.o.fieldOf("use_duration").forGetter(cvu::b),
               ayt.o.fieldOf("range").forGetter(cvu::c),
               xk.a.fieldOf("description").forGetter(cvu::d)
            )
            .apply($$0, cvu::new)
   );
   public static final zg<wt, cvu> b = zg.a(awk.d, cvu::a, ze.j, cvu::b, ze.j, cvu::c, xk.b, cvu::d, cvu::new);
   public static final Codec<jq<cvu>> c = ale.a(lz.I, a);
   public static final zg<wt, jq<cvu>> d = ze.a(lz.I, b);

   public jq<awk> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xi d() {
      return this.h;
   }
}
