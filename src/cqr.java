import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cqr {
   private final cqq a;
   private final List<cqr.a> b = Lists.newArrayList();

   public cqr(cqq $$0) {
      this.a = $$0;
   }

   public cqr a(int $$0, cqo $$1) {
      this.b.add(new cqr.a($$0, $$1));
      return this;
   }

   public cqq a() {
      this.b.stream().map(cqr.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cqo $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cqo b;

      public a(int $$0, cqo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cqo b() {
         return this.b;
      }
   }
}
