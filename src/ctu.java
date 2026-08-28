import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class ctu {
   private final ctt a;
   private final List<ctu.a> b = Lists.newArrayList();

   public ctu(ctt $$0) {
      this.a = $$0;
   }

   public ctu a(int $$0, ctr $$1) {
      this.b.add(new ctu.a($$0, $$1));
      return this;
   }

   public ctt a() {
      this.b.stream().map(ctu.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ctr $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ctr b;

      public a(int $$0, ctr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ctr b() {
         return this.b;
      }
   }
}
