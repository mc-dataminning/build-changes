import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cgq {
   private final List<cgq.b> a;
   private final cgq.b b;

   cgq(List<cgq.b> $$0, cgq.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cgq.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cgq.a a() {
      return new cgq.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cgq.b b(int $$0) {
      return this.a.get($$0);
   }

   public cgq.b b() {
      return this.b;
   }

   public List<cgq.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cgq.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cgq.b> a = new ArrayList<>();
      private cgq.b b = cgq.b.e;

      public cgq.a a(int $$0, int $$1, int $$2, Predicate<ckj> $$3) {
         this.a.add(new cgq.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cgq.a a(int $$0, int $$1, int $$2) {
         this.b = new cgq.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cgq a() {
         return new cgq(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<ckj> d) {
      static final cgq.b e = new cgq.b(0, 0, 0, $$0 -> true);
   }
}
