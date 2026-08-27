import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cjm {
   private final List<cjm.b> a;
   private final cjm.b b;

   cjm(List<cjm.b> $$0, cjm.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cjm.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cjm.a a() {
      return new cjm.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cjm.b b(int $$0) {
      return this.a.get($$0);
   }

   public cjm.b b() {
      return this.b;
   }

   public List<cjm.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cjm.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cjm.b> a = new ArrayList<>();
      private cjm.b b = cjm.b.e;

      public cjm.a a(int $$0, int $$1, int $$2, Predicate<cng> $$3) {
         this.a.add(new cjm.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cjm.a a(int $$0, int $$1, int $$2) {
         this.b = new cjm.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cjm a() {
         return new cjm(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cng> d) {
      static final cjm.b e = new cjm.b(0, 0, 0, $$0 -> true);
   }
}
