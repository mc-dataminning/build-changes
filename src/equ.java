import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class equ extends erm {
   public static final MapCodec<equ> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ero.a.fieldOf("delegate").forGetter($$0x -> $$0x.b), brq.e.fieldOf("limit").forGetter($$0x -> $$0x.c)).apply($$0, equ::new)
   );
   private final erm b;
   private final brq c;

   public equ(erm $$0, brq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected ero<?> a() {
      return ero.o;
   }

   @Override
   public final List<erp.d> a(dha $$0, ji $$1, ji $$2, List<erp.d> $$3, List<erp.d> $$4, erl $$5) {
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
                  erp.d $$12 = $$3.get($$11);
                  erp.d $$13 = $$4.get($$11);
                  erp.d $$14 = this.b.a($$0, $$1, $$2, $$12, $$13, $$5);
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
