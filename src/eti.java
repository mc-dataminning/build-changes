import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eti extends eta {
   public static final Codec<eti> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axu.a(ark.a(axu.b(0, 32)), "title").forGetter($$0x -> $$0x.c),
                  axu.a(Codec.STRING, "author").forGetter($$0x -> $$0x.b),
                  axu.a(axu.a(0, 3), "generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eti::new)
   );
   private final Optional<String> b;
   private final Optional<ark<String>> c;
   private final Optional<Integer> d;

   public eti(List<euu> $$0, Optional<ark<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.H, cya.a, this::a);
      return $$0;
   }

   private cya a(cya $$0) {
      return new cya(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public etc b() {
      return etd.J;
   }
}
