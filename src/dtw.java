import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtw extends duf {
   private final ha c;
   private final dlp d;
   private final dlp e;
   private final int f;
   public static final Codec<dtw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ha.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dlp.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dlp.b.optionalFieldOf("allowed_search_condition", dlp.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dtw::new)
   );

   private dtw(ha $$0, dlp $$1, dlp $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dtw a(ha $$0, dlp $$1, dlp $$2, int $$3) {
      return new dtw($$0, $$1, $$2, $$3);
   }

   public static dtw a(ha $$0, dlp $$1, int $$2) {
      return a($$0, $$1, dlp.e(), $$2);
   }

   @Override
   public Stream<gu> a_(dud $$0, aru $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      cqf $$4 = $$0.d();
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
   public dug<?> b() {
      return dug.j;
   }
}
