import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfh {
   private final List<cfh.b> a;
   private final cfh.b b;

   cfh(List<cfh.b> $$0, cfh.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cfh.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cfh.a a() {
      return new cfh.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cfh.b b(int $$0) {
      return this.a.get($$0);
   }

   public cfh.b b() {
      return this.b;
   }

   public List<cfh.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cfh.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cfh.b> a = new ArrayList<>();
      private cfh.b b = cfh.b.e;

      public cfh.a a(int $$0, int $$1, int $$2, Predicate<cja> $$3) {
         this.a.add(new cfh.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cfh.a a(int $$0, int $$1, int $$2) {
         this.b = new cfh.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cfh a() {
         return new cfh(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cja> d) {
      static final cfh.b e = new cfh.b(0, 0, 0, $$0 -> true);
   }
}
