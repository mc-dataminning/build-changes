import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfs {
   private final List<cfs.b> a;
   private final cfs.b b;

   cfs(List<cfs.b> $$0, cfs.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cfs.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cfs.a a() {
      return new cfs.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cfs.b b(int $$0) {
      return this.a.get($$0);
   }

   public cfs.b b() {
      return this.b;
   }

   public List<cfs.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cfs.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cfs.b> a = new ArrayList<>();
      private cfs.b b = cfs.b.e;

      public cfs.a a(int $$0, int $$1, int $$2, Predicate<cjl> $$3) {
         this.a.add(new cfs.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cfs.a a(int $$0, int $$1, int $$2) {
         this.b = new cfs.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cfs a() {
         return new cfs(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cjl> d) {
      static final cfs.b e = new cfs.b(0, 0, 0, $$0 -> true);
   }
}
