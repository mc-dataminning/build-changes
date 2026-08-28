import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efe(jg<efd> e, ede f) {
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efd.l.fieldOf("type").forGetter(efe::a), ede.a.fieldOf("generator").forGetter(efe::b)).apply($$0, $$0.stable(efe::new))
   );
   public static final alj<efe> b = alj.a(mi.bq, alk.b("overworld"));
   public static final alj<efe> c = alj.a(mi.bq, alk.b("the_nether"));
   public static final alj<efe> d = alj.a(mi.bq, alk.b("the_end"));

   public jg<efd> a() {
      return this.e;
   }

   public ede b() {
      return this.f;
   }
}
