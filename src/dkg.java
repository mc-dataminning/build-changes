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

public final class dkg {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dhk> e = jd.o
      .q()
      .comapFlatMap($$0 -> $$0 == dhk.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<dkg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(dkg::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, dkg::new)
   );
   private static final Set<aew<cqt>> f = Set.of(cra.aa, cra.Z, cra.ab);
   public static final cpx b = new cpx() {
      @Override
      public int I_() {
         return 64;
      }

      @Override
      public int H_() {
         return -64;
      }
   };
   private final dhk g;
   private final BitSet h;

   private dkg(dhk $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static dkg a(qy $$0) {
      dhk $$1 = dhk.a($$0.l("target_status"));
      return $$1 == dhk.c ? null : new dkg($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dia $$0) {
      int $$1 = 4;
      gw.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(csw.F)) {
            $$0.a($$1x, csw.rI.n(), false);
         }
      });
   }

   public void b(dia $$0) {
      cpx $$1 = $$0.z();
      int $$2 = $$1.H_();
      int $$3 = $$1.aj() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               gw.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, csw.a.n(), false));
            }
         }
      }
   }

   public dhk a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static cqw a(cqw $$0, dhf $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<aew<cqt>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            hg<cqt> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
