import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cpj {
   private final cpi a;
   private final List<cpj.a> b = Lists.newArrayList();

   public cpj(cpi $$0) {
      this.a = $$0;
   }

   public cpj a(int $$0, cpg $$1) {
      this.b.add(new cpj.a($$0, $$1));
      return this;
   }

   public cpi a() {
      this.b.stream().map(cpj.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cpg $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cpg b;

      public a(int $$0, cpg $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cpg b() {
         return this.b;
      }
   }
}
