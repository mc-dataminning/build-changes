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

public final class ecf {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dzs> e = mb.l
      .q()
      .comapFlatMap($$0 -> $$0 == dzs.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(ecf::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, ecf::new)
   );
   private static final Set<aku<dhj>> f = Set.of(dhq.ab, dhq.aa, dhq.ac);
   public static final dgj b = new dgj() {
      @Override
      public int M_() {
         return 64;
      }

      @Override
      public int L_() {
         return -64;
      }
   };
   private final dzs g;
   private final BitSet h;

   private ecf(dzs $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static ecf a(tq $$0) {
      dzs $$1 = dzs.a($$0.l("target_status"));
      return $$1 == dzs.c ? null : new ecf($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dzl $$0) {
      int $$1 = 4;
      ji.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(djn.I)) {
            $$0.a($$1x, djn.tl.m(), false);
         }
      });
   }

   public void b(dzl $$0) {
      dgj $$1 = $$0.B();
      int $$2 = $$1.L_();
      int $$3 = $$1.an();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               ji.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, djn.a.m(), false));
            }
         }
      }
   }

   public dzs a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dhm a(dhm $$0, dyr $$1) {
      if (!$$1.A()) {
         return $$0;
      } else {
         Predicate<aku<dhj>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jr<dhj> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
