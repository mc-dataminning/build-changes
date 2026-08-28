import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class crq {
   private final crp a;
   private final List<crq.a> b = Lists.newArrayList();

   public crq(crp $$0) {
      this.a = $$0;
   }

   public crq a(int $$0, crn $$1) {
      this.b.add(new crq.a($$0, $$1));
      return this;
   }

   public crp a() {
      this.b.stream().map(crq.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         crn $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final crn b;

      public a(int $$0, crn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public crn b() {
         return this.b;
      }
   }
}
