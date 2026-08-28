import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbj extends fbb {
   public static final MapCodec<fbj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asi.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayu.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbj::new)
   );
   private final Optional<String> b;
   private final Optional<asi<String>> c;
   private final Optional<Integer> d;

   public fbj(List<fcx> $$0, Optional<asi<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected czk a(czk $$0, ezo $$1) {
      $$0.a(kk.V, dcu.a, this::a);
      return $$0;
   }

   private dcu a(dcu $$0) {
      return new dcu(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public fbd<fbj> b() {
      return fbe.M;
   }
}
