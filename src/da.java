import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record da(Optional<be<asz<xv>, da.a>> c, Optional<String> d, Optional<String> e, dj.d f, Optional<Boolean> g) implements dz<daw> {
   public static final Codec<da> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               be.a(da.a.a).optionalFieldOf("pages").forGetter(da::b),
               Codec.STRING.optionalFieldOf("author").forGetter(da::c),
               Codec.STRING.optionalFieldOf("title").forGetter(da::d),
               dj.d.d.optionalFieldOf("generation", dj.d.c).forGetter(da::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(da::f)
            )
            .apply($$0, da::new)
   );

   @Override
   public kt<daw> a() {
      return ku.T;
   }

   public boolean a(cxo $$0, daw $$1) {
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

   public Optional<be<asz<xv>, da.a>> b() {
      return this.c;
   }

   public Optional<String> c() {
      return this.d;
   }

   public Optional<String> d() {
      return this.e;
   }

   public dj.d e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public static record a(xv b) implements Predicate<asz<xv>> {
      public static final Codec<da.a> a = xx.a.xmap(da.a::new, da.a::a);

      public boolean a(asz<xv> $$0) {
         return $$0.a().equals(this.b);
      }

      public xv a() {
         return this.b;
      }
   }
}
