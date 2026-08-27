import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cns {
   private final List<cns.b> a;
   private final cns.b b;

   cns(List<cns.b> $$0, cns.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cns.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cns.a a() {
      return new cns.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cns.b b(int $$0) {
      return this.a.get($$0);
   }

   public cns.b b() {
      return this.b;
   }

   public List<cns.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cns.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cns.b> a = new ArrayList<>();
      private cns.b b = cns.b.e;

      public cns.a a(int $$0, int $$1, int $$2, Predicate<crj> $$3) {
         this.a.add(new cns.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cns.a a(int $$0, int $$1, int $$2) {
         this.b = new cns.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cns a() {
         return new cns(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<crj> d) {
      static final cns.b e = new cns.b(0, 0, 0, $$0 -> true);
   }
}
