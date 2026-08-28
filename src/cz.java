import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cz(Optional<bd<ase<xh>, cz.a>> c, Optional<String> d, Optional<String> e, di.d f, Optional<Boolean> g) implements dy<czd> {
   public static final Codec<cz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bd.a(cz.a.a).optionalFieldOf("pages").forGetter(cz::b),
               Codec.STRING.optionalFieldOf("author").forGetter(cz::c),
               Codec.STRING.optionalFieldOf("title").forGetter(cz::d),
               di.d.d.optionalFieldOf("generation", di.d.c).forGetter(cz::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(cz::f)
            )
            .apply($$0, cz::new)
   );

   @Override
   public ks<czd> a() {
      return kt.S;
   }

   public boolean a(cvx $$0, czd $$1) {
      if (this.d.isPresent() && !this.d.get().equals($$1.e())) {
         return false;
      } else if (this.e.isPresent() && !this.e.get().equals($$1.d().a())) {
         return false;
      } else if (!this.f.d($$1.f())) {
         return false;
      } else {
         return this.g.isPresent() && this.g.get() != $$1.g() ? false : !this.c.isPresent() || this.c.get().a($$1.a());
      }
   }

   public Optional<bd<ase<xh>, cz.a>> b() {
      return this.c;
   }

   public Optional<String> c() {
      return this.d;
   }

   public Optional<String> d() {
      return this.e;
   }

   public di.d e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public static record a(xh b) implements Predicate<ase<xh>> {
      public static final Codec<cz.a> a = xj.a.xmap(cz.a::new, cz.a::a);

      public boolean a(ase<xh> $$0) {
         return $$0.a().equals(this.b);
      }

      public xh a() {
         return this.b;
      }
   }
}
