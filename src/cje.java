import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cje {
   private final List<cje.b> a;
   private final cje.b b;

   cje(List<cje.b> $$0, cje.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cje.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cje.a a() {
      return new cje.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cje.b b(int $$0) {
      return this.a.get($$0);
   }

   public cje.b b() {
      return this.b;
   }

   public List<cje.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cje.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cje.b> a = new ArrayList<>();
      private cje.b b = cje.b.e;

      public cje.a a(int $$0, int $$1, int $$2, Predicate<cmy> $$3) {
         this.a.add(new cje.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cje.a a(int $$0, int $$1, int $$2) {
         this.b = new cje.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cje a() {
         return new cje(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cmy> d) {
      static final cje.b e = new cje.b(0, 0, 0, $$0 -> true);
   }
}
