import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ag(Optional<alj> c, Optional<at> d, al e, Map<String, ap<?>> f, ak g, boolean h, Optional<xj> i) {
   private static final Codec<Map<String, ap<?>>> j = Codec.unboundedMap(Codec.STRING, ap.a)
      .validate($$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success($$0));
   public static final Codec<ag> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alj.a.optionalFieldOf("parent").forGetter(ag::b),
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
   public static final zh<wu, ag> b = zh.a(ag::a, ag::b);

   public ag(Optional<alj> $$0, Optional<at> $$1, al $$2, Map<String, ap<?>> $$3, ak $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ag::a));
   }

   private static DataResult<ag> a(ag $$0) {
      return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
   }

   private static xj a(at $$0) {
      xj $$1 = $$0.a();
      n $$2 = $$0.e().a();
      xj $$3 = xm.a($$1.f(), yg.a.a($$2)).f("\n").b($$0.b());
      xj $$4 = $$1.f().a($$1x -> $$1x.a(new xp(xp.a.a, $$3)));
      return xm.a($$4).a($$2);
   }

   public static xj a(ah $$0) {
      return $$0.b().h().orElseGet(() -> xj.b($$0.a().toString()));
   }

   private void a(wu $$0) {
      $$0.a(this.c, wg::a);
      at.b.a(zf::a).encode($$0, this.d);
      this.g.a($$0);
      $$0.a(this.h);
   }

   private static ag b(wu $$0) {
      return new ag($$0.b(wg::q), (Optional<at>)at.b.a(zf::a).decode($$0), al.b, Map.of(), new ak($$0), $$0.readBoolean());
   }

   public boolean a() {
      return this.c.isEmpty();
   }

   public void a(azs $$0, jr.a $$1) {
      this.f.forEach(($$2, $$3) -> {
         bi $$4 = new bi($$0.a($$2), $$1);
         $$3.b().a($$4);
      });
   }

   public Optional<alj> b() {
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

   public Optional<xj> h() {
      return this.i;
   }

   public static class a {
      private Optional<alj> a = Optional.empty();
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
      public ag.a a(alj $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ag.a a(cwm $$0, xj $$1, xj $$2, @Nullable alj $$3, an $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new at($$0, $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
      }

      public ag.a a(dfl $$0, xj $$1, xj $$2, @Nullable alj $$3, an $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new at(new cwm($$0.j()), $$1, $$2, Optional.ofNullable($$3), $$4, $$5, $$6, $$7));
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

      public ah b(alj $$0) {
         Map<String, ap<?>> $$1 = this.d.buildOrThrow();
         ak $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new ah($$0, new ag(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public ah a(Consumer<ah> $$0, String $$1) {
         ah $$2 = this.b(alj.a($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
