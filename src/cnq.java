import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cnq {
   private final cnp a;
   private final List<cnq.a> b = Lists.newArrayList();

   public cnq(cnp $$0) {
      this.a = $$0;
   }

   public cnq a(int $$0, cnn $$1) {
      this.b.add(new cnq.a($$0, $$1));
      return this;
   }

   public cnp a() {
      this.b.stream().map(cnq.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cnn $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cnn b;

      public a(int $$0, cnn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cnn b() {
         return this.b;
      }
   }
}
