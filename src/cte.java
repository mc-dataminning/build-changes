import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cte {
   private final List<cte.b> a;
   private final cte.b b;

   cte(List<cte.b> $$0, cte.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cte.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cte.a a() {
      return new cte.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cte.b b(int $$0) {
      return this.a.get($$0);
   }

   public cte.b b() {
      return this.b;
   }

   public List<cte.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cte.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cte.b> a = new ArrayList<>();
      private cte.b b = cte.b.e;

      public cte.a a(int $$0, int $$1, int $$2, Predicate<cwm> $$3) {
         this.a.add(new cte.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cte.a a(int $$0, int $$1, int $$2) {
         this.b = new cte.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cte a() {
         return new cte(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cwm> d) {
      static final cte.b e = new cte.b(0, 0, 0, $$0 -> true);
   }
}
