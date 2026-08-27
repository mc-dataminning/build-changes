import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cmr {
   private final List<cmr.b> a;
   private final cmr.b b;

   cmr(List<cmr.b> $$0, cmr.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cmr.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cmr.a a() {
      return new cmr.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cmr.b b(int $$0) {
      return this.a.get($$0);
   }

   public cmr.b b() {
      return this.b;
   }

   public List<cmr.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cmr.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cmr.b> a = new ArrayList<>();
      private cmr.b b = cmr.b.e;

      public cmr.a a(int $$0, int $$1, int $$2, Predicate<cqk> $$3) {
         this.a.add(new cmr.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cmr.a a(int $$0, int $$1, int $$2) {
         this.b = new cmr.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cmr a() {
         return new cmr(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cqk> d) {
      static final cmr.b e = new cmr.b(0, 0, 0, $$0 -> true);
   }
}
