import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cac {
   private final cab a;
   private final List<cac.a> b = Lists.newArrayList();

   public cac(cab $$0) {
      this.a = $$0;
   }

   public cac a(int $$0, bzz $$1) {
      this.b.add(new cac.a($$0, $$1));
      return this;
   }

   public cab a() {
      this.b.stream().map(cac.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         bzz $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final bzz b;

      public a(int $$0, bzz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public bzz b() {
         return this.b;
      }
   }
}
