import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public final class edc {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<ean> e = mb.l
      .q()
      .comapFlatMap($$0 -> $$0 == ean.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<edc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(edc::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, edc::new)
   );
   private static final Set<akt<dic>> f = Set.of(dij.ab, dij.aa, dij.ac);
   public static final dhb b = new dhb() {
      @Override
      public int H_() {
         return 64;
      }

      @Override
      public int G_() {
         return -64;
      }
   };
   private final ean g;
   private final BitSet h;

   private edc(ean $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static edc a(tq $$0) {
      ean $$1 = ean.a($$0.l("target_status"));
      return $$1 == ean.c ? null : new edc($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(eag $$0) {
      int $$1 = 4;
      ji.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dkg.I)) {
            $$0.a($$1x, dkg.tn.m());
         }
      });
   }

   public void b(eag $$0) {
      dhb $$1 = $$0.B();
      int $$2 = $$1.G_();
      int $$3 = $$1.ao();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               ji.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dkg.a.m()));
            }
         }
      }
   }

   public ean a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dif a(dif $$0, dzm $$1) {
      if (!$$1.A()) {
         return $$0;
      } else {
         Predicate<akt<dic>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jr<dic> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
