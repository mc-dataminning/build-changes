import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eyk extends eyc {
   public static final MapCodec<eyk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asz.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  azn.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyk::new)
   );
   private final Optional<String> b;
   private final Optional<asz<String>> c;
   private final Optional<Integer> d;

   public eyk(List<ezy> $$0, Optional<asz<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cxp a(cxp $$0, ewp $$1) {
      $$0.a(ku.T, dax.a, this::a);
      return $$0;
   }

   private dax a(dax $$0) {
      return new dax(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public eye<eyk> b() {
      return eyf.M;
   }
}
