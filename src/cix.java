import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cix {
   private final List<cix.b> a;
   private final cix.b b;

   cix(List<cix.b> $$0, cix.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cix.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cix.a a() {
      return new cix.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cix.b b(int $$0) {
      return this.a.get($$0);
   }

   public cix.b b() {
      return this.b;
   }

   public List<cix.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cix.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cix.b> a = new ArrayList<>();
      private cix.b b = cix.b.e;

      public cix.a a(int $$0, int $$1, int $$2, Predicate<cmr> $$3) {
         this.a.add(new cix.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cix.a a(int $$0, int $$1, int $$2) {
         this.b = new cix.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cix a() {
         return new cix(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cmr> d) {
      static final cix.b e = new cix.b(0, 0, 0, $$0 -> true);
   }
}
