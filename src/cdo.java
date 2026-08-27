import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cdo {
   private final cdn a;
   private final List<cdo.a> b = Lists.newArrayList();

   public cdo(cdn $$0) {
      this.a = $$0;
   }

   public cdo a(int $$0, cdl $$1) {
      this.b.add(new cdo.a($$0, $$1));
      return this;
   }

   public cdn a() {
      this.b.stream().map(cdo.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cdl $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cdl b;

      public a(int $$0, cdl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cdl b() {
         return this.b;
      }
   }
}
