import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cps {
   private final cpr a;
   private final List<cps.a> b = Lists.newArrayList();

   public cps(cpr $$0) {
      this.a = $$0;
   }

   public cps a(int $$0, cpp $$1) {
      this.b.add(new cps.a($$0, $$1));
      return this;
   }

   public cpr a() {
      this.b.stream().map(cps.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cpp $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cpp b;

      public a(int $$0, cpp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cpp b() {
         return this.b;
      }
   }
}
