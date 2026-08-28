import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cpp {
   private final cpo a;
   private final List<cpp.a> b = Lists.newArrayList();

   public cpp(cpo $$0) {
      this.a = $$0;
   }

   public cpp a(int $$0, cpm $$1) {
      this.b.add(new cpp.a($$0, $$1));
      return this;
   }

   public cpo a() {
      this.b.stream().map(cpp.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cpm $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cpm b;

      public a(int $$0, cpm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cpm b() {
         return this.b;
      }
   }
}
