import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehd extends ehm {
   private final je c;
   private final dyw d;
   private final dyw e;
   private final int f;
   public static final MapCodec<ehd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               je.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dyw.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dyw.b.optionalFieldOf("allowed_search_condition", dyw.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehd::new)
   );

   private ehd(je $$0, dyw $$1, dyw $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ehd a(je $$0, dyw $$1, dyw $$2, int $$3) {
      return new ehd($$0, $$1, $$2, $$3);
   }

   public static ehd a(je $$0, dyw $$1, int $$2) {
      return a($$0, $$1, dyw.e(), $$2);
   }

   @Override
   public Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dco $$4 = $$0.d();
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
   public ehn<?> b() {
      return ehn.j;
   }
}
