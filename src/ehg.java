import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehg extends ehp {
   private final je c;
   private final dyz d;
   private final dyz e;
   private final int f;
   public static final MapCodec<ehg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               je.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dyz.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dyz.b.optionalFieldOf("allowed_search_condition", dyz.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehg::new)
   );

   private ehg(je $$0, dyz $$1, dyz $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ehg a(je $$0, dyz $$1, dyz $$2, int $$3) {
      return new ehg($$0, $$1, $$2, $$3);
   }

   public static ehg a(je $$0, dyz $$1, int $$2) {
      return a($$0, $$1, dyz.e(), $$2);
   }

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dcr $$4 = $$0.d();
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
   public ehq<?> b() {
      return ehq.j;
   }
}
