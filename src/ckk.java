import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class ckk {
   private final ckj a;
   private final List<ckk.a> b = Lists.newArrayList();

   public ckk(ckj $$0) {
      this.a = $$0;
   }

   public ckk a(int $$0, ckh $$1) {
      this.b.add(new ckk.a($$0, $$1));
      return this;
   }

   public ckj a() {
      this.b.stream().map(ckk.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ckh $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ckh b;

      public a(int $$0, ckh $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ckh b() {
         return this.b;
      }
   }
}
