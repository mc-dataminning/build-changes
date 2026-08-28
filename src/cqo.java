import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cqo {
   private final cqn a;
   private final List<cqo.a> b = Lists.newArrayList();

   public cqo(cqn $$0) {
      this.a = $$0;
   }

   public cqo a(int $$0, cql $$1) {
      this.b.add(new cqo.a($$0, $$1));
      return this;
   }

   public cqn a() {
      this.b.stream().map(cqo.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cql $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cql b;

      public a(int $$0, cql $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cql b() {
         return this.b;
      }
   }
}
