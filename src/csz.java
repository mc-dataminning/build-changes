import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class csz {
   private final csy a;
   private final List<csz.a> b = Lists.newArrayList();

   public csz(csy $$0) {
      this.a = $$0;
   }

   public csz a(int $$0, csw $$1) {
      this.b.add(new csz.a($$0, $$1));
      return this;
   }

   public csy a() {
      this.b.stream().map(csz.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         csw $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final csw b;

      public a(int $$0, csw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public csw b() {
         return this.b;
      }
   }
}
