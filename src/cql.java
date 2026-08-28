import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cql {
   private final cqk a;
   private final List<cql.a> b = Lists.newArrayList();

   public cql(cqk $$0) {
      this.a = $$0;
   }

   public cql a(int $$0, cqi $$1) {
      this.b.add(new cql.a($$0, $$1));
      return this;
   }

   public cqk a() {
      this.b.stream().map(cql.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cqi $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cqi b;

      public a(int $$0, cqi $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cqi b() {
         return this.b;
      }
   }
}
