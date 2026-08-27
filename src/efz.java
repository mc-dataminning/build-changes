import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public final class efz implements egc {
   final egc a;
   final egc b;

   efz(egc $$0, egc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public egb b() {
      return egd.c;
   }

   @Override
   public int a(ech $$0) {
      int $$1 = this.a.a($$0);
      float $$2 = this.b.b($$0);
      art $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ech $$0) {
      return (float)this.a($$0);
   }

   public static efz a(int $$0, float $$1) {
      return new efz(ega.a((float)$$0), ega.a($$1));
   }

   @Override
   public Set<eeq<?>> a() {
      return Sets.union(this.a.a(), this.b.a());
   }

   public static class a implements ecq<efz> {
      public efz b(JsonObject $$0, JsonDeserializationContext $$1) {
         egc $$2 = arf.a($$0, "n", $$1, egc.class);
         egc $$3 = arf.a($$0, "p", $$1, egc.class);
         return new efz($$2, $$3);
      }

      public void a(JsonObject $$0, efz $$1, JsonSerializationContext $$2) {
         $$0.add("n", $$2.serialize($$1.a));
         $$0.add("p", $$2.serialize($$1.b));
      }
   }
}
