import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eng extends enq {
   private final jm c;
   private final eew d;
   private final eew e;
   private final int f;
   public static final MapCodec<eng> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jm.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eew.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eew.b.optionalFieldOf("allowed_search_condition", eew.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eng::new)
   );

   private eng(jm $$0, eew $$1, eew $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eng a(jm $$0, eew $$1, eew $$2, int $$3) {
      return new eng($$0, $$1, $$2, $$3);
   }

   public static eng a(jm $$0, eew $$1, int $$2) {
      return a($$0, $$1, eew.e(), $$2);
   }

   @Override
   public Stream<jh> a_(eno $$0, bam $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      dif $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for (int $$5 = 0; $$5 < this.f; $$5++) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.c(this.c);
            if ($$4.e($$3.v())) {
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
   public enr<?> b() {
      return enr.j;
   }
}
