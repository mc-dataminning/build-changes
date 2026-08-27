import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class edl extends edv {
   final csk a;
   final Set<dgb<?>> b;

   edl(efh[] $$0, csk $$1, Set<dgb<?>> $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public edx b() {
      return edy.w;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.g);
   }

   @Override
   protected ciw a(ciw $$0, ech $$1) {
      dey $$2 = $$1.c(eet.g);
      if ($$2 != null) {
         qs $$3 = $$0.w();
         qs $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qs();
            $$3.a("BlockStateTag", $$4);
         }

         this.b.stream().filter($$2::b).forEach($$2x -> $$4.a($$2x.f(), a($$2, $$2x)));
      }

      return $$0;
   }

   public static edl.a a(csk $$0) {
      return new edl.a($$0);
   }

   private static <T extends Comparable<T>> String a(dey $$0, dgb<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends edv.a<edl.a> {
      private final csk a;
      private final Set<dgb<?>> b = Sets.newHashSet();

      a(csk $$0) {
         this.a = $$0;
      }

      public edl.a a(dgb<?> $$0) {
         if (!this.a.l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected edl.a a() {
         return this;
      }

      @Override
      public edw b() {
         return new edl(this.g(), this.a, this.b);
      }
   }

   public static class b extends edv.c<edl> {
      public void a(JsonObject $$0, edl $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("block", jc.f.b($$1.a).toString());
         JsonArray $$3 = new JsonArray();
         $$1.b.forEach($$1x -> $$3.add($$1x.f()));
         $$0.add("properties", $$3);
      }

      public edl a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         aep $$3 = new aep(arf.i($$0, "block"));
         csk $$4 = jc.f.b($$3).orElseThrow(() -> new IllegalArgumentException("Can't find block " + $$3));
         dez<csk, dey> $$5 = $$4.l();
         Set<dgb<?>> $$6 = Sets.newHashSet();
         JsonArray $$7 = arf.a($$0, "properties", null);
         if ($$7 != null) {
            $$7.forEach($$2x -> $$6.add($$5.a(arf.a($$2x, "property"))));
         }

         return new edl($$2, $$4, $$6);
      }
   }
}
