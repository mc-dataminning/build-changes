import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqv {
   private final List<cqv.b> a;
   private final cqv.b b;

   cqv(List<cqv.b> $$0, cqv.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqv.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqv.a a() {
      return new cqv.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqv.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqv.b b() {
      return this.b;
   }

   public List<cqv.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqv.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqv.b> a = new ArrayList<>();
      private cqv.b b = cqv.b.e;

      public cqv.a a(int $$0, int $$1, int $$2, Predicate<cun> $$3) {
         this.a.add(new cqv.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqv.a a(int $$0, int $$1, int $$2) {
         this.b = new cqv.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqv a() {
         return new cqv(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cun> d) {
      static final cqv.b e = new cqv.b(0, 0, 0, $$0 -> true);
   }
}
