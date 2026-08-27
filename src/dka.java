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

public final class dka {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dhe> e = jb.o
      .q()
      .comapFlatMap($$0 -> $$0 == dhe.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<dka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(dka::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, dka::new)
   );
   private static final Set<aey<cqz>> f = Set.of(crg.aa, crg.Z, crg.ab);
   public static final cqd b = new cqd() {
      @Override
      public int I_() {
         return 64;
      }

      @Override
      public int H_() {
         return -64;
      }
   };
   private final dhe g;
   private final BitSet h;

   private dka(dhe $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static dka a(qw $$0) {
      dhe $$1 = dhe.a($$0.l("target_status"));
      return $$1 == dhe.c ? null : new dka($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dhu $$0) {
      int $$1 = 4;
      gw.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(cte.F)) {
            $$0.a($$1x, cte.rI.o(), false);
         }
      });
   }

   public void b(dhu $$0) {
      cqd $$1 = $$0.z();
      int $$2 = $$1.H_();
      int $$3 = $$1.aj() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               gw.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, cte.a.o(), false));
            }
         }
      }
   }

   public dhe a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static crc a(crc $$0, dgz $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<aey<cqz>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            he<cqz> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
