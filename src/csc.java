import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class csc {
   private final csb a;
   private final List<csc.a> b = Lists.newArrayList();

   public csc(csb $$0) {
      this.a = $$0;
   }

   public csc a(int $$0, crz $$1) {
      this.b.add(new csc.a($$0, $$1));
      return this;
   }

   public csb a() {
      this.b.stream().map(csc.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         crz $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final crz b;

      public a(int $$0, crz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public crz b() {
         return this.b;
      }
   }
}
