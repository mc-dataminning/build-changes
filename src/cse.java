import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cse {
   private final List<cse.b> a;
   private final cse.b b;

   cse(List<cse.b> $$0, cse.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cse.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cse.a a() {
      return new cse.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cse.b b(int $$0) {
      return this.a.get($$0);
   }

   public cse.b b() {
      return this.b;
   }

   public List<cse.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cse.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cse.b> a = new ArrayList<>();
      private cse.b b = cse.b.e;

      public cse.a a(int $$0, int $$1, int $$2, Predicate<cvs> $$3) {
         this.a.add(new cse.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cse.a a(int $$0, int $$1, int $$2) {
         this.b = new cse.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cse a() {
         return new cse(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cvs> d) {
      static final cse.b e = new cse.b(0, 0, 0, $$0 -> true);
   }
}
