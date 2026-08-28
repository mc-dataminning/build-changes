import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cod {
   private final coc a;
   private final List<cod.a> b = Lists.newArrayList();

   public cod(coc $$0) {
      this.a = $$0;
   }

   public cod a(int $$0, coa $$1) {
      this.b.add(new cod.a($$0, $$1));
      return this;
   }

   public coc a() {
      this.b.stream().map(cod.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         coa $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final coa b;

      public a(int $$0, coa $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public coa b() {
         return this.b;
      }
   }
}
