import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cfi {
   private final cfh a;
   private final List<cfi.a> b = Lists.newArrayList();

   public cfi(cfh $$0) {
      this.a = $$0;
   }

   public cfi a(int $$0, cff $$1) {
      this.b.add(new cfi.a($$0, $$1));
      return this;
   }

   public cfh a() {
      this.b.stream().map(cfi.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cff $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cff b;

      public a(int $$0, cff $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cff b() {
         return this.b;
      }
   }
}
