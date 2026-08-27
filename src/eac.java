import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eac extends eal {
   private final ie c;
   private final drv d;
   private final drv e;
   private final int f;
   public static final Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ie.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               drv.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               drv.b.optionalFieldOf("allowed_search_condition", drv.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eac::new)
   );

   private eac(ie $$0, drv $$1, drv $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eac a(ie $$0, drv $$1, drv $$2, int $$3) {
      return new eac($$0, $$1, $$2, $$3);
   }

   public static eac a(ie $$0, drv $$1, int $$2) {
      return a($$0, $$1, drv.e(), $$2);
   }

   @Override
   public Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      hz.a $$3 = $$2.j();
      cwi $$4 = $$0.d();
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
   public eam<?> b() {
      return eam.j;
   }
}
