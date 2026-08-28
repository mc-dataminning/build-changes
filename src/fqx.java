import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class fqx implements fqv {
   private final dmf a;
   private final List<fqx.b> b = Lists.newArrayList();

   private fqx(dmf $$0) {
      this.a = $$0;
   }

   @Override
   public dmf a() {
      return this.a;
   }

   public static fqx a(dmf $$0) {
      return new fqx($$0);
   }

   public fqx a(List<frb> $$0) {
      this.b.add(new fqx.b($$0));
      return this;
   }

   public fqx a(frb $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public fqx a(fqw $$0, List<frb> $$1) {
      this.b.add(new fqx.a($$0, $$1));
      return this;
   }

   public fqx a(fqw $$0, frb... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public fqx a(fqw $$0, frb $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      eai<dmf, eah> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(fqx.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends fqx.b {
      private final fqw a;

      a(fqw $$0, List<frb> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(eai<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<frb> a;

      b(List<frb> $$0) {
         this.a = $$0;
      }

      public void a(eai<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", frb.a(this.a));
         return $$0;
      }
   }
}
