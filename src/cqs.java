import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqs {
   private final List<cqs.b> a;
   private final cqs.b b;

   cqs(List<cqs.b> $$0, cqs.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqs.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqs.a a() {
      return new cqs.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqs.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqs.b b() {
      return this.b;
   }

   public List<cqs.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqs.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqs.b> a = new ArrayList<>();
      private cqs.b b = cqs.b.e;

      public cqs.a a(int $$0, int $$1, int $$2, Predicate<cuk> $$3) {
         this.a.add(new cqs.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqs.a a(int $$0, int $$1, int $$2) {
         this.b = new cqs.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqs a() {
         return new cqs(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cuk> d) {
      static final cqs.b e = new cqs.b(0, 0, 0, $$0 -> true);
   }
}
