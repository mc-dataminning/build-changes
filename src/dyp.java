import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyp(jo<dyo> e, dwp f) {
   public static final Codec<dyp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyo.k.fieldOf("type").forGetter(dyp::a), dwp.a.fieldOf("generator").forGetter(dyp::b)).apply($$0, $$0.stable(dyp::new))
   );
   public static final ald<dyp> b = ald.a(lw.bd, ale.b("overworld"));
   public static final ald<dyp> c = ald.a(lw.bd, ale.b("the_nether"));
   public static final ald<dyp> d = ald.a(lw.bd, ale.b("the_end"));

   public jo<dyo> a() {
      return this.e;
   }

   public dwp b() {
      return this.f;
   }
}
