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

public final class efm {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<ecx> e = mf.l
      .q()
      .comapFlatMap($$0 -> $$0 == ecx.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(efm::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, efm::new)
   );
   private static final Set<alf<djy>> f = Set.of(dkf.ab, dkf.aa, dkf.ac);
   public static final dix b = new dix() {
      @Override
      public int H_() {
         return 64;
      }

      @Override
      public int G_() {
         return -64;
      }
   };
   private final ecx g;
   private final BitSet h;

   private efm(ecx $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static efm a(tz $$0) {
      ecx $$1 = ecx.a($$0.l("target_status"));
      return $$1 == ecx.c ? null : new efm($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(ecq $$0) {
      int $$1 = 4;
      iu.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dmc.I)) {
            $$0.a($$1x, dmc.tq.m());
         }
      });
   }

   public void b(ecq $$0) {
      dix $$1 = $$0.B();
      int $$2 = $$1.G_();
      int $$3 = $$1.ao();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               iu.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dmc.a.m()));
            }
         }
      }
   }

   public ecx a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dkb a(dkb $$0, ebw $$1) {
      if (!$$1.A()) {
         return $$0;
      } else {
         Predicate<alf<djy>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            je<djy> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
