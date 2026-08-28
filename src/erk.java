import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class erk extends esc {
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ese.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), bsf.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, erk::new)
   );
   private final esc b;
   private final bsf c;

   public erk(esc $$0, bsf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected ese<?> a() {
      return ese.o;
   }

   @Override
   public final List<esf.d> a(dhq $$0, jh $$1, jh $$2, List<esf.d> $$3, List<esf.d> $$4, esb $$5) {
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
            bac $$6 = bac.a($$0.a().E()).e().a($$1);
            int $$7 = Math.min(this.c.a($$6), $$4.size());
            if ($$7 < 1) {
               return $$4;
            } else {
               IntArrayList $$8 = ae.a(IntStream.range(0, $$4.size()), $$6);
               IntIterator $$9 = $$8.intIterator();
               int $$10 = 0;

               while ($$9.hasNext() && $$10 < $$7) {
                  int $$11 = $$9.nextInt();
                  esf.d $$12 = $$3.get($$11);
                  esf.d $$13 = $$4.get($$11);
                  esf.d $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
