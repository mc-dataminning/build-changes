import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cso {
   private final csn a;
   private final List<cso.a> b = Lists.newArrayList();

   public cso(csn $$0) {
      this.a = $$0;
   }

   public cso a(int $$0, csl $$1) {
      this.b.add(new cso.a($$0, $$1));
      return this;
   }

   public csn a() {
      this.b.stream().map(cso.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         csl $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final csl b;

      public a(int $$0, csl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public csl b() {
         return this.b;
      }
   }
}
