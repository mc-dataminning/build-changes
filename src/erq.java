import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class erq extends esi {
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esk.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), bsd.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, erq::new)
   );
   private final esi b;
   private final bsd c;

   public erq(esi $$0, bsd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected esk<?> a() {
      return esk.o;
   }

   @Override
   public final List<esl.d> a(dhq $$0, ji $$1, ji $$2, List<esl.d> $$3, List<esl.d> $$4, esh $$5) {
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
            azh $$6 = azh.a($$0.a().E()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = af.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  esl.d $$12 = $$3.get($$11);
                  esl.d $$13 = $$4.get($$11);
                  esl.d $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
