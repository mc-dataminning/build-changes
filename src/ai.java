import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ai(Optional<alk> c, Optional<av> d, an e, Map<String, ar<?>> f, am g, boolean h, Optional<xc> i) {
   private static final Codec<Map<String, ar<?>>> j = Codec.unboundedMap(Codec.STRING, ar.a)
      .validate($$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success($$0));
   public static final Codec<ai> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alk.a.optionalFieldOf("parent").forGetter(ai::b),
                  av.a.optionalFieldOf("display").forGetter(ai::c),
                  an.a.optionalFieldOf("rewards", an.b).forGetter(ai::d),
                  j.fieldOf("criteria").forGetter(ai::e),
                  am.a.optionalFieldOf("requirements").forGetter($$0x -> Optional.of($$0x.f())),
                  Codec.BOOL.optionalFieldOf("sends_telemetry_event", false).forGetter(ai::g)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4, $$5) -> {
                  am $$6 = $$4.orElseGet(() -> am.a($$3.keySet()));
                  return new ai($$0x, $$1, $$2, $$3, $$6, $$5);
               })
      )
      .validate(ai::a);
   public static final za<wn, ai> b = za.a(ai::a, ai::b);

   public ai(Optional<alk> $$0, Optional<av> $$1, an $$2, Map<String, ar<?>> $$3, am $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ai::a));
   }

   private static DataResult<ai> a(ai $$0) {
      return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
   }

   private static xc a(av $$0) {
      xc $$1 = $$0.a();
      o $$2 = $$0.e().a();
      xc $$3 = xf.a($$1.f(), xz.a.a($$2)).f("\n").b($$0.b());
      xc $$4 = $$1.f().a($$1x -> $$1x.a(new xi.e($$3)));
      return xf.a($$4).a($$2);
   }

   public static xc a(aj $$0) {
      return $$0.b().h().orElseGet(() -> xc.b($$0.a().toString()));
   }

   private void a(wn $$0) {
      $$0.a(this.c, vy::a);
      av.b.a(yy::a).encode($$0, this.d);
      this.g.a($$0);
      $$0.a(this.h);
   }

   private static ai b(wn $$0) {
      return new ai($$0.b(vy::q), (Optional<av>)av.b.a(yy::a).decode($$0), an.b, Map.of(), new am($$0), $$0.readBoolean());
   }

   public boolean a() {
      return this.c.isEmpty();
   }

   public void a(azx $$0, jh.a $$1) {
      this.f.forEach(($$2, $$3) -> {
         bk $$4 = new bk($$0.a($$2), $$1);
         $$3.b().a($$4);
      });
   }

   public Optional<alk> b() {
      return this.c;
   }

   public Optional<av> c() {
      return this.d;
   }

   public an d() {
      return this.e;
   }

   public Map<String, ar<?>> e() {
      return this.f;
   }

   public am f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public Optional<xc> h() {
      return this.i;
   }

   public static class a {
      private Optional<alk> a = Optional.empty();
      private Optional<av> b = Optional.empty();
      private an c = an.b;
      private final Builder<String, ar<?>> d = ImmutableMap.builder();
      private Optional<am> e = Optional.empty();
      private am.a f = am.a.a;
      private boolean g;

      public static ai.a a() {
         return new ai.a().c();
      }

      public static ai.a b() {
         return new ai.a();
      }

      public ai.a a(aj $$0) {
         this.a = Optional.of($$0.a());
         return this;
      }

      @Deprecated(
         forRemoval = true
      )
      public ai.a a(alk $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ai.a a(daa $$0, xc $$1, xc $$2, @Nullable alk $$3, ap $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new av($$0, $$1, $$2, Optional.ofNullable($$3).map(ix::new), $$4, $$5, $$6, $$7));
      }

      public ai.a a(djy $$0, xc $$1, xc $$2, @Nullable alk $$3, ap $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new av(new daa($$0.h()), $$1, $$2, Optional.ofNullable($$3).map(ix::new), $$4, $$5, $$6, $$7));
      }

      public ai.a a(av $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ai.a a(an.a $$0) {
         return this.a($$0.a());
      }

      public ai.a a(an $$0) {
         this.c = $$0;
         return this;
      }

      public ai.a a(String $$0, ar<?> $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ai.a a(am.a $$0) {
         this.f = $$0;
         return this;
      }

      public ai.a a(am $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ai.a c() {
         this.g = true;
         return this;
      }

      public aj b(alk $$0) {
         Map<String, ar<?>> $$1 = this.d.buildOrThrow();
         am $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new aj($$0, new ai(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public aj a(Consumer<aj> $$0, String $$1) {
         aj $$2 = this.b(alk.a($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
