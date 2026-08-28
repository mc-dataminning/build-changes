import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehh extends ehq {
   private final je c;
   private final dza d;
   private final dza e;
   private final int f;
   public static final MapCodec<ehh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               je.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dza.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dza.b.optionalFieldOf("allowed_search_condition", dza.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehh::new)
   );

   private ehh(je $$0, dza $$1, dza $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ehh a(je $$0, dza $$1, dza $$2, int $$3) {
      return new ehh($$0, $$1, $$2, $$3);
   }

   public static ehh a(je $$0, dza $$1, int $$2) {
      return a($$0, $$1, dza.e(), $$2);
   }

   @Override
   public Stream<iz> a_(eho $$0, azg $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dcs $$4 = $$0.d();
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
   public ehr<?> b() {
      return ehr.j;
   }
}
