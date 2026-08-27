import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egj extends egs {
   private final it c;
   private final dyc d;
   private final dyc e;
   private final int f;
   public static final MapCodec<egj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               it.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dyc.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dyc.b.optionalFieldOf("allowed_search_condition", dyc.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egj::new)
   );

   private egj(it $$0, dyc $$1, dyc $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static egj a(it $$0, dyc $$1, dyc $$2, int $$3) {
      return new egj($$0, $$1, $$2, $$3);
   }

   public static egj a(it $$0, dyc $$1, int $$2) {
      return a($$0, $$1, dyc.e(), $$2);
   }

   @Override
   public Stream<io> a_(egq $$0, aym $$1, io $$2) {
      io.a $$3 = $$2.j();
      dbu $$4 = $$0.d();
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
   public egt<?> b() {
      return egt.j;
   }
}
