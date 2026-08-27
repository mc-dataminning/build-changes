import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public final class edc implements edf {
   final edf a;
   final edf b;

   edc(edf $$0, edf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ede b() {
      return edg.c;
   }

   @Override
   public int a(dzk $$0) {
      int $$1 = this.a.a($$0);
      float $$2 = this.b.b($$0);
      apf $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(dzk $$0) {
      return (float)this.a($$0);
   }

   public static edc a(int $$0, float $$1) {
      return new edc(edd.a((float)$$0), edd.a($$1));
   }

   @Override
   public Set<ebt<?>> a() {
      return Sets.union(this.a.a(), this.b.a());
   }

   public static class a implements dzt<edc> {
      public edc b(JsonObject $$0, JsonDeserializationContext $$1) {
         edf $$2 = aor.a($$0, "n", $$1, edf.class);
         edf $$3 = aor.a($$0, "p", $$1, edf.class);
         return new edc($$2, $$3);
      }

      public void a(JsonObject $$0, edc $$1, JsonSerializationContext $$2) {
         $$0.add("n", $$2.serialize($$1.a));
         $$0.add("p", $$2.serialize($$1.b));
      }
   }
}
