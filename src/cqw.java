import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqw {
   private final List<cqw.b> a;
   private final cqw.b b;

   cqw(List<cqw.b> $$0, cqw.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqw.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqw.a a() {
      return new cqw.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqw.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqw.b b() {
      return this.b;
   }

   public List<cqw.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqw.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqw.b> a = new ArrayList<>();
      private cqw.b b = cqw.b.e;

      public cqw.a a(int $$0, int $$1, int $$2, Predicate<cuo> $$3) {
         this.a.add(new cqw.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqw.a a(int $$0, int $$1, int $$2) {
         this.b = new cqw.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqw a() {
         return new cqw(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cuo> d) {
      static final cqw.b e = new cqw.b(0, 0, 0, $$0 -> true);
   }
}
