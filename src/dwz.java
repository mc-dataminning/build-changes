import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwz(jm<dwy> e, duz f) {
   public static final Codec<dwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwy.k.fieldOf("type").forGetter(dwz::a), duz.a.fieldOf("generator").forGetter(dwz::b)).apply($$0, $$0.stable(dwz::new))
   );
   public static final akq<dwz> b = akq.a(lu.bb, akr.b("overworld"));
   public static final akq<dwz> c = akq.a(lu.bb, akr.b("the_nether"));
   public static final akq<dwz> d = akq.a(lu.bb, akr.b("the_end"));

   public jm<dwy> a() {
      return this.e;
   }

   public duz b() {
      return this.f;
   }
}
