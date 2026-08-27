import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chh {
   private final List<chh.b> a;
   private final chh.b b;

   chh(List<chh.b> $$0, chh.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(chh.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static chh.a a() {
      return new chh.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public chh.b b(int $$0) {
      return this.a.get($$0);
   }

   public chh.b b() {
      return this.b;
   }

   public List<chh.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(chh.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<chh.b> a = new ArrayList<>();
      private chh.b b = chh.b.e;

      public chh.a a(int $$0, int $$1, int $$2, Predicate<clb> $$3) {
         this.a.add(new chh.b($$0, $$1, $$2, $$3));
         return this;
      }

      public chh.a a(int $$0, int $$1, int $$2) {
         this.b = new chh.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public chh a() {
         return new chh(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<clb> d) {
      static final chh.b e = new chh.b(0, 0, 0, $$0 -> true);
   }
}
