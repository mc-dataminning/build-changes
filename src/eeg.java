import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eeg extends edv {
   final egc a;
   final boolean b;

   eeg(efh[] $$0, egc $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public edx b() {
      return edy.b;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.a();
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      int $$2 = this.b ? $$0.L() : 0;
      $$0.f(aro.a($$2 + this.a.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static edv.a<?> a(egc $$0) {
      return a($$1 -> new eeg($$1, $$0, false));
   }

   public static edv.a<?> a(egc $$0, boolean $$1) {
      return a($$2 -> new eeg($$2, $$0, $$1));
   }

   public static class a extends edv.c<eeg> {
      public void a(JsonObject $$0, eeg $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("count", $$2.serialize($$1.a));
         $$0.addProperty("add", $$1.b);
      }

      public eeg a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         egc $$3 = arf.a($$0, "count", $$1, egc.class);
         boolean $$4 = arf.a($$0, "add", false);
         return new eeg($$2, $$3, $$4);
      }
   }
}
