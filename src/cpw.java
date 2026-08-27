import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cpw {
   private final List<cpw.b> a;
   private final cpw.b b;

   cpw(List<cpw.b> $$0, cpw.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cpw.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cpw.a a() {
      return new cpw.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cpw.b b(int $$0) {
      return this.a.get($$0);
   }

   public cpw.b b() {
      return this.b;
   }

   public List<cpw.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cpw.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cpw.b> a = new ArrayList<>();
      private cpw.b b = cpw.b.e;

      public cpw.a a(int $$0, int $$1, int $$2, Predicate<cto> $$3) {
         this.a.add(new cpw.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cpw.a a(int $$0, int $$1, int $$2) {
         this.b = new cpw.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cpw a() {
         return new cpw(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cto> d) {
      static final cpw.b e = new cpw.b(0, 0, 0, $$0 -> true);
   }
}
