import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class fnd implements fnb {
   private final djk a;
   private final List<fnd.b> b = Lists.newArrayList();

   private fnd(djk $$0) {
      this.a = $$0;
   }

   @Override
   public djk a() {
      return this.a;
   }

   public static fnd a(djk $$0) {
      return new fnd($$0);
   }

   public fnd a(List<fnh> $$0) {
      this.b.add(new fnd.b($$0));
      return this;
   }

   public fnd a(fnh $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public fnd a(fnc $$0, List<fnh> $$1) {
      this.b.add(new fnd.a($$0, $$1));
      return this;
   }

   public fnd a(fnc $$0, fnh... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public fnd a(fnc $$0, fnh $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dww<djk, dwv> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(fnd.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends fnd.b {
      private final fnc a;

      a(fnc $$0, List<fnh> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dww<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<fnh> a;

      b(List<fnh> $$0) {
         this.a = $$0;
      }

      public void a(dww<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", fnh.a(this.a));
         return $$0;
      }
   }
}
