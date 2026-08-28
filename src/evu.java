import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class evu extends ewm {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ewo.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), buh.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, evu::new)
   );
   private final ewm b;
   private final buh c;

   public evu(ewm $$0, buh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected ewo<?> a() {
      return ewo.o;
   }

   @Override
   public final List<ewp.d> a(dla $$0, iw $$1, iw $$2, List<ewp.d> $$3, List<ewp.d> $$4, ewl $$5) {
      if (this.c.b() != 0 && !$$4.isEmpty()) {
         if ($$3.size() != $$4.size()) {
            ag.b(
               "Original block info list not in sync with processed list, skipping processing. Original size: "
                  + $$3.size()
                  + ", Processed size: "
                  + $$4.size()
            );
            return $$4;
         } else {
            bai $$6 = bai.a($$0.a().E()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = ag.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  ewp.d $$12 = $$3.get($$11);
                  ewp.d $$13 = $$4.get($$11);
                  ewp.d $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
