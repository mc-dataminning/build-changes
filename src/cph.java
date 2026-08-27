import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cph {
   private final List<cph.b> a;
   private final cph.b b;

   cph(List<cph.b> $$0, cph.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cph.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cph.a a() {
      return new cph.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cph.b b(int $$0) {
      return this.a.get($$0);
   }

   public cph.b b() {
      return this.b;
   }

   public List<cph.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cph.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cph.b> a = new ArrayList<>();
      private cph.b b = cph.b.e;

      public cph.a a(int $$0, int $$1, int $$2, Predicate<csz> $$3) {
         this.a.add(new cph.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cph.a a(int $$0, int $$1, int $$2) {
         this.b = new cph.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cph a() {
         return new cph(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<csz> d) {
      static final cph.b e = new cph.b(0, 0, 0, $$0 -> true);
   }
}
