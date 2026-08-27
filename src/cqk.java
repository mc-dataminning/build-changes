import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqk {
   private final List<cqk.b> a;
   private final cqk.b b;

   cqk(List<cqk.b> $$0, cqk.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqk.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqk.a a() {
      return new cqk.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqk.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqk.b b() {
      return this.b;
   }

   public List<cqk.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqk.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqk.b> a = new ArrayList<>();
      private cqk.b b = cqk.b.e;

      public cqk.a a(int $$0, int $$1, int $$2, Predicate<cuh> $$3) {
         this.a.add(new cqk.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqk.a a(int $$0, int $$1, int $$2) {
         this.b = new cqk.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqk a() {
         return new cqk(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cuh> d) {
      static final cqk.b e = new cqk.b(0, 0, 0, $$0 -> true);
   }
}
