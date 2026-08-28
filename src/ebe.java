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

public final class ebe {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dyr> e = lz.l
      .q()
      .comapFlatMap($$0 -> $$0 == dyr.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(ebe::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, ebe::new)
   );
   private static final Set<ali<dgo>> f = Set.of(dgv.aa, dgv.Z, dgv.ab);
   public static final dfo b = new dfo() {
      @Override
      public int L_() {
         return 64;
      }

      @Override
      public int K_() {
         return -64;
      }
   };
   private final dyr g;
   private final BitSet h;

   private ebe(dyr $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static ebe a(ul $$0) {
      dyr $$1 = dyr.a($$0.l("target_status"));
      return $$1 == dyr.c ? null : new ebe($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dyk $$0) {
      int $$1 = 4;
      jh.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dis.F)) {
            $$0.a($$1x, dis.sJ.m(), false);
         }
      });
   }

   public void b(dyk $$0) {
      dfo $$1 = $$0.y();
      int $$2 = $$1.K_();
      int $$3 = $$1.al();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               jh.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dis.a.m(), false));
            }
         }
      }
   }

   public dyr a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dgr a(dgr $$0, dxq $$1) {
      if (!$$1.x()) {
         return $$0;
      } else {
         Predicate<ali<dgo>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jq<dgo> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
