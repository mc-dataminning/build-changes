import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eir extends eja {
   private final iw c;
   private final eab d;
   private final eab e;
   private final int f;
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iw.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eab.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eab.b.optionalFieldOf("allowed_search_condition", eab.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eir::new)
   );

   private eir(iw $$0, eab $$1, eab $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eir a(iw $$0, eab $$1, eab $$2, int $$3) {
      return new eir($$0, $$1, $$2, $$3);
   }

   public static eir a(iw $$0, eab $$1, int $$2) {
      return a($$0, $$1, eab.e(), $$2);
   }

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      ir.a $$3 = $$2.j();
      dcv $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for (int $$5 = 0; $$5 < this.f; $$5++) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.d(this.c);
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
   public ejb<?> b() {
      return ejb.j;
   }
}
