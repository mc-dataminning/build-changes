import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eeo extends eex {
   private final ij c;
   private final dwh d;
   private final dwh e;
   private final int f;
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ij.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dwh.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dwh.b.optionalFieldOf("allowed_search_condition", dwh.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eeo::new)
   );

   private eeo(ij $$0, dwh $$1, dwh $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eeo a(ij $$0, dwh $$1, dwh $$2, int $$3) {
      return new eeo($$0, $$1, $$2, $$3);
   }

   public static eeo a(ij $$0, dwh $$1, int $$2) {
      return a($$0, $$1, dwh.e(), $$2);
   }

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      id.a $$3 = $$2.j();
      dab $$4 = $$0.d();
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
   public eey<?> b() {
      return eey.j;
   }
}
