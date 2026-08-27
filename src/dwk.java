import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwk extends dwt {
   private final ib c;
   private final dod d;
   private final dod e;
   private final int f;
   public static final Codec<dwk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ib.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dod.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dod.b.optionalFieldOf("allowed_search_condition", dod.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dwk::new)
   );

   private dwk(ib $$0, dod $$1, dod $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dwk a(ib $$0, dod $$1, dod $$2, int $$3) {
      return new dwk($$0, $$1, $$2, $$3);
   }

   public static dwk a(ib $$0, dod $$1, int $$2) {
      return a($$0, $$1, dod.e(), $$2);
   }

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      csz $$4 = $$0.d();
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
   public dwu<?> b() {
      return dwu.j;
   }
}
