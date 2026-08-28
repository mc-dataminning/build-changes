import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class etg extends esy {
   public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ark.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  axv.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etg::new)
   );
   private final Optional<String> b;
   private final Optional<ark<String>> c;
   private final Optional<Integer> d;

   public etg(List<euw> $$0, Optional<ark<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      $$0.a(kq.J, cxz.a, this::a);
      return $$0;
   }

   private cxz a(cxz $$0) {
      return new cxz(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public eta<etg> b() {
      return etb.M;
   }
}
