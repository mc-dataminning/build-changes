import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class etp extends euh {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euj.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), btd.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, etp::new)
   );
   private final euh b;
   private final btd c;

   public etp(euh $$0, btd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected euj<?> a() {
      return euj.o;
   }

   @Override
   public final List<euk.d> a(djg $$0, iu $$1, iu $$2, List<euk.d> $$3, List<euk.d> $$4, eug $$5) {
      if (this.c.b() != 0 && !$$4.isEmpty()) {
         if ($$3.size() != $$4.size()) {
            af.b(
               "Original block info list not in sync with processed list, skipping processing. Original size: "
                  + $$3.size()
                  + ", Processed size: "
                  + $$4.size()
            );
            return $$4;
         } else {
            azt $$6 = azt.a($$0.a().E()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = af.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  euk.d $$12 = $$3.get($$11);
                  euk.d $$13 = $$4.get($$11);
                  euk.d $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
