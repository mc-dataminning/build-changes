import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record da(Optional<be<asi<xl>, da.a>> c, Optional<String> d, Optional<String> e, dj.d f, Optional<Boolean> g) implements dz<czn> {
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
   public kt<czn> a() {
      return ku.T;
   }

   public boolean a(cwf $$0, czn $$1) {
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

   public Optional<be<asi<xl>, da.a>> b() {
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

   public static record a(xl b) implements Predicate<asi<xl>> {
      public static final Codec<da.a> a = xn.a.xmap(da.a::new, da.a::a);

      public boolean a(asi<xl> $$0) {
         return $$0.a().equals(this.b);
      }

      public xl a() {
         return this.b;
      }
   }
}
