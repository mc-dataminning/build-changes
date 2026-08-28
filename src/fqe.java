import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class fqe implements fqc {
   private final dlu a;
   private final List<fqe.b> b = Lists.newArrayList();

   private fqe(dlu $$0) {
      this.a = $$0;
   }

   @Override
   public dlu a() {
      return this.a;
   }

   public static fqe a(dlu $$0) {
      return new fqe($$0);
   }

   public fqe a(List<fqi> $$0) {
      this.b.add(new fqe.b($$0));
      return this;
   }

   public fqe a(fqi $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public fqe a(fqd $$0, List<fqi> $$1) {
      this.b.add(new fqe.a($$0, $$1));
      return this;
   }

   public fqe a(fqd $$0, fqi... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public fqe a(fqd $$0, fqi $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dzp<dlu, dzo> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(fqe.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends fqe.b {
      private final fqd a;

      a(fqd $$0, List<fqi> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dzp<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<fqi> a;

      b(List<fqi> $$0) {
         this.a = $$0;
      }

      public void a(dzp<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", fqi.a(this.a));
         return $$0;
      }
   }
}
