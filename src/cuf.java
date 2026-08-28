import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cuf {
   private final cue a;
   private final List<cuf.a> b = Lists.newArrayList();

   public cuf(cue $$0) {
      this.a = $$0;
   }

   public cuf a(int $$0, cuc $$1) {
      this.b.add(new cuf.a($$0, $$1));
      return this;
   }

   public cue a() {
      this.b.stream().map(cuf.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cuc $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cuc b;

      public a(int $$0, cuc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cuc b() {
         return this.b;
      }
   }
}
