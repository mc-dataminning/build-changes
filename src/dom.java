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

public final class dom {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dlq> e = kd.n
      .q()
      .comapFlatMap($$0 -> $$0 == dlq.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<dom> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(dom::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, dom::new)
   );
   private static final Set<ahg<cuw>> f = Set.of(cvd.aa, cvd.Z, cvd.ab);
   public static final ctz b = new ctz() {
      @Override
      public int K_() {
         return 64;
      }

      @Override
      public int J_() {
         return -64;
      }
   };
   private final dlq g;
   private final BitSet h;

   private dom(dlq $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static dom a(so $$0) {
      dlq $$1 = dlq.a($$0.l("target_status"));
      return $$1 == dlq.c ? null : new dom($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dmg $$0) {
      int $$1 = 4;
      hx.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(cxa.F)) {
            $$0.a($$1x, cxa.sJ.o(), false);
         }
      });
   }

   public void b(dmg $$0) {
      ctz $$1 = $$0.z();
      int $$2 = $$1.J_();
      int $$3 = $$1.al() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               hx.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, cxa.a.o(), false));
            }
         }
      }
   }

   public dlq a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static cuz a(cuz $$0, dll $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<ahg<cuw>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            ih<cuw> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
