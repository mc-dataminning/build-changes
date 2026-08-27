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

public final class dky {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dic> e = jy.o
      .q()
      .comapFlatMap($$0 -> $$0 == dic.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<dky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(dky::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, dky::new)
   );
   private static final Set<afv<crx>> f = Set.of(cse.aa, cse.Z, cse.ab);
   public static final crb b = new crb() {
      @Override
      public int J_() {
         return 64;
      }

      @Override
      public int I_() {
         return -64;
      }
   };
   private final dic g;
   private final BitSet h;

   private dky(dic $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static dky a(rt $$0) {
      dic $$1 = dic.a($$0.l("target_status"));
      return $$1 == dic.c ? null : new dky($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dis $$0) {
      int $$1 = 4;
      ht.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(cuc.F)) {
            $$0.a($$1x, cuc.rI.o(), false);
         }
      });
   }

   public void b(dis $$0) {
      crb $$1 = $$0.z();
      int $$2 = $$1.I_();
      int $$3 = $$1.aj() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               ht.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, cuc.a.o(), false));
            }
         }
      }
   }

   public dic a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static csa a(csa $$0, dhx $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<afv<crx>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            ib<crx> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
