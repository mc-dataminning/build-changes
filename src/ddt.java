import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ddt {
   public static final int a = -1;
   public static final ddt b = new ddt(List.of(), IntList.of());
   private final List<ddq> c;
   private final IntList d;

   private ddt(List<ddq> $$0, IntList $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static ddt a(ddq $$0) {
      return $$0.b() ? b : new ddt(List.of($$0), IntList.of(0));
   }

   public static ddt a(List<Optional<ddq>> $$0) {
      int $$1 = $$0.size();
      List<ddq> $$2 = new ArrayList<>($$1);
      IntList $$3 = new IntArrayList($$1);
      int $$4 = 0;

      for (Optional<ddq> $$5 : $$0) {
         if ($$5.isPresent()) {
            ddq $$6 = $$5.get();
            if ($$6.b()) {
               return b;
            }

            $$2.add($$6);
            $$3.add($$4++);
         } else {
            $$3.add(-1);
         }
      }

      return new ddt($$2, $$3);
   }

   public static ddt b(List<ddq> $$0) {
      int $$1 = $$0.size();
      IntList $$2 = new IntArrayList($$1);

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         ddq $$4 = $$0.get($$3);
         if ($$4.b()) {
            return b;
         }

         $$2.add($$3);
      }

      return new ddt($$0, $$2);
   }

   public IntList a() {
      return this.d;
   }

   public List<ddq> b() {
      return this.c;
   }

   public boolean c() {
      return this.d.isEmpty();
   }
}
