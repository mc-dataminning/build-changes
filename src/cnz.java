import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cnz {
   private final List<cnz.b> a;
   private final cnz.b b;

   cnz(List<cnz.b> $$0, cnz.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cnz.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cnz.a a() {
      return new cnz.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cnz.b b(int $$0) {
      return this.a.get($$0);
   }

   public cnz.b b() {
      return this.b;
   }

   public List<cnz.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cnz.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cnz.b> a = new ArrayList<>();
      private cnz.b b = cnz.b.e;

      public cnz.a a(int $$0, int $$1, int $$2, Predicate<crs> $$3) {
         this.a.add(new cnz.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cnz.a a(int $$0, int $$1, int $$2) {
         this.b = new cnz.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cnz a() {
         return new cnz(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<crs> d) {
      static final cnz.b e = new cnz.b(0, 0, 0, $$0 -> true);
   }
}
