import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cjd {
   private final List<cjd.b> a;
   private final cjd.b b;

   cjd(List<cjd.b> $$0, cjd.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cjd.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cjd.a a() {
      return new cjd.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cjd.b b(int $$0) {
      return this.a.get($$0);
   }

   public cjd.b b() {
      return this.b;
   }

   public List<cjd.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cjd.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cjd.b> a = new ArrayList<>();
      private cjd.b b = cjd.b.e;

      public cjd.a a(int $$0, int $$1, int $$2, Predicate<cmx> $$3) {
         this.a.add(new cjd.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cjd.a a(int $$0, int $$1, int $$2) {
         this.b = new cjd.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cjd a() {
         return new cjd(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cmx> d) {
      static final cjd.b e = new cjd.b(0, 0, 0, $$0 -> true);
   }
}
