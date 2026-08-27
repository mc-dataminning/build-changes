import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class ckm {
   private final ckl a;
   private final List<ckm.a> b = Lists.newArrayList();

   public ckm(ckl $$0) {
      this.a = $$0;
   }

   public ckm a(int $$0, ckj $$1) {
      this.b.add(new ckm.a($$0, $$1));
      return this;
   }

   public ckl a() {
      this.b.stream().map(ckm.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ckj $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ckj b;

      public a(int $$0, ckj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ckj b() {
         return this.b;
      }
   }
}
