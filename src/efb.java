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

public final class efb {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<ecm> e = mf.l
      .q()
      .comapFlatMap($$0 -> $$0 == ecm.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(efb::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, efb::new)
   );
   private static final Set<ald<djs>> f = Set.of(djz.ab, djz.aa, djz.ac);
   public static final dir b = new dir() {
      @Override
      public int H_() {
         return 64;
      }

      @Override
      public int G_() {
         return -64;
      }
   };
   private final ecm g;
   private final BitSet h;

   private efb(ecm $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static efb a(tx $$0) {
      ecm $$1 = ecm.a($$0.l("target_status"));
      return $$1 == ecm.c ? null : new efb($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(ecf $$0) {
      int $$1 = 4;
      iu.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dlw.I)) {
            $$0.a($$1x, dlw.tp.m());
         }
      });
   }

   public void b(ecf $$0) {
      dir $$1 = $$0.B();
      int $$2 = $$1.G_();
      int $$3 = $$1.ao();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               iu.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dlw.a.m()));
            }
         }
      }
   }

   public ecm a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static djv a(djv $$0, ebl $$1) {
      if (!$$1.A()) {
         return $$0;
      } else {
         Predicate<ald<djs>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            je<djs> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
