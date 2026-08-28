import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cos {
   private final cor a;
   private final List<cos.a> b = Lists.newArrayList();

   public cos(cor $$0) {
      this.a = $$0;
   }

   public cos a(int $$0, cop $$1) {
      this.b.add(new cos.a($$0, $$1));
      return this;
   }

   public cor a() {
      this.b.stream().map(cos.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cop $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cop b;

      public a(int $$0, cop $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cop b() {
         return this.b;
      }
   }
}
