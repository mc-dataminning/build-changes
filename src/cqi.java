import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqi {
   private final List<cqi.b> a;
   private final cqi.b b;

   cqi(List<cqi.b> $$0, cqi.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqi.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqi.a a() {
      return new cqi.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqi.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqi.b b() {
      return this.b;
   }

   public List<cqi.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqi.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqi.b> a = new ArrayList<>();
      private cqi.b b = cqi.b.e;

      public cqi.a a(int $$0, int $$1, int $$2, Predicate<cua> $$3) {
         this.a.add(new cqi.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqi.a a(int $$0, int $$1, int $$2) {
         this.b = new cqi.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqi a() {
         return new cqi(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cua> d) {
      static final cqi.b e = new cqi.b(0, 0, 0, $$0 -> true);
   }
}
