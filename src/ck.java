import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ck(Optional<bf<czf.b, ck.a>> c) implements ea<czf> {
   public static final Codec<ck> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(ck.a.a).optionalFieldOf("modifiers").forGetter(ck::b)).apply($$0, ck::new));

   @Override
   public ku<czf> a() {
      return kv.o;
   }

   public boolean a(cwo $$0, czf $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bf<czf.b, ck.a>> b() {
      return this.c;
   }

   public static record a(Optional<jv<bwj>> b, Optional<akv> c, dk.c d, Optional<bwm.a> e, Optional<but> f) implements Predicate<czf.b> {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.c).optionalFieldOf("attribute").forGetter(ck.a::a),
                  akv.a.optionalFieldOf("id").forGetter(ck.a::b),
                  dk.c.d.optionalFieldOf("amount", dk.c.c).forGetter(ck.a::c),
                  bwm.a.f.optionalFieldOf("operation").forGetter(ck.a::d),
                  but.l.optionalFieldOf("slot").forGetter(ck.a::e)
               )
               .apply($$0, ck.a::new)
      );

      public boolean a(czf.b $$0) {
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

      public Optional<jv<bwj>> a() {
         return this.b;
      }

      public Optional<akv> b() {
         return this.c;
      }

      public dk.c c() {
         return this.d;
      }

      public Optional<bwm.a> d() {
         return this.e;
      }

      public Optional<but> e() {
         return this.f;
      }
   }
}
