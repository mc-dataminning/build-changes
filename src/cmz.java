import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cmz {
   private final cmy a;
   private final List<cmz.a> b = Lists.newArrayList();

   public cmz(cmy $$0) {
      this.a = $$0;
   }

   public cmz a(int $$0, cmw $$1) {
      this.b.add(new cmz.a($$0, $$1));
      return this;
   }

   public cmy a() {
      this.b.stream().map(cmz.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cmw $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cmw b;

      public a(int $$0, cmw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cmw b() {
         return this.b;
      }
   }
}
