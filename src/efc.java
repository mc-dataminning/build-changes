import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efc(jf<efb> e, edc f) {
   public static final Codec<efc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efb.l.fieldOf("type").forGetter(efc::a), edc.a.fieldOf("generator").forGetter(efc::b)).apply($$0, $$0.stable(efc::new))
   );
   public static final alh<efc> b = alh.a(mh.bq, ali.b("overworld"));
   public static final alh<efc> c = alh.a(mh.bq, ali.b("the_nether"));
   public static final alh<efc> d = alh.a(mh.bq, ali.b("the_end"));

   public jf<efb> a() {
      return this.e;
   }

   public edc b() {
      return this.f;
   }
}
