import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbb {
   public static final int a = -1;
   public static final dbb b = new dbb(List.of(), IntList.of());
   private final List<day> c;
   private final IntList d;

   private dbb(List<day> $$0, IntList $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static dbb a(day $$0) {
      return $$0.b() ? b : new dbb(List.of($$0), IntList.of(0));
   }

   public static dbb a(List<Optional<day>> $$0) {
      int $$1 = $$0.size();
      List<day> $$2 = new ArrayList<>($$1);
      IntList $$3 = new IntArrayList($$1);
      int $$4 = 0;

      for (Optional<day> $$5 : $$0) {
         if ($$5.isPresent()) {
            day $$6 = $$5.get();
            if ($$6.b()) {
               return b;
            }

            $$2.add($$6);
            $$3.add($$4++);
         } else {
            $$3.add(-1);
         }
      }

      return new dbb($$2, $$3);
   }

   public static dbb b(List<day> $$0) {
      int $$1 = $$0.size();
      IntList $$2 = new IntArrayList($$1);

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         day $$4 = $$0.get($$3);
         if ($$4.b()) {
            return b;
         }

         $$2.add($$3);
      }

      return new dbb($$0, $$2);
   }

   public IntList a() {
      return this.d;
   }

   public List<day> b() {
      return this.c;
   }

   public boolean c() {
      return this.d.isEmpty();
   }
}
