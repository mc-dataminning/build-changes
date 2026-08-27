import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class chf {
   private final che a;
   private final List<chf.a> b = Lists.newArrayList();

   public chf(che $$0) {
      this.a = $$0;
   }

   public chf a(int $$0, chc $$1) {
      this.b.add(new chf.a($$0, $$1));
      return this;
   }

   public che a() {
      this.b.stream().map(chf.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         chc $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final chc b;

      public a(int $$0, chc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public chc b() {
         return this.b;
      }
   }
}
