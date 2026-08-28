import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehk extends eht {
   private final je c;
   private final dzd d;
   private final dzd e;
   private final int f;
   public static final MapCodec<ehk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               je.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dzd.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dzd.b.optionalFieldOf("allowed_search_condition", dzd.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehk::new)
   );

   private ehk(je $$0, dzd $$1, dzd $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ehk a(je $$0, dzd $$1, dzd $$2, int $$3) {
      return new ehk($$0, $$1, $$2, $$3);
   }

   public static ehk a(je $$0, dzd $$1, int $$2) {
      return a($$0, $$1, dzd.e(), $$2);
   }

   @Override
   public Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dcv $$4 = $$0.d();
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
   public ehu<?> b() {
      return ehu.j;
   }
}
