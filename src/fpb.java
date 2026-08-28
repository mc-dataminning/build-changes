import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class fpb implements foz {
   private final dku a;
   private final List<fpb.b> b = Lists.newArrayList();

   private fpb(dku $$0) {
      this.a = $$0;
   }

   @Override
   public dku a() {
      return this.a;
   }

   public static fpb a(dku $$0) {
      return new fpb($$0);
   }

   public fpb a(List<fpf> $$0) {
      this.b.add(new fpb.b($$0));
      return this;
   }

   public fpb a(fpf $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public fpb a(fpa $$0, List<fpf> $$1) {
      this.b.add(new fpb.a($$0, $$1));
      return this;
   }

   public fpb a(fpa $$0, fpf... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public fpb a(fpa $$0, fpf $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dyn<dku, dym> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(fpb.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends fpb.b {
      private final fpa a;

      a(fpa $$0, List<fpf> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dyn<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<fpf> a;

      b(List<fpf> $$0) {
         this.a = $$0;
      }

      public void a(dyn<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", fpf.a(this.a));
         return $$0;
      }
   }
}
