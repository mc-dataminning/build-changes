import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cgw {
   private final cgv a;
   private final List<cgw.a> b = Lists.newArrayList();

   public cgw(cgv $$0) {
      this.a = $$0;
   }

   public cgw a(int $$0, cgt $$1) {
      this.b.add(new cgw.a($$0, $$1));
      return this;
   }

   public cgv a() {
      this.b.stream().map(cgw.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cgt $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cgt b;

      public a(int $$0, cgt $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cgt b() {
         return this.b;
      }
   }
}
