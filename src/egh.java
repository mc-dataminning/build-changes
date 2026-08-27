import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egh extends egq {
   private final it c;
   private final dya d;
   private final dya e;
   private final int f;
   public static final MapCodec<egh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               it.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dya.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dya.b.optionalFieldOf("allowed_search_condition", dya.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egh::new)
   );

   private egh(it $$0, dya $$1, dya $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static egh a(it $$0, dya $$1, dya $$2, int $$3) {
      return new egh($$0, $$1, $$2, $$3);
   }

   public static egh a(it $$0, dya $$1, int $$2) {
      return a($$0, $$1, dya.e(), $$2);
   }

   @Override
   public Stream<io> a_(ego $$0, ayk $$1, io $$2) {
      io.a $$3 = $$2.j();
      dbs $$4 = $$0.d();
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
   public egr<?> b() {
      return egr.j;
   }
}
