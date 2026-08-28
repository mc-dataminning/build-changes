import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class fnf implements fnd {
   private final djm a;
   private final List<fnf.b> b = Lists.newArrayList();

   private fnf(djm $$0) {
      this.a = $$0;
   }

   @Override
   public djm a() {
      return this.a;
   }

   public static fnf a(djm $$0) {
      return new fnf($$0);
   }

   public fnf a(List<fnj> $$0) {
      this.b.add(new fnf.b($$0));
      return this;
   }

   public fnf a(fnj $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public fnf a(fne $$0, List<fnj> $$1) {
      this.b.add(new fnf.a($$0, $$1));
      return this;
   }

   public fnf a(fne $$0, fnj... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public fnf a(fne $$0, fnj $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dwy<djm, dwx> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(fnf.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends fnf.b {
      private final fne a;

      a(fne $$0, List<fnj> $$1) {
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
      private final List<fnj> a;

      b(List<fnj> $$0) {
         this.a = $$0;
      }

      public void a(dwy<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", fnj.a(this.a));
         return $$0;
      }
   }
}
