import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cqx {
   private final List<cqx.b> a;
   private final cqx.b b;

   cqx(List<cqx.b> $$0, cqx.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cqx.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cqx.a a() {
      return new cqx.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cqx.b b(int $$0) {
      return this.a.get($$0);
   }

   public cqx.b b() {
      return this.b;
   }

   public List<cqx.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cqx.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cqx.b> a = new ArrayList<>();
      private cqx.b b = cqx.b.e;

      public cqx.a a(int $$0, int $$1, int $$2, Predicate<cup> $$3) {
         this.a.add(new cqx.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cqx.a a(int $$0, int $$1, int $$2) {
         this.b = new cqx.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cqx a() {
         return new cqx(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cup> d) {
      static final cqx.b e = new cqx.b(0, 0, 0, $$0 -> true);
   }
}
