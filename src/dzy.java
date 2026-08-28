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

public final class dzy {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dxl> e = lu.l
      .q()
      .comapFlatMap($$0 -> $$0 == dxl.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<dzy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(dzy::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, dzy::new)
   );
   private static final Set<alb<dfh>> f = Set.of(dfo.aa, dfo.Z, dfo.ab);
   public static final dei b = new dei() {
      @Override
      public int H_() {
         return 64;
      }

      @Override
      public int G_() {
         return -64;
      }
   };
   private final dxl g;
   private final BitSet h;

   private dzy(dxl $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static dzy a(uf $$0) {
      dxl $$1 = dxl.a($$0.l("target_status"));
      return $$1 == dxl.c ? null : new dzy($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dxe $$0) {
      int $$1 = 4;
      je.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dhl.F)) {
            $$0.a($$1x, dhl.sJ.o(), false);
         }
      });
   }

   public void b(dxe $$0) {
      dei $$1 = $$0.y();
      int $$2 = $$1.G_();
      int $$3 = $$1.an();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               je.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dhl.a.o(), false));
            }
         }
      }
   }

   public dxl a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dfk a(dfk $$0, dwk $$1) {
      if (!$$1.x()) {
         return $$0;
      } else {
         Predicate<alb<dfh>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jn<dfh> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
