import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eod extends eon {
   private final jo c;
   private final efs d;
   private final efs e;
   private final int f;
   public static final MapCodec<eod> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jo.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               efs.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               efs.b.optionalFieldOf("allowed_search_condition", efs.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eod::new)
   );

   private eod(jo $$0, efs $$1, efs $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eod a(jo $$0, efs $$1, efs $$2, int $$3) {
      return new eod($$0, $$1, $$2, $$3);
   }

   public static eod a(jo $$0, efs $$1, int $$2) {
      return a($$0, $$1, efs.e(), $$2);
   }

   @Override
   public Stream<jj> a_(eol $$0, azs $$1, jj $$2) {
      jj.a $$3 = $$2.k();
      dio $$4 = $$0.d();
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
   public eoo<?> b() {
      return eoo.j;
   }
}
