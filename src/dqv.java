import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class dqv extends dqs {
   public static final Codec<dqv> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(0, 81).fieldOf("limit").orElse(1).forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter($$0x -> $$0x.g),
               a()
            )
            .apply($$0, dqv::new)
   );
   private final int e;
   private final int f;
   private final int g;

   public dqv(int $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, OptionalInt.empty());
   }

   public dqv(int $$0, int $$1, int $$2, OptionalInt $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   protected dqt<?> b() {
      return dqt.a;
   }

   @Override
   public int a(int $$0, int $$1) {
      return $$1 < this.e ? this.f : this.g;
   }
}
