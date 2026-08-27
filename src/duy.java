import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duy extends dvh {
   private final hx c;
   private final dmr d;
   private final dmr e;
   private final int f;
   public static final Codec<duy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hx.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dmr.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dmr.b.optionalFieldOf("allowed_search_condition", dmr.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, duy::new)
   );

   private duy(hx $$0, dmr $$1, dmr $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static duy a(hx $$0, dmr $$1, dmr $$2, int $$3) {
      return new duy($$0, $$1, $$2, $$3);
   }

   public static duy a(hx $$0, dmr $$1, int $$2) {
      return a($$0, $$1, dmr.e(), $$2);
   }

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      ht.a $$3 = $$2.j();
      crt $$4 = $$0.d();
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
   public dvi<?> b() {
      return dvi.j;
   }
}
