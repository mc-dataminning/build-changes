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

public final class djw {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dha> e = jb.o
      .q()
      .comapFlatMap($$0 -> $$0 == dha.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<djw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(djw::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, djw::new)
   );
   private static final Set<aeq<cqj>> f = Set.of(cqq.aa, cqq.Z, cqq.ab);
   public static final cpn b = new cpn() {
      @Override
      public int D_() {
         return 64;
      }

      @Override
      public int C_() {
         return -64;
      }
   };
   private final dha g;
   private final BitSet h;

   private djw(dha $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static djw a(qr $$0) {
      dha $$1 = dha.a($$0.l("target_status"));
      return $$1 == dha.c ? null : new djw($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dhq $$0) {
      int $$1 = 4;
      gu.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(csm.F)) {
            $$0.a($$1x, csm.rI.n(), false);
         }
      });
   }

   public void b(dhq $$0) {
      cpn $$1 = $$0.z();
      int $$2 = $$1.C_();
      int $$3 = $$1.aj() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               gu.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, csm.a.n(), false));
            }
         }
      }
   }

   public dha a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static cqm a(cqm $$0, dgv $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<aeq<cqj>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            he<cqj> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
