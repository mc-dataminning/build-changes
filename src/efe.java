import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efe extends efn {
   private final ir c;
   private final dwx d;
   private final dwx e;
   private final int f;
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ir.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dwx.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dwx.b.optionalFieldOf("allowed_search_condition", dwx.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efe::new)
   );

   private efe(ir $$0, dwx $$1, dwx $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static efe a(ir $$0, dwx $$1, dwx $$2, int $$3) {
      return new efe($$0, $$1, $$2, $$3);
   }

   public static efe a(ir $$0, dwx $$1, int $$2) {
      return a($$0, $$1, dwx.e(), $$2);
   }

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      im.a $$3 = $$2.j();
      dap $$4 = $$0.d();
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
   public efo<?> b() {
      return efo.j;
   }
}
