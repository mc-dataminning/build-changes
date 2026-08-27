import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class ccz {
   private final ccy a;
   private final List<ccz.a> b = Lists.newArrayList();

   public ccz(ccy $$0) {
      this.a = $$0;
   }

   public ccz a(int $$0, ccw $$1) {
      this.b.add(new ccz.a($$0, $$1));
      return this;
   }

   public ccy a() {
      this.b.stream().map(ccz.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         ccw $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final ccw b;

      public a(int $$0, ccw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public ccw b() {
         return this.b;
      }
   }
}
