import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cli {
   private final List<cli.b> a;
   private final cli.b b;

   cli(List<cli.b> $$0, cli.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(cli.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static cli.a a() {
      return new cli.a();
   }

   public boolean a(int $$0) {
      return this.a.size() >= $$0;
   }

   public cli.b b(int $$0) {
      return this.a.get($$0);
   }

   public cli.b b() {
      return this.b;
   }

   public List<cli.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public List<Integer> f() {
      return this.a.stream().map(cli.b::a).collect(Collectors.toList());
   }

   public static class a {
      private final List<cli.b> a = new ArrayList<>();
      private cli.b b = cli.b.e;

      public cli.a a(int $$0, int $$1, int $$2, Predicate<cpd> $$3) {
         this.a.add(new cli.b($$0, $$1, $$2, $$3));
         return this;
      }

      public cli.a a(int $$0, int $$1, int $$2) {
         this.b = new cli.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public cli a() {
         return new cli(this.a, this.b);
      }
   }

   public static record b(int a, int b, int c, Predicate<cpd> d) {
      static final cli.b e = new cli.b(0, 0, 0, $$0 -> true);
   }
}
