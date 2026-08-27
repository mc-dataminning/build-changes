import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cdb {
   private final cda a;
   private final List<cdb.a> b = Lists.newArrayList();

   public cdb(cda $$0) {
      this.a = $$0;
   }

   public cdb a(int $$0, ccy $$1) {
      this.b.add(new cdb.a($$0, $$1));
      return this;
   }

   public cda a() {
      this.b.stream().map(cdb.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ccy $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ccy b;

      public a(int $$0, ccy $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ccy b() {
         return this.b;
      }
   }
}
