import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cff {
   private final List<cff.b> a;
   private final cff.b b;

   cff(List<cff.b> $$0, cff.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cff.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cff.a a() {
      return new cff.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cff.b b(int $$0) {
      return this.a.get($$0);
   }

   public cff.b b() {
      return this.b;
   }

   public List<cff.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cff.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cff.b> a = new ArrayList<>();
      private cff.b b = cff.b.e;

      public cff.a a(int $$0, int $$1, int $$2, Predicate<ciy> $$3) {
         this.a.add(new cff.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cff.a a(int $$0, int $$1, int $$2) {
         this.b = new cff.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cff a() {
         return new cff(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<ciy> d) {
      static final cff.b e = new cff.b(0, 0, 0, $$0 -> true);
   }
}
