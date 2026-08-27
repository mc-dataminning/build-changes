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

public final class djx {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dhb> e = jb.o
      .q()
      .comapFlatMap($$0 -> $$0 == dhb.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<djx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(djx::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, djx::new)
   );
   private static final Set<aeq<cqk>> f = Set.of(cqr.aa, cqr.Z, cqr.ab);
   public static final cpo b = new cpo() {
      @Override
      public int D_() {
         return 64;
      }

      @Override
      public int C_() {
         return -64;
      }
   };
   private final dhb g;
   private final BitSet h;

   private djx(dhb $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static djx a(qr $$0) {
      dhb $$1 = dhb.a($$0.l("target_status"));
      return $$1 == dhb.c ? null : new djx($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dhr $$0) {
      int $$1 = 4;
      gu.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(csn.F)) {
            $$0.a($$1x, csn.rI.n(), false);
         }
      });
   }

   public void b(dhr $$0) {
      cpo $$1 = $$0.z();
      int $$2 = $$1.C_();
      int $$3 = $$1.aj() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               gu.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, csn.a.n(), false));
            }
         }
      }
   }

   public dhb a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static cqn a(cqn $$0, dgw $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<aeq<cqk>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            he<cqk> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
