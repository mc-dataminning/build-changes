import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class ctg {
   private final ctf a;
   private final List<ctg.a> b = Lists.newArrayList();

   public ctg(ctf $$0) {
      this.a = $$0;
   }

   public ctg a(int $$0, ctd $$1) {
      this.b.add(new ctg.a($$0, $$1));
      return this;
   }

   public ctf a() {
      this.b.stream().map(ctg.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ctd $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ctd b;

      public a(int $$0, ctd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ctd b() {
         return this.b;
      }
   }
}
