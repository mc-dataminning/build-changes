import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dww(jm<dwv> e, dux f) {
   public static final Codec<dww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwv.k.fieldOf("type").forGetter(dww::a), dux.a.fieldOf("generator").forGetter(dww::b)).apply($$0, $$0.stable(dww::new))
   );
   public static final akp<dww> b = akp.a(lu.bb, akq.b("overworld"));
   public static final akp<dww> c = akp.a(lu.bb, akq.b("the_nether"));
   public static final akp<dww> d = akp.a(lu.bb, akq.b("the_end"));

   public jm<dwv> a() {
      return this.e;
   }

   public dux b() {
      return this.f;
   }
}
