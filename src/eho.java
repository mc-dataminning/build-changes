import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eho extends ehx {
   private final jf c;
   private final dzg d;
   private final dzg e;
   private final int f;
   public static final MapCodec<eho> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jf.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dzg.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dzg.b.optionalFieldOf("allowed_search_condition", dzg.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eho::new)
   );

   private eho(jf $$0, dzg $$1, dzg $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eho a(jf $$0, dzg $$1, dzg $$2, int $$3) {
      return new eho($$0, $$1, $$2, $$3);
   }

   public static eho a(jf $$0, dzg $$1, int $$2) {
      return a($$0, $$1, dzg.e(), $$2);
   }

   @Override
   public Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      ja.a $$3 = $$2.j();
      dcz $$4 = $$0.d();
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
   public ehy<?> b() {
      return ehy.j;
   }
}
