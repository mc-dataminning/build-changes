import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public record cf(Optional<bc<cxk.b, cf.a>> c) implements ds<cxk> {
   public static final Codec<cf> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cf.a.a).optionalFieldOf("modifiers").forGetter(cf::b)).apply($$0, cf::new));

   @Override
   public kl<cxk> a() {
      return km.n;
   }

   public boolean a(cup $$0, cxk $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bc<cxk.b, cf.a>> b() {
      return this.c;
   }

   public static record a(Optional<jm<bus>> b, Optional<UUID> c, Optional<String> d, de.c e, Optional<buv.a> f, Optional<btc> g) implements Predicate<cxk.b> {
      public static final Codec<cf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.c).optionalFieldOf("attribute").forGetter(cf.a::a),
                  kc.f.optionalFieldOf("uuid").forGetter(cf.a::b),
                  Codec.STRING.optionalFieldOf("name").forGetter(cf.a::c),
                  de.c.d.optionalFieldOf("amount", de.c.c).forGetter(cf.a::d),
                  buv.a.f.optionalFieldOf("operation").forGetter(cf.a::e),
                  btc.l.optionalFieldOf("slot").forGetter(cf.a::f)
               )
               .apply($$0, cf.a::new)
      );

      public boolean a(cxk.b $$0) {
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

      public Optional<jm<bus>> a() {
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

      public Optional<buv.a> e() {
         return this.f;
      }

      public Optional<btc> f() {
         return this.g;
      }
   }
}
