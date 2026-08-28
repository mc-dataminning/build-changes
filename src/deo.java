import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class deo {
   public static final int a = -1;
   public static final deo b = new deo(List.of(), IntList.of());
   private final List<del> c;
   private final IntList d;

   private deo(List<del> $$0, IntList $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static deo a(del $$0) {
      return $$0.b() ? b : new deo(List.of($$0), IntList.of(0));
   }

   public static deo a(List<Optional<del>> $$0) {
      int $$1 = $$0.size();
      List<del> $$2 = new ArrayList<>($$1);
      IntList $$3 = new IntArrayList($$1);
      int $$4 = 0;

      for (Optional<del> $$5 : $$0) {
         if ($$5.isPresent()) {
            del $$6 = $$5.get();
            if ($$6.b()) {
               return b;
            }

            $$2.add($$6);
            $$3.add($$4++);
         } else {
            $$3.add(-1);
         }
      }

      return new deo($$2, $$3);
   }

   public static deo b(List<del> $$0) {
      int $$1 = $$0.size();
      IntList $$2 = new IntArrayList($$1);

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         del $$4 = $$0.get($$3);
         if ($$4.b()) {
            return b;
         }

         $$2.add($$3);
      }

      return new deo($$0, $$2);
   }

   public IntList a() {
      return this.d;
   }

   public List<del> b() {
      return this.c;
   }

   public boolean c() {
      return this.d.isEmpty();
   }
}
