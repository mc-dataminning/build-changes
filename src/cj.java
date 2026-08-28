import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cj(Optional<be<czd.b, cj.a>> c) implements dz<czd> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cj.a.a).optionalFieldOf("modifiers").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kt<czd> a() {
      return ku.o;
   }

   public boolean a(cwm $$0, czd $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<be<czd.b, cj.a>> b() {
      return this.c;
   }

   public static record a(Optional<ju<bwk>> b, Optional<alj> c, dj.c d, Optional<bwn.a> e, Optional<buu> f) implements Predicate<czd.b> {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(ma.c).optionalFieldOf("attribute").forGetter(cj.a::a),
                  alj.a.optionalFieldOf("id").forGetter(cj.a::b),
                  dj.c.d.optionalFieldOf("amount", dj.c.c).forGetter(cj.a::c),
                  bwn.a.f.optionalFieldOf("operation").forGetter(cj.a::d),
                  buu.l.optionalFieldOf("slot").forGetter(cj.a::e)
               )
               .apply($$0, cj.a::new)
      );

      public boolean a(czd.b $$0) {
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

      public Optional<ju<bwk>> a() {
         return this.b;
      }

      public Optional<alj> b() {
         return this.c;
      }

      public dj.c c() {
         return this.d;
      }

      public Optional<bwn.a> d() {
         return this.e;
      }

      public Optional<buu> e() {
         return this.f;
      }
   }
}
