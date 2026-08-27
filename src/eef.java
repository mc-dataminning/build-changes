import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eef extends eeo {
   private final ih c;
   private final dvy d;
   private final dvy e;
   private final int f;
   public static final Codec<eef> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ih.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dvy.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dvy.b.optionalFieldOf("allowed_search_condition", dvy.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eef::new)
   );

   private eef(ih $$0, dvy $$1, dvy $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eef a(ih $$0, dvy $$1, dvy $$2, int $$3) {
      return new eef($$0, $$1, $$2, $$3);
   }

   public static eef a(ih $$0, dvy $$1, int $$2) {
      return a($$0, $$1, dvy.e(), $$2);
   }

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      czs $$4 = $$0.d();
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
   public eep<?> b() {
      return eep.j;
   }
}
