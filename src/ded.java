import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ded {
   public static final int a = -1;
   public static final ded b = new ded(List.of(), IntList.of());
   private final List<dea> c;
   private final IntList d;

   private ded(List<dea> $$0, IntList $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static ded a(dea $$0) {
      return $$0.b() ? b : new ded(List.of($$0), IntList.of(0));
   }

   public static ded a(List<Optional<dea>> $$0) {
      int $$1 = $$0.size();
      List<dea> $$2 = new ArrayList<>($$1);
      IntList $$3 = new IntArrayList($$1);
      int $$4 = 0;

      for (Optional<dea> $$5 : $$0) {
         if ($$5.isPresent()) {
            dea $$6 = $$5.get();
            if ($$6.b()) {
               return b;
            }

            $$2.add($$6);
            $$3.add($$4++);
         } else {
            $$3.add(-1);
         }
      }

      return new ded($$2, $$3);
   }

   public static ded b(List<dea> $$0) {
      int $$1 = $$0.size();
      IntList $$2 = new IntArrayList($$1);

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         dea $$4 = $$0.get($$3);
         if ($$4.b()) {
            return b;
         }

         $$2.add($$3);
      }

      return new ded($$0, $$2);
   }

   public IntList a() {
      return this.d;
   }

   public List<dea> b() {
      return this.c;
   }

   public boolean c() {
      return this.d.isEmpty();
   }
}
