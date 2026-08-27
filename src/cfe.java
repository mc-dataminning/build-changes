import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfe {
   private final List<cfe.b> a;
   private final cfe.b b;

   cfe(List<cfe.b> $$0, cfe.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cfe.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cfe.a a() {
      return new cfe.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cfe.b b(int $$0) {
      return this.a.get($$0);
   }

   public cfe.b b() {
      return this.b;
   }

   public List<cfe.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cfe.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cfe.b> a = new ArrayList<>();
      private cfe.b b = cfe.b.e;

      public cfe.a a(int $$0, int $$1, int $$2, Predicate<cix> $$3) {
         this.a.add(new cfe.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cfe.a a(int $$0, int $$1, int $$2) {
         this.b = new cfe.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cfe a() {
         return new cfe(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cix> d) {
      static final cfe.b e = new cfe.b(0, 0, 0, $$0 -> true);
   }
}
