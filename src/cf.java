import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public record cf(Optional<bc<cxm.b, cf.a>> c) implements ds<cxm> {
   public static final Codec<cf> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cf.a.a).optionalFieldOf("modifiers").forGetter(cf::b)).apply($$0, cf::new));

   @Override
   public kl<cxm> a() {
      return km.n;
   }

   public boolean a(cur $$0, cxm $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bc<cxm.b, cf.a>> b() {
      return this.c;
   }

   public static record a(Optional<jm<buu>> b, Optional<UUID> c, Optional<String> d, de.c e, Optional<bux.a> f, Optional<bte> g) implements Predicate<cxm.b> {
      public static final Codec<cf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.c).optionalFieldOf("attribute").forGetter(cf.a::a),
                  kc.f.optionalFieldOf("uuid").forGetter(cf.a::b),
                  Codec.STRING.optionalFieldOf("name").forGetter(cf.a::c),
                  de.c.d.optionalFieldOf("amount", de.c.c).forGetter(cf.a::d),
                  bux.a.f.optionalFieldOf("operation").forGetter(cf.a::e),
                  bte.l.optionalFieldOf("slot").forGetter(cf.a::f)
               )
               .apply($$0, cf.a::new)
      );

      public boolean a(cxm.b $$0) {
         if (this.b.isPresent() && !this.b.get().a($$0.a())) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().equals($$0.b().b())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().equals($$0.b().c())) {
            return false;
         } else if (!this.e.d($$0.b().d())) {
            return false;
         } else {
            return this.f.isPresent() && this.f.get() != $$0.b().e() ? false : !this.g.isPresent() || this.g.get() == $$0.c();
         }
      }

      public Optional<jm<buu>> a() {
         return this.b;
      }

      public Optional<UUID> b() {
         return this.c;
      }

      public Optional<String> c() {
         return this.d;
      }

      public de.c d() {
         return this.e;
      }

      public Optional<bux.a> e() {
         return this.f;
      }

      public Optional<bte> f() {
         return this.g;
      }
   }
}
