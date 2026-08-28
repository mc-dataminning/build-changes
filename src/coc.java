import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class coc {
   private final cob a;
   private final List<coc.a> b = Lists.newArrayList();

   public coc(cob $$0) {
      this.a = $$0;
   }

   public coc a(int $$0, cnz $$1) {
      this.b.add(new coc.a($$0, $$1));
      return this;
   }

   public cob a() {
      this.b.stream().map(coc.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cnz $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cnz b;

      public a(int $$0, cnz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cnz b() {
         return this.b;
      }
   }
}
