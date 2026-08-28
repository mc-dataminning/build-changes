import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cst {
   private final List<cst.b> a;
   private final cst.b b;

   cst(List<cst.b> $$0, cst.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cst.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cst.a a() {
      return new cst.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cst.b b(int $$0) {
      return this.a.get($$0);
   }

   public cst.b b() {
      return this.b;
   }

   public List<cst.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cst.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cst.b> a = new ArrayList<>();
      private cst.b b = cst.b.e;

      public cst.a a(int $$0, int $$1, int $$2, Predicate<cwb> $$3) {
         this.a.add(new cst.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cst.a a(int $$0, int $$1, int $$2) {
         this.b = new cst.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cst a() {
         return new cst(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cwb> d) {
      static final cst.b e = new cst.b(0, 0, 0, $$0 -> true);
   }
}
