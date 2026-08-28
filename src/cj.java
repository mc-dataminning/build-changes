import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cj(Optional<be<dab.b, cj.a>> c) implements dz<dab> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cj.a.a).optionalFieldOf("modifiers").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kt<dab> a() {
      return ku.o;
   }

   public boolean a(cxk $$0, dab $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<be<dab.b, cj.a>> b() {
      return this.c;
   }

   public static record a(Optional<ju<bxe>> b, Optional<alz> c, dj.c d, Optional<bxh.a> e, Optional<bvo> f) implements Predicate<dab.b> {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.c).optionalFieldOf("attribute").forGetter(cj.a::a),
                  alz.a.optionalFieldOf("id").forGetter(cj.a::b),
                  dj.c.d.optionalFieldOf("amount", dj.c.c).forGetter(cj.a::c),
                  bxh.a.f.optionalFieldOf("operation").forGetter(cj.a::d),
                  bvo.l.optionalFieldOf("slot").forGetter(cj.a::e)
               )
               .apply($$0, cj.a::new)
      );

      public boolean a(dab.b $$0) {
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

      public Optional<ju<bxe>> a() {
         return this.b;
      }

      public Optional<alz> b() {
         return this.c;
      }

      public dj.c c() {
         return this.d;
      }

      public Optional<bxh.a> d() {
         return this.e;
      }

      public Optional<bvo> e() {
         return this.f;
      }
   }
}
