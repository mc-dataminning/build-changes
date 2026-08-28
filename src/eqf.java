import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqf extends eqp {
   private final jb c;
   private final ehu d;
   private final ehu e;
   private final int f;
   public static final MapCodec<eqf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jb.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               ehu.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               ehu.b.optionalFieldOf("allowed_search_condition", ehu.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eqf::new)
   );

   private eqf(jb $$0, ehu $$1, ehu $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eqf a(jb $$0, ehu $$1, ehu $$2, int $$3) {
      return new eqf($$0, $$1, $$2, $$3);
   }

   public static eqf a(jb $$0, ehu $$1, int $$2) {
      return a($$0, $$1, ehu.e(), $$2);
   }

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      iv.a $$3 = $$2.k();
      dkg $$4 = $$0.d();
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
   public eqq<?> b() {
      return eqq.j;
   }
}
