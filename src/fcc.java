import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fcc extends fbu {
   public static final MapCodec<fcc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ask.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayw.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcc::new)
   );
   private final Optional<String> b;
   private final Optional<ask<String>> c;
   private final Optional<Integer> d;

   public fcc(List<fdq> $$0, Optional<ask<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected czy a(czy $$0, fah $$1) {
      $$0.a(kk.V, ddi.a, this::a);
      return $$0;
   }

   private ddi a(ddi $$0) {
      return new ddi(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public fbw<fcc> b() {
      return fbx.M;
   }
}
