import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cj(Optional<be<cyw.b, cj.a>> c) implements dz<cyw> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cj.a.a).optionalFieldOf("modifiers").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kt<cyw> a() {
      return ku.o;
   }

   public boolean a(cwf $$0, cyw $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<be<cyw.b, cj.a>> b() {
      return this.c;
   }

   public static record a(Optional<ju<bwh>> b, Optional<all> c, dj.c d, Optional<bwk.a> e, Optional<bur> f) implements Predicate<cyw.b> {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(ma.c).optionalFieldOf("attribute").forGetter(cj.a::a),
                  all.a.optionalFieldOf("id").forGetter(cj.a::b),
                  dj.c.d.optionalFieldOf("amount", dj.c.c).forGetter(cj.a::c),
                  bwk.a.f.optionalFieldOf("operation").forGetter(cj.a::d),
                  bur.l.optionalFieldOf("slot").forGetter(cj.a::e)
               )
               .apply($$0, cj.a::new)
      );

      public boolean a(cyw.b $$0) {
         if (this.b.isPresent() && !this.b.get().a($$0.a())) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().equals($$0.b().b())) {
            return false;
         } else if (!this.d.d($$0.b().c())) {
            return false;
         } else {
            return this.e.isPresent() && this.e.get() != $$0.b().d() ? false : !this.f.isPresent() || this.f.get() == $$0.c();
         }
      }

      public Optional<ju<bwh>> a() {
         return this.b;
      }

      public Optional<all> b() {
         return this.c;
      }

      public dj.c c() {
         return this.d;
      }

      public Optional<bwk.a> d() {
         return this.e;
      }

      public Optional<bur> e() {
         return this.f;
      }
   }
}
