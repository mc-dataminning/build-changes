import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esp extends esh {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ard.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  axo.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esp::new)
   );
   private final Optional<String> b;
   private final Optional<ard<String>> c;
   private final Optional<Integer> d;

   public esp(List<euf> $$0, Optional<ard<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cuc a(cuc $$0, equ $$1) {
      $$0.a(kn.J, cxk.a, this::a);
      return $$0;
   }

   private cxk a(cxk $$0) {
      return new cxk(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public esj<esp> b() {
      return esk.M;
   }
}
