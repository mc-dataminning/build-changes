import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dua extends duj {
   private final ha c;
   private final dlt d;
   private final dlt e;
   private final int f;
   public static final Codec<dua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ha.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dlt.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dlt.b.optionalFieldOf("allowed_search_condition", dlt.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dua::new)
   );

   private dua(ha $$0, dlt $$1, dlt $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dua a(ha $$0, dlt $$1, dlt $$2, int $$3) {
      return new dua($$0, $$1, $$2, $$3);
   }

   public static dua a(ha $$0, dlt $$1, int $$2) {
      return a($$0, $$1, dlt.e(), $$2);
   }

   @Override
   public Stream<gw> a_(duh $$0, ash $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      cqv $$4 = $$0.d();
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
   public duk<?> b() {
      return duk.j;
   }
}
