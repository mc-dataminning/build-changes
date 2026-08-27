import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cok {
   private final List<cok.b> a;
   private final cok.b b;

   cok(List<cok.b> $$0, cok.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cok.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cok.a a() {
      return new cok.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cok.b b(int $$0) {
      return this.a.get($$0);
   }

   public cok.b b() {
      return this.b;
   }

   public List<cok.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cok.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cok.b> a = new ArrayList<>();
      private cok.b b = cok.b.e;

      public cok.a a(int $$0, int $$1, int $$2, Predicate<csd> $$3) {
         this.a.add(new cok.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cok.a a(int $$0, int $$1, int $$2) {
         this.b = new cok.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cok a() {
         return new cok(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<csd> d) {
      static final cok.b e = new cok.b(0, 0, 0, $$0 -> true);
   }
}
