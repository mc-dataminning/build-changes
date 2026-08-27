import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cmt {
   private final List<cmt.b> a;
   private final cmt.b b;

   cmt(List<cmt.b> $$0, cmt.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cmt.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cmt.a a() {
      return new cmt.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cmt.b b(int $$0) {
      return this.a.get($$0);
   }

   public cmt.b b() {
      return this.b;
   }

   public List<cmt.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cmt.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cmt.b> a = new ArrayList<>();
      private cmt.b b = cmt.b.e;

      public cmt.a a(int $$0, int $$1, int $$2, Predicate<cqm> $$3) {
         this.a.add(new cmt.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cmt.a a(int $$0, int $$1, int $$2) {
         this.b = new cmt.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cmt a() {
         return new cmt(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cqm> d) {
      static final cmt.b e = new cmt.b(0, 0, 0, $$0 -> true);
   }
}
