import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ag(Optional<ali> c, Optional<at> d, al e, Map<String, ap<?>> f, ak g, boolean h, Optional<xi> i) {
   private static final Codec<Map<String, ap<?>>> j = Codec.unboundedMap(Codec.STRING, ap.a)
      .validate($$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success($$0));
   public static final Codec<ag> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.optionalFieldOf("parent").forGetter(ag::b),
                  at.a.optionalFieldOf("display").forGetter(ag::c),
                  al.a.optionalFieldOf("rewards", al.b).forGetter(ag::d),
                  j.fieldOf("criteria").forGetter(ag::e),
                  ak.a.optionalFieldOf("requirements").forGetter($$0x -> Optional.of($$0x.f())),
                  Codec.BOOL.optionalFieldOf("sends_telemetry_event", false).forGetter(ag::g)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4, $$5) -> {
                  ak $$6 = $$4.orElseGet(() -> ak.a($$3.keySet()));
                  return new ag($$0x, $$1, $$2, $$3, $$6, $$5);
               })
      )
      .validate(ag::a);
   public static final zg<wt, ag> b = zg.a(ag::a, ag::b);

   public ag(Optional<ali> $$0, Optional<at> $$1, al $$2, Map<String, ap<?>> $$3, ak $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ag::a));
   }

   private static DataResult<ag> a(ag $$0) {
      return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
   }

   private static xi a(at $$0) {
      xi $$1 = $$0.a();
      n $$2 = $$0.e().a();
      xi $$3 = xl.a($$1.f(), yf.a.a($$2)).f("\n").b($$0.b());
      xi $$4 = $$1.f().a($$1x -> $$1x.a(new xo(xo.a.a, $$3)));
      return xl.a($$4).a($$2);
   }

   public static xi a(ah $$0) {
      return $$0.b().h().orElseGet(() -> xi.b($$0.a().toString()));
   }

   private void a(wt $$0) {
      $$0.a(this.c, wf::a);
      at.b.a(ze::a).encode($$0, this.d);
      this.g.a($$0);
      $$0.a(this.h);
   }

   private static ag b(wt $$0) {
      return new ag($$0.b(wf::q), (Optional<at>)at.b.a(ze::a).decode($$0), al.b, Map.of(), new ak($$0), $$0.readBoolean());
   }

   public boolean a() {
      return this.c.isEmpty();
   }

   public void a(azq $$0, jr.a $$1) {
      this.f.forEach(($$2, $$3) -> {
         bi $$4 = new bi($$0.a($$2), $$1);
         $$3.b().a($$4);
      });
   }

   public Optional<ali> b() {
      return this.c;
   }

   public Optional<at> c() {
      return this.d;
   }

   public al d() {
      return this.e;
   }

   public Map<String, ap<?>> e() {
      return this.f;
   }

   public ak f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public Optional<xi> h() {
      return this.i;
   }

   public static class a {
      private Optional<ali> a = Optional.empty();
      private Optional<at> b = Optional.empty();
      private al c = al.b;
      private final Builder<String, ap<?>> d = ImmutableMap.builder();
      private Optional<ak> e = Optional.empty();
      private ak.a f = ak.a.a;
      private boolean g;

      public static ag.a a() {
         return new ag.a().c();
      }

      public static ag.a b() {
         return new ag.a();
      }

      public ag.a a(ah $$0) {
         this.a = Optional.of($$0.a());
         return this;
      }

      @Deprecated(
         forRemoval = true
      )
      public ag.a a(ali $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ag.a a(cwb $$0, xi $$1, xi $$2, @Nullable ali $$3, an $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new at($$0, $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public ag.a a(dfa $$0, xi $$1, xi $$2, @Nullable ali $$3, an $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new at(new cwb($$0.j()), $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public ag.a a(at $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ag.a a(al.a $$0) {
         return this.a($$0.a());
      }

      public ag.a a(al $$0) {
         this.c = $$0;
         return this;
      }

      public ag.a a(String $$0, ap<?> $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ag.a a(ak.a $$0) {
         this.f = $$0;
         return this;
      }

      public ag.a a(ak $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ag.a c() {
         this.g = true;
         return this;
      }

      public ah b(ali $$0) {
         Map<String, ap<?>> $$1 = this.d.buildOrThrow();
         ak $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new ah($$0, new ag(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public ah a(Consumer<ah> $$0, String $$1) {
         ah $$2 = this.b(ali.a($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
