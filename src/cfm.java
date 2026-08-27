import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfm {
   private final List<cfm.b> a;
   private final cfm.b b;

   cfm(List<cfm.b> $$0, cfm.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cfm.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cfm.a a() {
      return new cfm.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cfm.b b(int $$0) {
      return this.a.get($$0);
   }

   public cfm.b b() {
      return this.b;
   }

   public List<cfm.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cfm.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cfm.b> a = new ArrayList<>();
      private cfm.b b = cfm.b.e;

      public cfm.a a(int $$0, int $$1, int $$2, Predicate<cjf> $$3) {
         this.a.add(new cfm.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cfm.a a(int $$0, int $$1, int $$2) {
         this.b = new cfm.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cfm a() {
         return new cfm(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cjf> d) {
      static final cfm.b e = new cfm.b(0, 0, 0, $$0 -> true);
   }
}
