import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fce extends fbw {
   public static final MapCodec<fce> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asm.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayy.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fce::new)
   );
   private final Optional<String> b;
   private final Optional<asm<String>> c;
   private final Optional<Integer> d;

   public fce(List<fds> $$0, Optional<asm<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected daa a(daa $$0, faj $$1) {
      $$0.a(kl.V, ddk.a, this::a);
      return $$0;
   }

   private ddk a(ddk $$0) {
      return new ddk(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public fby<fce> b() {
      return fbz.M;
   }
}
