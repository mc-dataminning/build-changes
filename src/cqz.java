import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqz {
   private final List<cqz.b> a;
   private final cqz.b b;

   cqz(List<cqz.b> $$0, cqz.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqz.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqz.a a() {
      return new cqz.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqz.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqz.b b() {
      return this.b;
   }

   public List<cqz.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqz.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqz.b> a = new ArrayList<>();
      private cqz.b b = cqz.b.e;

      public cqz.a a(int $$0, int $$1, int $$2, Predicate<cur> $$3) {
         this.a.add(new cqz.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqz.a a(int $$0, int $$1, int $$2) {
         this.b = new cqz.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqz a() {
         return new cqz(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cur> d) {
      static final cqz.b e = new cqz.b(0, 0, 0, $$0 -> true);
   }
}
