import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class crr {
   private final crq a;
   private final List<crr.a> b = Lists.newArrayList();

   public crr(crq $$0) {
      this.a = $$0;
   }

   public crr a(int $$0, cro $$1) {
      this.b.add(new crr.a($$0, $$1));
      return this;
   }

   public crq a() {
      this.b.stream().map(crr.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cro $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cro b;

      public a(int $$0, cro $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cro b() {
         return this.b;
      }
   }
}
