import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eko extends eky {
   private final jl c;
   private final ecg d;
   private final ecg e;
   private final int f;
   public static final MapCodec<eko> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jl.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               ecg.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               ecg.b.optionalFieldOf("allowed_search_condition", ecg.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eko::new)
   );

   private eko(jl $$0, ecg $$1, ecg $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eko a(jl $$0, ecg $$1, ecg $$2, int $$3) {
      return new eko($$0, $$1, $$2, $$3);
   }

   public static eko a(jl $$0, ecg $$1, int $$2) {
      return a($$0, $$1, ecg.e(), $$2);
   }

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      jg.a $$3 = $$2.k();
      dfs $$4 = $$0.d();
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
   public ekz<?> b() {
      return ekz.j;
   }
}
