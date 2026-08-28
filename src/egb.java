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

public final class egb {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<edm> e = mg.l
      .q()
      .comapFlatMap($$0 -> $$0 == edm.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<egb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(egb::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, egb::new)
   );
   private static final Set<alf<dkk>> f = Set.of(dkr.ab, dkr.aa, dkr.ac);
   public static final djj b = new djj() {
      @Override
      public int H_() {
         return 64;
      }

      @Override
      public int G_() {
         return -64;
      }
   };
   private final edm g;
   private final BitSet h;

   private egb(edm $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static egb a(tz $$0) {
      edm $$1 = edm.a($$0.j("target_status"));
      return $$1 == edm.c ? null : new egb($$1, Optional.of(BitSet.valueOf($$0.m("missing_bedrock"))));
   }

   public static void a(edf $$0) {
      int $$1 = 4;
      iv.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dmo.I)) {
            $$0.a($$1x, dmo.tt.m());
         }
      });
   }

   public void b(edf $$0) {
      djj $$1 = $$0.B();
      int $$2 = $$1.G_();
      int $$3 = $$1.ao();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               iv.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dmo.a.m()));
            }
         }
      }
   }

   public edm a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dkn a(dkn $$0, ecl $$1) {
      if (!$$1.A()) {
         return $$0;
      } else {
         Predicate<alf<dkk>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jf<dkk> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
