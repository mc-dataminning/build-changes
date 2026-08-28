import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehj extends ehs {
   private final je c;
   private final dzc d;
   private final dzc e;
   private final int f;
   public static final MapCodec<ehj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               je.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dzc.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dzc.b.optionalFieldOf("allowed_search_condition", dzc.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehj::new)
   );

   private ehj(je $$0, dzc $$1, dzc $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ehj a(je $$0, dzc $$1, dzc $$2, int $$3) {
      return new ehj($$0, $$1, $$2, $$3);
   }

   public static ehj a(je $$0, dzc $$1, int $$2) {
      return a($$0, $$1, dzc.e(), $$2);
   }

   @Override
   public Stream<iz> a_(ehq $$0, azh $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dcu $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for (int $$5 = 0; $$5 < this.f; $$5++) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.c(this.c);
            if ($$4.d($$3.v())) {
               return Stream.of();
            }

            if (!this.e.test($$4, $$3)) {
               break;
            }
         }

         return this.d.test($$4, $$3) ? Stream.of($$3) : Stream.of();
      }
   }

   @Override
   public eht<?> b() {
      return eht.j;
   }
}
