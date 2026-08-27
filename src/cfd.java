import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfd {
   private final List<cfd.b> a;
   private final cfd.b b;

   cfd(List<cfd.b> $$0, cfd.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cfd.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cfd.a a() {
      return new cfd.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cfd.b b(int $$0) {
      return this.a.get($$0);
   }

   public cfd.b b() {
      return this.b;
   }

   public List<cfd.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cfd.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cfd.b> a = new ArrayList<>();
      private cfd.b b = cfd.b.e;

      public cfd.a a(int $$0, int $$1, int $$2, Predicate<ciw> $$3) {
         this.a.add(new cfd.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cfd.a a(int $$0, int $$1, int $$2) {
         this.b = new cfd.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cfd a() {
         return new cfd(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<ciw> d) {
      static final cfd.b e = new cfd.b(0, 0, 0, $$0 -> true);
   }
}
