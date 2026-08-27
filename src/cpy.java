import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cpy {
   private final List<cpy.b> a;
   private final cpy.b b;

   cpy(List<cpy.b> $$0, cpy.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cpy.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cpy.a a() {
      return new cpy.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cpy.b b(int $$0) {
      return this.a.get($$0);
   }

   public cpy.b b() {
      return this.b;
   }

   public List<cpy.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cpy.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cpy.b> a = new ArrayList<>();
      private cpy.b b = cpy.b.e;

      public cpy.a a(int $$0, int $$1, int $$2, Predicate<ctq> $$3) {
         this.a.add(new cpy.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cpy.a a(int $$0, int $$1, int $$2) {
         this.b = new cpy.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cpy a() {
         return new cpy(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<ctq> d) {
      static final cpy.b e = new cpy.b(0, 0, 0, $$0 -> true);
   }
}
