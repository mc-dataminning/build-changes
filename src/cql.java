import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cql {
   private final List<cql.b> a;
   private final cql.b b;

   cql(List<cql.b> $$0, cql.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cql.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cql.a a() {
      return new cql.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cql.b b(int $$0) {
      return this.a.get($$0);
   }

   public cql.b b() {
      return this.b;
   }

   public List<cql.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cql.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cql.b> a = new ArrayList<>();
      private cql.b b = cql.b.e;

      public cql.a a(int $$0, int $$1, int $$2, Predicate<cuc> $$3) {
         this.a.add(new cql.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cql.a a(int $$0, int $$1, int $$2) {
         this.b = new cql.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cql a() {
         return new cql(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cuc> d) {
      static final cql.b e = new cql.b(0, 0, 0, $$0 -> true);
   }
}
