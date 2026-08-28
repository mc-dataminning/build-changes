import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class elq extends emh {
   public static final MapCodec<elq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emj.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), bpz.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, elq::new)
   );
   private final emh b;
   private final bpz c;

   public elq(emh $$0, bpz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected emj<?> a() {
      return emj.o;
   }

   @Override
   public final List<emk.c> a(dcn $$0, iz $$1, iz $$2, List<emk.c> $$3, List<emk.c> $$4, emg $$5) {
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
            azh $$6 = azh.a($$0.E().C()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = ac.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  emk.c $$12 = $$3.get($$11);
                  emk.c $$13 = $$4.get($$11);
                  emk.c $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
