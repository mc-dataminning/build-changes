import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ccg {
   private final List<ccg.b> a;
   private final ccg.b b;

   ccg(List<ccg.b> $$0, ccg.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(ccg.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static ccg.a a() {
      return new ccg.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public ccg.b b(int $$0) {
      return this.a.get($$0);
   }

   public ccg.b b() {
      return this.b;
   }

   public List<ccg.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(ccg.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<ccg.b> a = new ArrayList<>();
      private ccg.b b = ccg.b.e;

      public ccg.a a(int $$0, int $$1, int $$2, Predicate<cfz> $$3) {
         this.a.add(new ccg.b($$0, $$1, $$2, $$3));
         return this;
      }

      public ccg.a a(int $$0, int $$1, int $$2) {
         this.b = new ccg.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public ccg a() {
         return new ccg(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cfz> d) {
      static final ccg.b e = new ccg.b(0, 0, 0, $$0 -> true);
   }
}
