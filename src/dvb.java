import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class dvb extends duz {
   public static final Codec<dvb> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(0, 80).fieldOf("limit").orElse(1).forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 80).fieldOf("upper_limit").orElse(1).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter($$0x -> $$0x.g),
               Codec.intRange(0, 16).fieldOf("middle_size").orElse(1).forGetter($$0x -> $$0x.h),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter($$0x -> $$0x.i),
               a()
            )
            .apply($$0, dvb::new)
   );
   private final int e;
   private final int f;
   private final int g;
   private final int h;
   private final int i;

   public dvb(int $$0, int $$1, int $$2, int $$3, int $$4, OptionalInt $$5) {
      super($$5);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   @Override
   protected dva<?> b() {
      return dva.b;
   }

   @Override
   public int a(int $$0, int $$1) {
      if ($$1 < this.e) {
         return this.g;
      } else {
         return $$1 >= $$0 - this.f ? this.i : this.h;
      }
   }
}
