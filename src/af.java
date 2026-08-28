import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record af(Optional<akr> c, Optional<as> d, ak e, Map<String, ao<?>> f, aj g, boolean h, Optional<wz> i) {
   private static final Codec<Map<String, ao<?>>> j = Codec.unboundedMap(Codec.STRING, ao.a)
      .validate($$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success($$0));
   public static final Codec<af> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akr.a.optionalFieldOf("parent").forGetter(af::b),
                  as.a.optionalFieldOf("display").forGetter(af::c),
                  ak.a.optionalFieldOf("rewards", ak.b).forGetter(af::d),
                  j.fieldOf("criteria").forGetter(af::e),
                  aj.a.optionalFieldOf("requirements").forGetter($$0x -> Optional.of($$0x.f())),
                  Codec.BOOL.optionalFieldOf("sends_telemetry_event", false).forGetter(af::g)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4, $$5) -> {
                  aj $$6 = $$4.orElseGet(() -> aj.a($$3.keySet()));
                  return new af($$0x, $$1, $$2, $$3, $$6, $$5);
               })
      )
      .validate(af::a);
   public static final yx<wk, af> b = yx.a(af::a, af::b);

   public af(Optional<akr> $$0, Optional<as> $$1, ak $$2, Map<String, ao<?>> $$3, aj $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(af::a));
   }

   private static DataResult<af> a(af $$0) {
      return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
   }

   private static wz a(as $$0) {
      wz $$1 = $$0.a();
      n $$2 = $$0.e().a();
      wz $$3 = xc.a($$1.f(), xw.a.a($$2)).f("\n").b($$0.b());
      wz $$4 = $$1.f().a($$1x -> $$1x.a(new xf(xf.a.a, $$3)));
      return xc.a($$4).a($$2);
   }

   public static wz a(ag $$0) {
      return $$0.b().h().orElseGet(() -> wz.b($$0.a().toString()));
   }

   private void a(wk $$0) {
      $$0.a(this.c, vw::a);
      as.b.a(yv::a).encode($$0, this.d);
      this.g.a($$0);
      $$0.a(this.h);
   }

   private static af b(wk $$0) {
      return new af($$0.b(vw::q), (Optional<as>)as.b.a(yv::a).decode($$0), ak.b, Map.of(), new aj($$0), $$0.readBoolean());
   }

   public boolean a() {
      return this.c.isEmpty();
   }

   public void a(ayu $$0, jn.a $$1) {
      this.f.forEach(($$2, $$3) -> {
         bh $$4 = new bh($$0.a($$2), $$1);
         $$3.b().a($$4);
      });
   }

   public Optional<akr> b() {
      return this.c;
   }

   public Optional<as> c() {
      return this.d;
   }

   public ak d() {
      return this.e;
   }

   public Map<String, ao<?>> e() {
      return this.f;
   }

   public aj f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public Optional<wz> h() {
      return this.i;
   }

   public static class a {
      private Optional<akr> a = Optional.empty();
      private Optional<as> b = Optional.empty();
      private ak c = ak.b;
      private final Builder<String, ao<?>> d = ImmutableMap.builder();
      private Optional<aj> e = Optional.empty();
      private aj.a f = aj.a.a;
      private boolean g;

      public static af.a a() {
         return new af.a().c();
      }

      public static af.a b() {
         return new af.a();
      }

      public af.a a(ag $$0) {
         this.a = Optional.of($$0.a());
         return this;
      }

      @Deprecated(
         forRemoval = true
      )
      public af.a a(akr $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public af.a a(cuq $$0, wz $$1, wz $$2, @Nullable akr $$3, am $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new as($$0, $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public af.a a(dcv $$0, wz $$1, wz $$2, @Nullable akr $$3, am $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new as(new cuq($$0.r()), $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public af.a a(as $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public af.a a(ak.a $$0) {
         return this.a($$0.a());
      }

      public af.a a(ak $$0) {
         this.c = $$0;
         return this;
      }

      public af.a a(String $$0, ao<?> $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public af.a a(aj.a $$0) {
         this.f = $$0;
         return this;
      }

      public af.a a(aj $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public af.a c() {
         this.g = true;
         return this;
      }

      public ag b(akr $$0) {
         Map<String, ao<?>> $$1 = this.d.buildOrThrow();
         aj $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new ag($$0, new af(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public ag a(Consumer<ag> $$0, String $$1) {
         ag $$2 = this.b(akr.a($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
