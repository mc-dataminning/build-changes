import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ah(Optional<alg> c, Optional<au> d, am e, Map<String, aq<?>> f, al g, boolean h, Optional<wy> i) {
   private static final Codec<Map<String, aq<?>>> j = Codec.unboundedMap(Codec.STRING, aq.a)
      .validate($$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success($$0));
   public static final Codec<ah> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.optionalFieldOf("parent").forGetter(ah::b),
                  au.a.optionalFieldOf("display").forGetter(ah::c),
                  am.a.optionalFieldOf("rewards", am.b).forGetter(ah::d),
                  j.fieldOf("criteria").forGetter(ah::e),
                  al.a.optionalFieldOf("requirements").forGetter($$0x -> Optional.of($$0x.f())),
                  Codec.BOOL.optionalFieldOf("sends_telemetry_event", false).forGetter(ah::g)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4, $$5) -> {
                  al $$6 = $$4.orElseGet(() -> al.a($$3.keySet()));
                  return new ah($$0x, $$1, $$2, $$3, $$6, $$5);
               })
      )
      .validate(ah::a);
   public static final yw<wj, ah> b = yw.a(ah::a, ah::b);

   public ah(Optional<alg> $$0, Optional<au> $$1, am $$2, Map<String, aq<?>> $$3, al $$4, boolean $$5) {
      this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ah::a));
   }

   private static DataResult<ah> a(ah $$0) {
      return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
   }

   private static wy a(au $$0) {
      wy $$1 = $$0.a();
      n $$2 = $$0.e().a();
      wy $$3 = xb.a($$1.f(), xv.a.a($$2)).f("\n").b($$0.b());
      wy $$4 = $$1.f().a($$1x -> $$1x.a(new xe.e($$3)));
      return xb.a($$4).a($$2);
   }

   public static wy a(ai $$0) {
      return $$0.b().h().orElseGet(() -> wy.b($$0.a().toString()));
   }

   private void a(wj $$0) {
      $$0.a(this.c, vu::a);
      au.b.a(yu::a).encode($$0, this.d);
      this.g.a($$0);
      $$0.a(this.h);
   }

   private static ah b(wj $$0) {
      return new ah($$0.b(vu::q), (Optional<au>)au.b.a(yu::a).decode($$0), am.b, Map.of(), new al($$0), $$0.readBoolean());
   }

   public boolean a() {
      return this.c.isEmpty();
   }

   public void a(azt $$0, jf.a $$1) {
      this.f.forEach(($$2, $$3) -> {
         bj $$4 = new bj($$0.a($$2), $$1);
         $$3.b().a($$4);
      });
   }

   public Optional<alg> b() {
      return this.c;
   }

   public Optional<au> c() {
      return this.d;
   }

   public am d() {
      return this.e;
   }

   public Map<String, aq<?>> e() {
      return this.f;
   }

   public al f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public Optional<wy> h() {
      return this.i;
   }

   public static class a {
      private Optional<alg> a = Optional.empty();
      private Optional<au> b = Optional.empty();
      private am c = am.b;
      private final Builder<String, aq<?>> d = ImmutableMap.builder();
      private Optional<al> e = Optional.empty();
      private al.a f = al.a.a;
      private boolean g;

      public static ah.a a() {
         return new ah.a().c();
      }

      public static ah.a b() {
         return new ah.a();
      }

      public ah.a a(ai $$0) {
         this.a = Optional.of($$0.a());
         return this;
      }

      @Deprecated(
         forRemoval = true
      )
      public ah.a a(alg $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ah.a a(czd $$0, wy $$1, wy $$2, @Nullable alg $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new au($$0, $$1, $$2, Optional.ofNullable($$3).map(iv::new), $$4, $$5, $$6, $$7));
      }

      public ah.a a(diz $$0, wy $$1, wy $$2, @Nullable alg $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new au(new czd($$0.h()), $$1, $$2, Optional.ofNullable($$3).map(iv::new), $$4, $$5, $$6, $$7));
      }

      public ah.a a(au $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ah.a a(am.a $$0) {
         return this.a($$0.a());
      }

      public ah.a a(am $$0) {
         this.c = $$0;
         return this;
      }

      public ah.a a(String $$0, aq<?> $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ah.a a(al.a $$0) {
         this.f = $$0;
         return this;
      }

      public ah.a a(al $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ah.a c() {
         this.g = true;
         return this;
      }

      public ai b(alg $$0) {
         Map<String, aq<?>> $$1 = this.d.buildOrThrow();
         al $$2 = this.e.orElseGet(() -> this.f.create($$1.keySet()));
         return new ai($$0, new ah(this.a, this.b, this.c, $$1, $$2, this.g));
      }

      public ai a(Consumer<ai> $$0, String $$1) {
         ai $$2 = this.b(alg.a($$1));
         $$0.accept($$2);
         return $$2;
      }
   }
}
