import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class crv {
   private final List<crv.b> a;
   private final crv.b b;

   crv(List<crv.b> $$0, crv.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(crv.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static crv.a a() {
      return new crv.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public crv.b b(int $$0) {
      return this.a.get($$0);
   }

   public crv.b b() {
      return this.b;
   }

   public List<crv.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(crv.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<crv.b> a = new ArrayList<>();
      private crv.b b = crv.b.e;

      public crv.a a(int $$0, int $$1, int $$2, Predicate<cvl> $$3) {
         this.a.add(new crv.b($$0, $$1, $$2, $$3));
         return this;
      }

      public crv.a a(int $$0, int $$1, int $$2) {
         this.b = new crv.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public crv a() {
         return new crv(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cvl> d) {
      static final crv.b e = new crv.b(0, 0, 0, $$0 -> true);
   }
}
