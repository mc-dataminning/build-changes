import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cjq {
   private final cjp a;
   private final List<cjq.a> b = Lists.newArrayList();

   public cjq(cjp $$0) {
      this.a = $$0;
   }

   public cjq a(int $$0, cjn $$1) {
      this.b.add(new cjq.a($$0, $$1));
      return this;
   }

   public cjp a() {
      this.b.stream().map(cjq.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cjn $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cjn b;

      public a(int $$0, cjn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cjn b() {
         return this.b;
      }
   }
}
