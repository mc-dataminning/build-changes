import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cll {
   private final clk a;
   private final List<cll.a> b = Lists.newArrayList();

   public cll(clk $$0) {
      this.a = $$0;
   }

   public cll a(int $$0, cli $$1) {
      this.b.add(new cll.a($$0, $$1));
      return this;
   }

   public clk a() {
      this.b.stream().map(cll.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cli $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cli b;

      public a(int $$0, cli $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cli b() {
         return this.b;
      }
   }
}
