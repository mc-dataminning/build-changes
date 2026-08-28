import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqm {
   private final List<cqm.b> a;
   private final cqm.b b;

   cqm(List<cqm.b> $$0, cqm.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqm.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqm.a a() {
      return new cqm.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqm.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqm.b b() {
      return this.b;
   }

   public List<cqm.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqm.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqm.b> a = new ArrayList<>();
      private cqm.b b = cqm.b.e;

      public cqm.a a(int $$0, int $$1, int $$2, Predicate<cud> $$3) {
         this.a.add(new cqm.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqm.a a(int $$0, int $$1, int $$2) {
         this.b = new cqm.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqm a() {
         return new cqm(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cud> d) {
      static final cqm.b e = new cqm.b(0, 0, 0, $$0 -> true);
   }
}
