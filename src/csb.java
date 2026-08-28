import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class csb {
   private final List<csb.b> a;
   private final csb.b b;

   csb(List<csb.b> $$0, csb.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(csb.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static csb.a a() {
      return new csb.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public csb.b b(int $$0) {
      return this.a.get($$0);
   }

   public csb.b b() {
      return this.b;
   }

   public List<csb.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(csb.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<csb.b> a = new ArrayList<>();
      private csb.b b = csb.b.e;

      public csb.a a(int $$0, int $$1, int $$2, Predicate<cvp> $$3) {
         this.a.add(new csb.b($$0, $$1, $$2, $$3));
         return this;
      }

      public csb.a a(int $$0, int $$1, int $$2) {
         this.b = new csb.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public csb a() {
         return new csb(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cvp> d) {
      static final csb.b e = new csb.b(0, 0, 0, $$0 -> true);
   }
}
