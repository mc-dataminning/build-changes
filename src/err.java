import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class err extends esj {
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esl.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), bso.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, err::new)
   );
   private final esj b;
   private final bso c;

   public err(esj $$0, bso $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected esl<?> a() {
      return esl.o;
   }

   @Override
   public final List<esm.d> a(dhz $$0, jh $$1, jh $$2, List<esm.d> $$3, List<esm.d> $$4, esi $$5) {
      if (this.c.b() != 0 && !$$4.isEmpty()) {
         if ($$3.size() != $$4.size()) {
            ae.b(
               "Original block info list not in sync with processed list, skipping processing. Original size: "
                  + $$3.size()
                  + ", Processed size: "
                  + $$4.size()
            );
            return $$4;
         } else {
            bam $$6 = bam.a($$0.a().D()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = ae.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  esm.d $$12 = $$3.get($$11);
                  esm.d $$13 = $$4.get($$11);
                  esm.d $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
                  if ($$14 != null && !$$13.equals($$14)) {
                     $$10++;
                     $$4.set($$11, $$14);
                  }
               }

               return $$4;
            }
         }
      } else {
         return $$4;
      }
   }
}
