import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dad(jg<awx> e, float f, float g, xg h) {
   public static final Codec<dad> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awx.b.fieldOf("sound_event").forGetter(dad::a),
               azg.o.fieldOf("use_duration").forGetter(dad::b),
               azg.o.fieldOf("range").forGetter(dad::c),
               xi.a.fieldOf("description").forGetter(dad::d)
            )
            .apply($$0, dad::new)
   );
   public static final ze<wp, dad> b = ze.a(awx.d, dad::a, zc.l, dad::b, zc.l, dad::c, xi.b, dad::d, dad::new);
   public static final Codec<jg<dad>> c = aln.a(mi.aU, a);
   public static final ze<wp, jg<dad>> d = zc.a(mi.aU, b);

   public jg<awx> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xg d() {
      return this.h;
   }
}
