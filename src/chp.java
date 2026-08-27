import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chp {
   private final List<chp.b> a;
   private final chp.b b;

   chp(List<chp.b> $$0, chp.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(chp.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static chp.a a() {
      return new chp.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public chp.b b(int $$0) {
      return this.a.get($$0);
   }

   public chp.b b() {
      return this.b;
   }

   public List<chp.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(chp.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<chp.b> a = new ArrayList<>();
      private chp.b b = chp.b.e;

      public chp.a a(int $$0, int $$1, int $$2, Predicate<clj> $$3) {
         this.a.add(new chp.b($$0, $$1, $$2, $$3));
         return this;
      }

      public chp.a a(int $$0, int $$1, int $$2) {
         this.b = new chp.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public chp a() {
         return new chp(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<clj> d) {
      static final chp.b e = new chp.b(0, 0, 0, $$0 -> true);
   }
}
