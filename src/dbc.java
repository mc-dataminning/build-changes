import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbc {
   public static final int a = -1;
   public static final dbc b = new dbc(List.of(), IntList.of());
   private final List<daz> c;
   private final IntList d;

   private dbc(List<daz> $$0, IntList $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static dbc a(daz $$0) {
      return $$0.b() ? b : new dbc(List.of($$0), IntList.of(0));
   }

   public static dbc a(List<Optional<daz>> $$0) {
      int $$1 = $$0.size();
      List<daz> $$2 = new ArrayList<>($$1);
      IntList $$3 = new IntArrayList($$1);
      int $$4 = 0;

      for (Optional<daz> $$5 : $$0) {
         if ($$5.isPresent()) {
            daz $$6 = $$5.get();
            if ($$6.b()) {
               return b;
            }

            $$2.add($$6);
            $$3.add($$4++);
         } else {
            $$3.add(-1);
         }
      }

      return new dbc($$2, $$3);
   }

   public static dbc b(List<daz> $$0) {
      int $$1 = $$0.size();
      IntList $$2 = new IntArrayList($$1);

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         daz $$4 = $$0.get($$3);
         if ($$4.b()) {
            return b;
         }

         $$2.add($$3);
      }

      return new dbc($$0, $$2);
   }

   public IntList a() {
      return this.d;
   }

   public List<daz> b() {
      return this.c;
   }

   public boolean c() {
      return this.d.isEmpty();
   }
}
