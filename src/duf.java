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

public final class duf {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dru> e = kr.n
      .q()
      .comapFlatMap($$0 -> $$0 == dru.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<duf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(duf::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, duf::new)
   );
   private static final Set<ajs<czw>> f = Set.of(dad.aa, dad.Z, dad.ab);
   public static final cyz b = new cyz() {
      @Override
      public int J_() {
         return 64;
      }

      @Override
      public int I_() {
         return -64;
      }
   };
   private final dru g;
   private final BitSet h;

   private duf(dru $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static duf a(tm $$0) {
      dru $$1 = dru.a($$0.l("target_status"));
      return $$1 == dru.c ? null : new duf($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(drp $$0) {
      int $$1 = 4;
      ib.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dca.F)) {
            $$0.a($$1x, dca.sJ.n(), false);
         }
      });
   }

   public void b(drp $$0) {
      cyz $$1 = $$0.z();
      int $$2 = $$1.I_();
      int $$3 = $$1.al() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               ib.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dca.a.n(), false));
            }
         }
      }
   }

   public dru a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static czz a(czz $$0, dqv $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<ajs<czw>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            il<czw> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
