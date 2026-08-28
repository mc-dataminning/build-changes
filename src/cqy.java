import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqy {
   private final List<cqy.b> a;
   private final cqy.b b;

   cqy(List<cqy.b> $$0, cqy.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqy.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqy.a a() {
      return new cqy.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqy.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqy.b b() {
      return this.b;
   }

   public List<cqy.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqy.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqy.b> a = new ArrayList<>();
      private cqy.b b = cqy.b.e;

      public cqy.a a(int $$0, int $$1, int $$2, Predicate<cuq> $$3) {
         this.a.add(new cqy.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqy.a a(int $$0, int $$1, int $$2) {
         this.b = new cqy.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqy a() {
         return new cqy(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cuq> d) {
      static final cqy.b e = new cqy.b(0, 0, 0, $$0 -> true);
   }
}
