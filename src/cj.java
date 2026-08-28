import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cj(Optional<be<cys.b, cj.a>> c) implements dz<cys> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cj.a.a).optionalFieldOf("modifiers").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kt<cys> a() {
      return ku.o;
   }

   public boolean a(cwb $$0, cys $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<be<cys.b, cj.a>> b() {
      return this.c;
   }

   public static record a(Optional<ju<bwd>> b, Optional<ali> c, dj.c d, Optional<bwg.a> e, Optional<bun> f) implements Predicate<cys.b> {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(lz.c).optionalFieldOf("attribute").forGetter(cj.a::a),
                  ali.a.optionalFieldOf("id").forGetter(cj.a::b),
                  dj.c.d.optionalFieldOf("amount", dj.c.c).forGetter(cj.a::c),
                  bwg.a.f.optionalFieldOf("operation").forGetter(cj.a::d),
                  bun.l.optionalFieldOf("slot").forGetter(cj.a::e)
               )
               .apply($$0, cj.a::new)
      );

      public boolean a(cys.b $$0) {
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

      public Optional<ju<bwd>> a() {
         return this.b;
      }

      public Optional<ali> b() {
         return this.c;
      }

      public dj.c c() {
         return this.d;
      }

      public Optional<bwg.a> d() {
         return this.e;
      }

      public Optional<bun> e() {
         return this.f;
      }
   }
}
