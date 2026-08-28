import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ear(jr<eaq> e, dyr f) {
   public static final Codec<ear> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eaq.k.fieldOf("type").forGetter(ear::a), dyr.a.fieldOf("generator").forGetter(ear::b)).apply($$0, $$0.stable(ear::new))
   );
   public static final akt<ear> b = akt.a(mc.bf, aku.b("overworld"));
   public static final akt<ear> c = akt.a(mc.bf, aku.b("the_nether"));
   public static final akt<ear> d = akt.a(mc.bf, aku.b("the_end"));

   public jr<eaq> a() {
      return this.e;
   }

   public dyr b() {
      return this.f;
   }
}
