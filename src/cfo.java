import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfo {
   private final List<cfo.b> a;
   private final cfo.b b;

   cfo(List<cfo.b> $$0, cfo.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cfo.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cfo.a a() {
      return new cfo.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cfo.b b(int $$0) {
      return this.a.get($$0);
   }

   public cfo.b b() {
      return this.b;
   }

   public List<cfo.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cfo.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cfo.b> a = new ArrayList<>();
      private cfo.b b = cfo.b.e;

      public cfo.a a(int $$0, int $$1, int $$2, Predicate<cjh> $$3) {
         this.a.add(new cfo.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cfo.a a(int $$0, int $$1, int $$2) {
         this.b = new cfo.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cfo a() {
         return new cfo(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cjh> d) {
      static final cfo.b e = new cfo.b(0, 0, 0, $$0 -> true);
   }
}
