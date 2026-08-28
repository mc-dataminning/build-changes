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

public final class eat {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dyg> e = ly.l
      .q()
      .comapFlatMap($$0 -> $$0 == dyg.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(eat::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, eat::new)
   );
   private static final Set<alh<dgc>> f = Set.of(dgj.aa, dgj.Z, dgj.ab);
   public static final dfd b = new dfd() {
      @Override
      public int J_() {
         return 64;
      }

      @Override
      public int I_() {
         return -64;
      }
   };
   private final dyg g;
   private final BitSet h;

   private eat(dyg $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static eat a(uk $$0) {
      dyg $$1 = dyg.a($$0.l("target_status"));
      return $$1 == dyg.c ? null : new eat($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dxz $$0) {
      int $$1 = 4;
      jh.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dig.F)) {
            $$0.a($$1x, dig.sJ.m(), false);
         }
      });
   }

   public void b(dxz $$0) {
      dfd $$1 = $$0.y();
      int $$2 = $$1.I_();
      int $$3 = $$1.al();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               jh.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dig.a.m(), false));
            }
         }
      }
   }

   public dyg a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dgf a(dgf $$0, dxf $$1) {
      if (!$$1.x()) {
         return $$0;
      } else {
         Predicate<alh<dgc>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jq<dgc> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
