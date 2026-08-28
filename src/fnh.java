import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class fnh implements fnf {
   private final djn a;
   private final List<fnh.b> b = Lists.newArrayList();

   private fnh(djn $$0) {
      this.a = $$0;
   }

   @Override
   public djn a() {
      return this.a;
   }

   public static fnh a(djn $$0) {
      return new fnh($$0);
   }

   public fnh a(List<fnl> $$0) {
      this.b.add(new fnh.b($$0));
      return this;
   }

   public fnh a(fnl $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public fnh a(fng $$0, List<fnl> $$1) {
      this.b.add(new fnh.a($$0, $$1));
      return this;
   }

   public fnh a(fng $$0, fnl... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public fnh a(fng $$0, fnl $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dwz<djn, dwy> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(fnh.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends fnh.b {
      private final fng a;

      a(fng $$0, List<fnl> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dwz<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<fnl> a;

      b(List<fnl> $$0) {
         this.a = $$0;
      }

      public void a(dwz<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", fnl.a(this.a));
         return $$0;
      }
   }
}
