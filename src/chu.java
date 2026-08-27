import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chu {
   private final List<chu.b> a;
   private final chu.b b;

   chu(List<chu.b> $$0, chu.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(chu.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static chu.a a() {
      return new chu.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public chu.b b(int $$0) {
      return this.a.get($$0);
   }

   public chu.b b() {
      return this.b;
   }

   public List<chu.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(chu.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<chu.b> a = new ArrayList<>();
      private chu.b b = chu.b.e;

      public chu.a a(int $$0, int $$1, int $$2, Predicate<clo> $$3) {
         this.a.add(new chu.b($$0, $$1, $$2, $$3));
         return this;
      }

      public chu.a a(int $$0, int $$1, int $$2) {
         this.b = new chu.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public chu a() {
         return new chu(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<clo> d) {
      static final chu.b e = new chu.b(0, 0, 0, $$0 -> true);
   }
}
