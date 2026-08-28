import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehv extends eie {
   private final jf c;
   private final dzn d;
   private final dzn e;
   private final int f;
   public static final MapCodec<ehv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jf.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dzn.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dzn.b.optionalFieldOf("allowed_search_condition", dzn.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehv::new)
   );

   private ehv(jf $$0, dzn $$1, dzn $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ehv a(jf $$0, dzn $$1, dzn $$2, int $$3) {
      return new ehv($$0, $$1, $$2, $$3);
   }

   public static ehv a(jf $$0, dzn $$1, int $$2) {
      return a($$0, $$1, dzn.e(), $$2);
   }

   @Override
   public Stream<ja> a_(eic $$0, ayo $$1, ja $$2) {
      ja.a $$3 = $$2.j();
      ddc $$4 = $$0.d();
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
   public eif<?> b() {
      return eif.j;
   }
}
