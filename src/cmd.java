import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cmd {
   private final cmc a;
   private final List<cmd.a> b = Lists.newArrayList();

   public cmd(cmc $$0) {
      this.a = $$0;
   }

   public cmd a(int $$0, cma $$1) {
      this.b.add(new cmd.a($$0, $$1));
      return this;
   }

   public cmc a() {
      this.b.stream().map(cmd.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cma $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cma b;

      public a(int $$0, cma $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cma b() {
         return this.b;
      }
   }
}
