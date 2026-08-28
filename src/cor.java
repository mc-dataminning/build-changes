import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cor {
   private final coq a;
   private final List<cor.a> b = Lists.newArrayList();

   public cor(coq $$0) {
      this.a = $$0;
   }

   public cor a(int $$0, coo $$1) {
      this.b.add(new cor.a($$0, $$1));
      return this;
   }

   public coq a() {
      this.b.stream().map(cor.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         coo $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final coo b;

      public a(int $$0, coo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public coo b() {
         return this.b;
      }
   }
}
