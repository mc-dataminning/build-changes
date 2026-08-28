import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class eme extends emv {
   public static final MapCodec<eme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emx.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), bpm.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, eme::new)
   );
   private final emv b;
   private final bpm c;

   public eme(emv $$0, bpm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected emx<?> a() {
      return emx.o;
   }

   @Override
   public final List<emy.c> a(dcv $$0, ja $$1, ja $$2, List<emy.c> $$3, List<emy.c> $$4, emu $$5) {
      if (this.c.b() != 0 && !$$4.isEmpty()) {
         if ($$3.size() != $$4.size()) {
            ac.a(
               "Original block info list not in sync with processed list, skipping processing. Original size: "
                  + $$3.size()
                  + ", Processed size: "
                  + $$4.size()
            );
            return $$4;
         } else {
            ayo $$6 = ayo.a($$0.E().C()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = ac.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  emy.c $$12 = $$3.get($$11);
                  emy.c $$13 = $$4.get($$11);
                  emy.c $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
