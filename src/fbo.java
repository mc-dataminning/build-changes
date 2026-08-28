import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbo extends fbg {
   public static final MapCodec<fbo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asi.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayu.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbo::new)
   );
   private final Optional<String> b;
   private final Optional<asi<String>> c;
   private final Optional<Integer> d;

   public fbo(List<fdc> $$0, Optional<asi<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected czn a(czn $$0, ezt $$1) {
      $$0.a(kk.V, dcx.a, this::a);
      return $$0;
   }

   private dcx a(dcx $$0) {
      return new dcx(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public fbi<fbo> b() {
      return fbj.M;
   }
}
