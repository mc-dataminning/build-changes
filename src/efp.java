import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class efp implements efh {
   @Nullable
   final Long a;
   final ecg b;

   efp(@Nullable Long $$0, ecg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.q;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.b.a();
   }

   public boolean a(ech $$0) {
      aki $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.a != null) {
         $$2 %= this.a;
      }

      return this.b.b($$0, (int)$$2);
   }

   public static efp.a a(ecg $$0) {
      return new efp.a($$0);
   }

   public static class a implements efh.a {
      @Nullable
      private Long a;
      private final ecg b;

      public a(ecg $$0) {
         this.b = $$0;
      }

      public efp.a a(long $$0) {
         this.a = $$0;
         return this;
      }

      public efp a() {
         return new efp(this.a, this.b);
      }
   }

   public static class b implements ecq<efp> {
      public void a(JsonObject $$0, efp $$1, JsonSerializationContext $$2) {
         $$0.addProperty("period", $$1.a);
         $$0.add("value", $$2.serialize($$1.b));
      }

      public efp b(JsonObject $$0, JsonDeserializationContext $$1) {
         Long $$2 = $$0.has("period") ? arf.n($$0, "period") : null;
         ecg $$3 = arf.a($$0, "value", $$1, ecg.class);
         return new efp($$2, $$3);
      }
   }
}
