import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cop {
   private final coo a;
   private final List<cop.a> b = Lists.newArrayList();

   public cop(coo $$0) {
      this.a = $$0;
   }

   public cop a(int $$0, col $$1) {
      this.b.add(new cop.a($$0, $$1));
      return this;
   }

   public coo a() {
      this.b.stream().map(cop.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         col $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final col b;

      public a(int $$0, col $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public col b() {
         return this.b;
      }
   }
}
