import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class ctw {
   private final ctv a;
   private final List<ctw.a> b = Lists.newArrayList();

   public ctw(ctv $$0) {
      this.a = $$0;
   }

   public ctw a(int $$0, ctt $$1) {
      this.b.add(new ctw.a($$0, $$1));
      return this;
   }

   public ctv a() {
      this.b.stream().map(ctw.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ctt $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ctt b;

      public a(int $$0, ctt $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ctt b() {
         return this.b;
      }
   }
}
