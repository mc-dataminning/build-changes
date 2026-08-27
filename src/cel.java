import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cel {
   private final cek a;
   private final List<cel.a> b = Lists.newArrayList();

   public cel(cek $$0) {
      this.a = $$0;
   }

   public cel a(int $$0, cei $$1) {
      this.b.add(new cel.a($$0, $$1));
      return this;
   }

   public cek a() {
      this.b.stream().map(cel.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cei $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cei b;

      public a(int $$0, cei $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cei b() {
         return this.b;
      }
   }
}
