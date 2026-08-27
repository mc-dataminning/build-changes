import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class edz extends edv {
   public static final int a = 0;
   final egc b;
   final int c;

   edz(efh[] $$0, egc $$1, int $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edx b() {
      return edy.h;
   }

   @Override
   public Set<eeq<?>> a() {
      return Sets.union(ImmutableSet.of(eet.d), this.b.a());
   }

   boolean c() {
      return this.c > 0;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      big $$2 = $$1.c(eet.d);
      if ($$2 instanceof biw) {
         int $$3 = cnf.h((biw)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.b.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.L() > this.c) {
            $$0.f(this.c);
         }
      }

      return $$0;
   }

   public static edz.a a(egc $$0) {
      return new edz.a($$0);
   }

   public static class a extends edv.a<edz.a> {
      private final egc a;
      private int b = 0;

      public a(egc $$0) {
         this.a = $$0;
      }

      protected edz.a a() {
         return this;
      }

      public edz.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public edw b() {
         return new edz(this.g(), this.a, this.b);
      }
   }

   public static class b extends edv.c<edz> {
      public void a(JsonObject $$0, edz $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("count", $$2.serialize($$1.b));
         if ($$1.c()) {
            $$0.add("limit", $$2.serialize($$1.c));
         }
      }

      public edz a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         int $$3 = arf.a($$0, "limit", 0);
         return new edz($$2, arf.a($$0, "count", $$1, egc.class), $$3);
      }
   }
}
