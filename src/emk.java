import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emk extends emu {
   private final jn c;
   private final eea d;
   private final eea e;
   private final int f;
   public static final MapCodec<emk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jn.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eea.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eea.b.optionalFieldOf("allowed_search_condition", eea.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, emk::new)
   );

   private emk(jn $$0, eea $$1, eea $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static emk a(jn $$0, eea $$1, eea $$2, int $$3) {
      return new emk($$0, $$1, $$2, $$3);
   }

   public static emk a(jn $$0, eea $$1, int $$2) {
      return a($$0, $$1, eea.e(), $$2);
   }

   @Override
   public Stream<ji> a_(ems $$0, azh $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      dhh $$4 = $$0.d();
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
   public emv<?> b() {
      return emv.j;
   }
}
