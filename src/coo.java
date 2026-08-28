import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class coo {
   private final com a;
   private final List<coo.a> b = Lists.newArrayList();

   public coo(com $$0) {
      this.a = $$0;
   }

   public coo a(int $$0, cok $$1) {
      this.b.add(new coo.a($$0, $$1));
      return this;
   }

   public com a() {
      this.b.stream().map(coo.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cok $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cok b;

      public a(int $$0, cok $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cok b() {
         return this.b;
      }
   }
}
