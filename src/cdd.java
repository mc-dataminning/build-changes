import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cdd {
   private final cdc a;
   private final List<cdd.a> b = Lists.newArrayList();

   public cdd(cdc $$0) {
      this.a = $$0;
   }

   public cdd a(int $$0, cda $$1) {
      this.b.add(new cdd.a($$0, $$1));
      return this;
   }

   public cdc a() {
      this.b.stream().map(cdd.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cda $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cda b;

      public a(int $$0, cda $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cda b() {
         return this.b;
      }
   }
}
