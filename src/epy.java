import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class epy extends eqi {
   private final ja c;
   private final ehn d;
   private final ehn e;
   private final int f;
   public static final MapCodec<epy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ja.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               ehn.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               ehn.b.optionalFieldOf("allowed_search_condition", ehn.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, epy::new)
   );

   private epy(ja $$0, ehn $$1, ehn $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static epy a(ja $$0, ehn $$1, ehn $$2, int $$3) {
      return new epy($$0, $$1, $$2, $$3);
   }

   public static epy a(ja $$0, ehn $$1, int $$2) {
      return a($$0, $$1, ehn.e(), $$2);
   }

   @Override
   public Stream<iu> a_(eqg $$0, azv $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      djz $$4 = $$0.d();
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
   public eqj<?> b() {
      return eqj.j;
   }
}
