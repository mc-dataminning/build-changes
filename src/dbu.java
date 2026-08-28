import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbu {
   public static final int a = -1;
   public static final dbu b = new dbu(List.of(), IntList.of());
   private final List<dbr> c;
   private final IntList d;

   private dbu(List<dbr> $$0, IntList $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static dbu a(dbr $$0) {
      return $$0.b() ? b : new dbu(List.of($$0), IntList.of(0));
   }

   public static dbu a(List<Optional<dbr>> $$0) {
      int $$1 = $$0.size();
      List<dbr> $$2 = new ArrayList<>($$1);
      IntList $$3 = new IntArrayList($$1);
      int $$4 = 0;

      for (Optional<dbr> $$5 : $$0) {
         if ($$5.isPresent()) {
            dbr $$6 = $$5.get();
            if ($$6.b()) {
               return b;
            }

            $$2.add($$6);
            $$3.add($$4++);
         } else {
            $$3.add(-1);
         }
      }

      return new dbu($$2, $$3);
   }

   public static dbu b(List<dbr> $$0) {
      int $$1 = $$0.size();
      IntList $$2 = new IntArrayList($$1);

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         dbr $$4 = $$0.get($$3);
         if ($$4.b()) {
            return b;
         }

         $$2.add($$3);
      }

      return new dbu($$0, $$2);
   }

   public IntList a() {
      return this.d;
   }

   public List<dbr> b() {
      return this.c;
   }

   public boolean c() {
      return this.d.isEmpty();
   }
}
