import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class epq extends eqa {
   private final ja c;
   private final ehf d;
   private final ehf e;
   private final int f;
   public static final MapCodec<epq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ja.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               ehf.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               ehf.b.optionalFieldOf("allowed_search_condition", ehf.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, epq::new)
   );

   private epq(ja $$0, ehf $$1, ehf $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static epq a(ja $$0, ehf $$1, ehf $$2, int $$3) {
      return new epq($$0, $$1, $$2, $$3);
   }

   public static epq a(ja $$0, ehf $$1, int $$2) {
      return a($$0, $$1, ehf.e(), $$2);
   }

   @Override
   public Stream<iu> a_(epy $$0, azv $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      dju $$4 = $$0.d();
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
   public eqb<?> b() {
      return eqb.j;
   }
}
