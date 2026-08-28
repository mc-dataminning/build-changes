import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cok {
   private final coj a;
   private final List<cok.a> b = Lists.newArrayList();

   public cok(coj $$0) {
      this.a = $$0;
   }

   public cok a(int $$0, coh $$1) {
      this.b.add(new cok.a($$0, $$1));
      return this;
   }

   public coj a() {
      this.b.stream().map(cok.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         coh $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final coh b;

      public a(int $$0, coh $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public coh b() {
         return this.b;
      }
   }
}
