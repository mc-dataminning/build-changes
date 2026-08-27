import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ae(Optional<afw> a, Optional<aq> b, aj c, Map<String, am<?>> d, ai e, boolean f, Optional<ui> g) {
   public ae(Optional<afw> $$0, Optional<aq> $$1, aj $$2, Map<String, am<?>> $$3, ai $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ae::a));
   }

   private static ui a(aq $$0) {
      ui $$1 = $$0.a();
      n $$2 = $$0.e().b();
      ui $$3 = ul.a($$1.f(), vf.a.a($$2)).f("\n").b($$0.b());
      ui $$4 = $$1.f().a($$1x -> $$1x.a(new uo(uo.a.a, $$3)));
      return ul.a($$4).a($$2);
   }

   public static ui a(af $$0) {
      return $$0.b().i().orElseGet(() -> ui.b($$0.a().toString()));
   }

   public JsonObject a() {
      JsonObject $$0 = new JsonObject();
      this.a.ifPresent($$1x -> $$0.addProperty("parent", $$1x.toString()));
      this.b.ifPresent($$1x -> $$0.add("display", $$1x.k()));
      $$0.add("rewards", this.c.b());
      JsonObject $$1 = new JsonObject();

      for (Entry<String, am<?>> $$2 : this.d.entrySet()) {
         $$1.add($$2.getKey(), $$2.getValue().a());
      }

      $$0.add("criteria", $$1);
      $$0.add("requirements", this.e.b());
      $$0.addProperty("sends_telemetry_event", this.f);
      return $$0;
   }

   public static ae a(JsonObject $$0, bg $$1) {
      Optional<afw> $$2 = $$0.has("parent") ? Optional.of(new afw(aso.i($$0, "parent"))) : Optional.empty();
      Optional<aq> $$3 = $$0.has("display") ? Optional.of(aq.a(aso.u($$0, "display"))) : Optional.empty();
      aj $$4 = $$0.has("rewards") ? aj.a(aso.u($$0, "rewards")) : aj.a;
      Map<String, am<?>> $$5 = am.b(aso.u($$0, "criteria"), $$1);
      if ($$5.isEmpty()) {
         throw new JsonSyntaxException("Advancement criteria cannot be empty");
      } else {
         JsonArray $$6 = aso.a($$0, "requirements", new JsonArray());
         ai $$7;
         if ($$6.isEmpty()) {
            $$7 = ai.a($$5.keySet());
         } else {
            $$7 = ai.a($$6, $$5.keySet());
         }

         boolean $$9 = aso.a($$0, "sends_telemetry_event", false);
         return new ae($$2, $$3, $$4, $$5, $$7, $$9);
      }
   }

   public void a(tl $$0) {
      $$0.a(this.a, tl::a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      this.e.a($$0);
      $$0.a(this.f);
   }

   public static ae b(tl $$0) {
      return new ae($$0.b(tl::t), $$0.b(aq::b), aj.a, Map.of(), new ai($$0), $$0.readBoolean());
   }

   public boolean b() {
      return this.a.isEmpty();
   }

   public Optional<afw> c() {
      return this.a;
   }

   public Optional<aq> d() {
      return this.b;
   }

   public aj e() {
      return this.c;
   }

   public Map<String, am<?>> f() {
      return this.d;
   }

   public ai g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }

   public Optional<ui> i() {
      return this.g;
   }

   public static class a {
      private Optional<afw> a = Optional.empty();
      private Optional<aq> b = Optional.empty();
      private aj c = aj.a;
      private final Builder<String, am<?>> d = ImmutableMap.builder();
      private Optional<ai> e = Optional.empty();
      private ai.a f = ai.a.a;
      private boolean g;

      public static ae.a a() {
         return new ae.a().c();
      }

      public static ae.a b() {
         return new ae.a();
      }

      public ae.a a(af $$0) {
         this.a = Optional.of($$0.a());
         return this;
      }

      @Deprecated(
         forRemoval = true
      )
      public ae.a a(afw $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ae.a a(ckj $$0, ui $$1, ui $$2, @Nullable afw $$3, ar $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new aq($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }

      public ae.a a(cqy $$0, ui $$1, ui $$2, @Nullable afw $$3, ar $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new aq(new ckj($$0.k()), $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }

      public ae.a a(aq $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ae.a a(aj.a $$0) {
         return this.a($$0.a());
      }

      public ae.a a(aj $$0) {
         this.c = $$0;
         return this;
      }

      public ae.a a(String $$0, am<?> $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ae.a a(ai.a $$0) {
         this.f = $$0;
         return this;
      }

      public ae.a a(ai $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ae.a c() {
         this.g = true;
         return this;
      }

      public af b(afw $$0) {
         Map<String, am<?>> $$1 = this.d.buildOrThrow();
         ai $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new af($$0, new ae(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public af a(Consumer<af> $$0, String $$1) {
         af $$2 = this.b(new afw($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
