import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ae(Optional<ahd> b, Optional<ar> c, aj d, Map<String, an<?>> e, ai f, boolean g, Optional<vd> h) {
   private static final Codec<Map<String, an<?>>> i = atq.a(
      Codec.unboundedMap(Codec.STRING, an.a), $$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success($$0)
   );
   public static final Codec<ae> a = atq.a(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atq.a(ahd.a, "parent").forGetter(ae::b),
                  atq.a(ar.a, "display").forGetter(ae::c),
                  atq.a(aj.a, "rewards", aj.b).forGetter(ae::d),
                  i.fieldOf("criteria").forGetter(ae::e),
                  atq.a(ai.a, "requirements").forGetter($$0x -> Optional.of($$0x.f())),
                  atq.a(Codec.BOOL, "sends_telemetry_event", false).forGetter(ae::g)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4, $$5) -> {
                  ai $$6 = $$4.orElseGet(() -> ai.a($$3.keySet()));
                  return new ae($$0x, $$1, $$2, $$3, $$6, $$5);
               })
      ),
      ae::a
   );

   public ae(Optional<ahd> $$0, Optional<ar> $$1, aj $$2, Map<String, an<?>> $$3, ai $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ae::a));
   }

   private static DataResult<ae> a(ae $$0) {
      return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
   }

   private static vd a(ar $$0) {
      vd $$1 = $$0.a();
      n $$2 = $$0.e().a();
      vd $$3 = vg.a($$1.f(), wa.a.a($$2)).f("\n").b($$0.b());
      vd $$4 = $$1.f().a($$1x -> $$1x.a(new vj(vj.a.a, $$3)));
      return vg.a($$4).a($$2);
   }

   public static vd a(af $$0) {
      return $$0.b().h().orElseGet(() -> vd.b($$0.a().toString()));
   }

   public void a(ug $$0) {
      $$0.a(this.b, ug::a);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
      this.f.a($$0);
      $$0.a(this.g);
   }

   public static ae b(ug $$0) {
      return new ae($$0.b(ug::t), $$0.b(ar::b), aj.b, Map.of(), new ai($$0), $$0.readBoolean());
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public void a(aun $$0, egt $$1) {
      this.e.forEach(($$2, $$3) -> {
         bc $$4 = new bc($$0.a($$2), $$1);
         $$3.b().a($$4);
      });
   }

   public static class a {
      private Optional<ahd> a = Optional.empty();
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
      public ae.a a(ahd $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ae.a a(cmr $$0, vd $$1, vd $$2, @Nullable ahd $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new ar($$0, $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public ae.a a(cth $$0, vd $$1, vd $$2, @Nullable ahd $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new ar(new cmr($$0.k()), $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
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

      public af b(ahd $$0) {
         Map<String, an<?>> $$1 = this.d.buildOrThrow();
         ai $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new af($$0, new ae(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public af a(Consumer<af> $$0, String $$1) {
         af $$2 = this.b(new ahd($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
