import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejy(jq<cvx> c, eka d) {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a(lz.K).fieldOf("display").forGetter($$0x -> $$0x.c), eka.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ejy::new)
   );
   public static final Codec<jq<ejy>> b = ale.a(lz.aO, a);

   public jq<cvx> a() {
      return this.c;
   }

   public eka b() {
      return this.d;
   }
}
