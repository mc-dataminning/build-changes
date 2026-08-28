import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejl extends ejv {
   private final jj c;
   private final ebd d;
   private final ebd e;
   private final int f;
   public static final MapCodec<ejl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jj.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               ebd.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               ebd.b.optionalFieldOf("allowed_search_condition", ebd.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ejl::new)
   );

   private ejl(jj $$0, ebd $$1, ebd $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ejl a(jj $$0, ebd $$1, ebd $$2, int $$3) {
      return new ejl($$0, $$1, $$2, $$3);
   }

   public static ejl a(jj $$0, ebd $$1, int $$2) {
      return a($$0, $$1, ebd.e(), $$2);
   }

   @Override
   public Stream<je> a_(ejt $$0, azk $$1, je $$2) {
      je.a $$3 = $$2.k();
      dep $$4 = $$0.d();
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
   public ejw<?> b() {
      return ejw.j;
   }
}
