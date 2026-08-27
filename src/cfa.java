import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cfa {
   private final cez a;
   private final List<cfa.a> b = Lists.newArrayList();

   public cfa(cez $$0) {
      this.a = $$0;
   }

   public cfa a(int $$0, cex $$1) {
      this.b.add(new cfa.a($$0, $$1));
      return this;
   }

   public cez a() {
      this.b.stream().map(cfa.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cex $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cex b;

      public a(int $$0, cex $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cex b() {
         return this.b;
      }
   }
}
