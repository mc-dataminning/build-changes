import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dck {
   public static final int a = -1;
   public static final dck b = new dck(List.of(), IntList.of());
   private final List<dch> c;
   private final IntList d;

   private dck(List<dch> $$0, IntList $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static dck a(dch $$0) {
      return $$0.b() ? b : new dck(List.of($$0), IntList.of(0));
   }

   public static dck a(List<Optional<dch>> $$0) {
      int $$1 = $$0.size();
      List<dch> $$2 = new ArrayList<>($$1);
      IntList $$3 = new IntArrayList($$1);
      int $$4 = 0;

      for (Optional<dch> $$5 : $$0) {
         if ($$5.isPresent()) {
            dch $$6 = $$5.get();
            if ($$6.b()) {
               return b;
            }

            $$2.add($$6);
            $$3.add($$4++);
         } else {
            $$3.add(-1);
         }
      }

      return new dck($$2, $$3);
   }

   public static dck b(List<dch> $$0) {
      int $$1 = $$0.size();
      IntList $$2 = new IntArrayList($$1);

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         dch $$4 = $$0.get($$3);
         if ($$4.b()) {
            return b;
         }

         $$2.add($$3);
      }

      return new dck($$0, $$2);
   }

   public IntList a() {
      return this.d;
   }

   public List<dch> b() {
      return this.c;
   }

   public boolean c() {
      return this.d.isEmpty();
   }
}
