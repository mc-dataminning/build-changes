import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class clx {
   private final List<clx.b> a;
   private final clx.b b;

   clx(List<clx.b> $$0, clx.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(clx.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static clx.a a() {
      return new clx.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public clx.b b(int $$0) {
      return this.a.get($$0);
   }

   public clx.b b() {
      return this.b;
   }

   public List<clx.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(clx.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<clx.b> a = new ArrayList<>();
      private clx.b b = clx.b.e;

      public clx.a a(int $$0, int $$1, int $$2, Predicate<cpq> $$3) {
         this.a.add(new clx.b($$0, $$1, $$2, $$3));
         return this;
      }

      public clx.a a(int $$0, int $$1, int $$2) {
         this.b = new clx.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public clx a() {
         return new clx(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cpq> d) {
      static final clx.b e = new clx.b(0, 0, 0, $$0 -> true);
   }
}
