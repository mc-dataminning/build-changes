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

public final class dqj {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dnk> e = kf.n
      .q()
      .comapFlatMap($$0 -> $$0 == dnk.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(dqj::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, dqj::new)
   );
   private static final Set<aix<cwq>> f = Set.of(cwx.aa, cwx.Z, cwx.ab);
   public static final cvt b = new cvt() {
      @Override
      public int K_() {
         return 64;
      }

      @Override
      public int J_() {
         return -64;
      }
   };
   private final dnk g;
   private final BitSet h;

   private dqj(dnk $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static dqj a(sw $$0) {
      dnk $$1 = dnk.a($$0.l("target_status"));
      return $$1 == dnk.c ? null : new dqj($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(doa $$0) {
      int $$1 = 4;
      hz.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(cyu.F)) {
            $$0.a($$1x, cyu.sJ.o(), false);
         }
      });
   }

   public void b(doa $$0) {
      cvt $$1 = $$0.z();
      int $$2 = $$1.J_();
      int $$3 = $$1.ak() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               hz.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, cyu.a.o(), false));
            }
         }
      }
   }

   public dnk a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static cwt a(cwt $$0, dnf $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<aix<cwq>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            ij<cwq> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
