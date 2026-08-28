import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eem(jf<eel> e, ecm f) {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eel.l.fieldOf("type").forGetter(eem::a), ecm.a.fieldOf("generator").forGetter(eem::b)).apply($$0, $$0.stable(eem::new))
   );
   public static final alf<eem> b = alf.a(mh.bp, alg.b("overworld"));
   public static final alf<eem> c = alf.a(mh.bp, alg.b("the_nether"));
   public static final alf<eem> d = alf.a(mh.bp, alg.b("the_end"));

   public jf<eel> a() {
      return this.e;
   }

   public ecm b() {
      return this.f;
   }
}
