import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class ctj {
   private final cti a;
   private final List<ctj.a> b = Lists.newArrayList();

   public ctj(cti $$0) {
      this.a = $$0;
   }

   public ctj a(int $$0, ctg $$1) {
      this.b.add(new ctj.a($$0, $$1));
      return this;
   }

   public cti a() {
      this.b.stream().map(ctj.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ctg $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ctg b;

      public a(int $$0, ctg $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ctg b() {
         return this.b;
      }
   }
}
