import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class edp extends edv {
   final egc a;
   final boolean b;

   edp(efh[] $$0, egc $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public edx b() {
      return edy.c;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.a();
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      art $$2 = $$1.b();
      return cnf.a($$2, $$0, this.a.a($$1), this.b);
   }

   public static edp.a a(egc $$0) {
      return new edp.a($$0);
   }

   public static class a extends edv.a<edp.a> {
      private final egc a;
      private boolean b;

      public a(egc $$0) {
         this.a = $$0;
      }

      protected edp.a a() {
         return this;
      }

      public edp.a e() {
         this.b = true;
         return this;
      }

      @Override
      public edw b() {
         return new edp(this.g(), this.a, this.b);
      }
   }

   public static class b extends edv.c<edp> {
      public void a(JsonObject $$0, edp $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("levels", $$2.serialize($$1.a));
         $$0.addProperty("treasure", $$1.b);
      }

      public edp a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         egc $$3 = arf.a($$0, "levels", $$1, egc.class);
         boolean $$4 = arf.a($$0, "treasure", false);
         return new edp($$2, $$3, $$4);
      }
   }
}
