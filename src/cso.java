import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cso {
   private final List<cso.b> a;
   private final cso.b b;

   cso(List<cso.b> $$0, cso.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cso.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cso.a a() {
      return new cso.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cso.b b(int $$0) {
      return this.a.get($$0);
   }

   public cso.b b() {
      return this.b;
   }

   public List<cso.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cso.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cso.b> a = new ArrayList<>();
      private cso.b b = cso.b.e;

      public cso.a a(int $$0, int $$1, int $$2, Predicate<cvx> $$3) {
         this.a.add(new cso.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cso.a a(int $$0, int $$1, int $$2) {
         this.b = new cso.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cso a() {
         return new cso(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cvx> d) {
      static final cso.b e = new cso.b(0, 0, 0, $$0 -> true);
   }
}
