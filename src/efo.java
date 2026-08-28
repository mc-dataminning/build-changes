import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efo(jg<efn> e, edo f) {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efn.l.fieldOf("type").forGetter(efo::a), edo.a.fieldOf("generator").forGetter(efo::b)).apply($$0, $$0.stable(efo::new))
   );
   public static final alq<efo> b = alq.a(mi.bq, alr.b("overworld"));
   public static final alq<efo> c = alq.a(mi.bq, alr.b("the_nether"));
   public static final alq<efo> d = alq.a(mi.bq, alr.b("the_end"));

   public jg<efn> a() {
      return this.e;
   }

   public edo b() {
      return this.f;
   }
}
