import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejz extends ekj {
   private final jj c;
   private final ebr d;
   private final ebr e;
   private final int f;
   public static final MapCodec<ejz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jj.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               ebr.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               ebr.b.optionalFieldOf("allowed_search_condition", ebr.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ejz::new)
   );

   private ejz(jj $$0, ebr $$1, ebr $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ejz a(jj $$0, ebr $$1, ebr $$2, int $$3) {
      return new ejz($$0, $$1, $$2, $$3);
   }

   public static ejz a(jj $$0, ebr $$1, int $$2) {
      return a($$0, $$1, ebr.e(), $$2);
   }

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      je.a $$3 = $$2.k();
      dfd $$4 = $$0.d();
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
   public ekk<?> b() {
      return ekk.j;
   }
}
