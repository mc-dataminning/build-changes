import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class fng implements fne {
   private final djm a;
   private final List<fng.b> b = Lists.newArrayList();

   private fng(djm $$0) {
      this.a = $$0;
   }

   @Override
   public djm a() {
      return this.a;
   }

   public static fng a(djm $$0) {
      return new fng($$0);
   }

   public fng a(List<fnk> $$0) {
      this.b.add(new fng.b($$0));
      return this;
   }

   public fng a(fnk $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public fng a(fnf $$0, List<fnk> $$1) {
      this.b.add(new fng.a($$0, $$1));
      return this;
   }

   public fng a(fnf $$0, fnk... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public fng a(fnf $$0, fnk $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dwy<djm, dwx> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(fng.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends fng.b {
      private final fnf a;

      a(fnf $$0, List<fnk> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dwy<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<fnk> a;

      b(List<fnk> $$0) {
         this.a = $$0;
      }

      public void a(dwy<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", fnk.a(this.a));
         return $$0;
      }
   }
}
