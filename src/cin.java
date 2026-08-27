import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cin {
   private final List<cin.b> a;
   private final cin.b b;

   cin(List<cin.b> $$0, cin.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cin.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cin.a a() {
      return new cin.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cin.b b(int $$0) {
      return this.a.get($$0);
   }

   public cin.b b() {
      return this.b;
   }

   public List<cin.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cin.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cin.b> a = new ArrayList<>();
      private cin.b b = cin.b.e;

      public cin.a a(int $$0, int $$1, int $$2, Predicate<cmh> $$3) {
         this.a.add(new cin.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cin.a a(int $$0, int $$1, int $$2) {
         this.b = new cin.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cin a() {
         return new cin(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cmh> d) {
      static final cin.b e = new cin.b(0, 0, 0, $$0 -> true);
   }
}
