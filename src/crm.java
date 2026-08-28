import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class crm {
   private final crl a;
   private final List<crm.a> b = Lists.newArrayList();

   public crm(crl $$0) {
      this.a = $$0;
   }

   public crm a(int $$0, crj $$1) {
      this.b.add(new crm.a($$0, $$1));
      return this;
   }

   public crl a() {
      this.b.stream().map(crm.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         crj $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final crj b;

      public a(int $$0, crj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public crj b() {
         return this.b;
      }
   }
}
