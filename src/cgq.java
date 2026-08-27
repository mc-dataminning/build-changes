import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cgq {
   private final cgp a;
   private final List<cgq.a> b = Lists.newArrayList();

   public cgq(cgp $$0) {
      this.a = $$0;
   }

   public cgq a(int $$0, cgn $$1) {
      this.b.add(new cgq.a($$0, $$1));
      return this;
   }

   public cgp a() {
      this.b.stream().map(cgq.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cgn $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cgn b;

      public a(int $$0, cgn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cgn b() {
         return this.b;
      }
   }
}
