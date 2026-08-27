import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eaj extends eas {
   private final ie c;
   private final dsc d;
   private final dsc e;
   private final int f;
   public static final Codec<eaj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ie.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dsc.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dsc.b.optionalFieldOf("allowed_search_condition", dsc.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eaj::new)
   );

   private eaj(ie $$0, dsc $$1, dsc $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eaj a(ie $$0, dsc $$1, dsc $$2, int $$3) {
      return new eaj($$0, $$1, $$2, $$3);
   }

   public static eaj a(ie $$0, dsc $$1, int $$2) {
      return a($$0, $$1, dsc.e(), $$2);
   }

   @Override
   public Stream<hz> a_(eaq $$0, awp $$1, hz $$2) {
      hz.a $$3 = $$2.j();
      cwm $$4 = $$0.d();
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
   public eat<?> b() {
      return eat.j;
   }
}
