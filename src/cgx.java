import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cgx {
   private final cgw a;
   private final List<cgx.a> b = Lists.newArrayList();

   public cgx(cgw $$0) {
      this.a = $$0;
   }

   public cgx a(int $$0, cgu $$1) {
      this.b.add(new cgx.a($$0, $$1));
      return this;
   }

   public cgw a() {
      this.b.stream().map(cgx.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cgu $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cgu b;

      public a(int $$0, cgu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cgu b() {
         return this.b;
      }
   }
}
