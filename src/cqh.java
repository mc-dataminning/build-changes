import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cqh {
   private final cqg a;
   private final List<cqh.a> b = Lists.newArrayList();

   public cqh(cqg $$0) {
      this.a = $$0;
   }

   public cqh a(int $$0, cqe $$1) {
      this.b.add(new cqh.a($$0, $$1));
      return this;
   }

   public cqg a() {
      this.b.stream().map(cqh.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cqe $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cqe b;

      public a(int $$0, cqe $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cqe b() {
         return this.b;
      }
   }
}
