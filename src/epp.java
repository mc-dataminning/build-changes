import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class epp extends eqh {
   public static final MapCodec<epp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqj.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), brp.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, epp::new)
   );
   private final eqh b;
   private final brp c;

   public epp(eqh $$0, brp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected eqj<?> a() {
      return eqj.o;
   }

   @Override
   public final List<eqk.c> a(dgd $$0, jh $$1, jh $$2, List<eqk.c> $$3, List<eqk.c> $$4, eqg $$5) {
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
            azu $$6 = azu.a($$0.a().D()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = ae.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  eqk.c $$12 = $$3.get($$11);
                  eqk.c $$13 = $$4.get($$11);
                  eqk.c $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
