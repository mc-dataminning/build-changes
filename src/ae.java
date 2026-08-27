import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ae(Optional<akm> c, Optional<ar> d, aj e, Map<String, an<?>> f, ai g, boolean h, Optional<wx> i) {
   private static final Codec<Map<String, an<?>>> j = Codec.unboundedMap(Codec.STRING, an.a)
      .validate($$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success($$0));
   public static final Codec<ae> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akm.a.optionalFieldOf("parent").forGetter(ae::b),
                  ar.a.optionalFieldOf("display").forGetter(ae::c),
                  aj.a.optionalFieldOf("rewards", aj.b).forGetter(ae::d),
                  j.fieldOf("criteria").forGetter(ae::e),
                  ai.a.optionalFieldOf("requirements").forGetter($$0x -> Optional.of($$0x.f())),
                  Codec.BOOL.optionalFieldOf("sends_telemetry_event", false).forGetter(ae::g)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4, $$5) -> {
                  ai $$6 = $$4.orElseGet(() -> ai.a($$3.keySet()));
                  return new ae($$0x, $$1, $$2, $$3, $$6, $$5);
               })
      )
      .validate(ae::a);
   public static final yv<wi, ae> b = yv.a(ae::a, ae::b);

   public ae(Optional<akm> $$0, Optional<ar> $$1, aj $$2, Map<String, an<?>> $$3, ai $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ae::a));
   }

   private static DataResult<ae> a(ae $$0) {
      return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
   }

   private static wx a(ar $$0) {
      wx $$1 = $$0.a();
      n $$2 = $$0.e().a();
      wx $$3 = xa.a($$1.f(), xu.a.a($$2)).f("\n").b($$0.b());
      wx $$4 = $$1.f().a($$1x -> $$1x.a(new xd(xd.a.a, $$3)));
      return xa.a($$4).a($$2);
   }

   public static wx a(af $$0) {
      return $$0.b().h().orElseGet(() -> wx.b($$0.a().toString()));
   }

   private void a(wi $$0) {
      $$0.a(this.c, vx::a);
      ar.b.a(yt::a).encode($$0, this.d);
      this.g.a($$0);
      $$0.a(this.h);
   }

   private static ae b(wi $$0) {
      return new ae($$0.b(vx::q), (Optional<ar>)ar.b.a(yt::a).decode($$0), aj.b, Map.of(), new ai($$0), $$0.readBoolean());
   }

   public boolean a() {
      return this.c.isEmpty();
   }

   public void a(ayi $$0, iy.a $$1) {
      this.f.forEach(($$2, $$3) -> {
         bd $$4 = new bd($$0.a($$2), $$1);
         $$3.b().a($$4);
      });
   }

   public Optional<akm> b() {
      return this.c;
   }

   public Optional<ar> c() {
      return this.d;
   }

   public aj d() {
      return this.e;
   }

   public Map<String, an<?>> e() {
      return this.f;
   }

   public ai f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public Optional<wx> h() {
      return this.i;
   }

   public static class a {
      private Optional<akm> a = Optional.empty();
      private Optional<ar> b = Optional.empty();
      private aj c = aj.b;
      private final Builder<String, an<?>> d = ImmutableMap.builder();
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
      public ae.a a(akm $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ae.a a(cto $$0, wx $$1, wx $$2, @Nullable akm $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new ar($$0, $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public ae.a a(daw $$0, wx $$1, wx $$2, @Nullable akm $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new ar(new cto($$0.q()), $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public ae.a a(ar $$0) {
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

      public ae.a a(String $$0, an<?> $$1) {
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

      public af b(akm $$0) {
         Map<String, an<?>> $$1 = this.d.buildOrThrow();
         ai $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new af($$0, new ae(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public af a(Consumer<af> $$0, String $$1) {
         af $$2 = this.b(new akm($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
