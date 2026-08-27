import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cgg {
   private final cgf a;
   private final List<cgg.a> b = Lists.newArrayList();

   public cgg(cgf $$0) {
      this.a = $$0;
   }

   public cgg a(int $$0, cgd $$1) {
      this.b.add(new cgg.a($$0, $$1));
      return this;
   }

   public cgf a() {
      this.b.stream().map(cgg.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cgd $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cgd b;

      public a(int $$0, cgd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cgd b() {
         return this.b;
      }
   }
}
