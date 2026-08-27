import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efn extends efw {
   private final is c;
   private final dxg d;
   private final dxg e;
   private final int f;
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               is.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dxg.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dxg.b.optionalFieldOf("allowed_search_condition", dxg.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efn::new)
   );

   private efn(is $$0, dxg $$1, dxg $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static efn a(is $$0, dxg $$1, dxg $$2, int $$3) {
      return new efn($$0, $$1, $$2, $$3);
   }

   public static efn a(is $$0, dxg $$1, int $$2) {
      return a($$0, $$1, dxg.e(), $$2);
   }

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      in.a $$3 = $$2.j();
      day $$4 = $$0.d();
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
   public efx<?> b() {
      return efx.j;
   }
}
