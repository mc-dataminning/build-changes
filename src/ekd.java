import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekd extends ekn {
   private final jk c;
   private final ebv d;
   private final ebv e;
   private final int f;
   public static final MapCodec<ekd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jk.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               ebv.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               ebv.b.optionalFieldOf("allowed_search_condition", ebv.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ekd::new)
   );

   private ekd(jk $$0, ebv $$1, ebv $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ekd a(jk $$0, ebv $$1, ebv $$2, int $$3) {
      return new ekd($$0, $$1, $$2, $$3);
   }

   public static ekd a(jk $$0, ebv $$1, int $$2) {
      return a($$0, $$1, ebv.e(), $$2);
   }

   @Override
   public Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      jf.a $$3 = $$2.k();
      dfg $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for (int $$5 = 0; $$5 < this.f; $$5++) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.c(this.c);
            if ($$4.e($$3.v())) {
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
   public eko<?> b() {
      return eko.j;
   }
}
