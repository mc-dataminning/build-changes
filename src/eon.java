import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class eon extends epf {
   public static final MapCodec<eon> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eph.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), bqx.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, eon::new)
   );
   private final epf b;
   private final bqx c;

   public eon(epf $$0, bqx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected eph<?> a() {
      return eph.o;
   }

   @Override
   public final List<epi.c> a(dez $$0, jf $$1, jf $$2, List<epi.c> $$3, List<epi.c> $$4, epe $$5) {
      if (this.c.b() != 0 && !$$4.isEmpty()) {
         if ($$3.size() != $$4.size()) {
            ad.b(
               "Original block info list not in sync with processed list, skipping processing. Original size: "
                  + $$3.size()
                  + ", Processed size: "
                  + $$4.size()
            );
            return $$4;
         } else {
            azn $$6 = azn.a($$0.E().C()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = ad.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  epi.c $$12 = $$3.get($$11);
                  epi.c $$13 = $$4.get($$11);
                  epi.c $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
