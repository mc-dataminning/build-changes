import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ch(Optional<bd<cyn.b, ch.a>> c) implements dx<cyn> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(ch.a.a).optionalFieldOf("modifiers").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public kr<cyn> a() {
      return ks.n;
   }

   public boolean a(cvs $$0, cyn $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bd<cyn.b, ch.a>> b() {
      return this.c;
   }

   public static record a(Optional<js<bvp>> b, Optional<ale> c, dh.c d, Optional<bvs.a> e, Optional<bua> f) implements Predicate<cyn.b> {
      public static final Codec<ch.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.a(lw.c).optionalFieldOf("attribute").forGetter(ch.a::a),
                  ale.a.optionalFieldOf("id").forGetter(ch.a::b),
                  dh.c.d.optionalFieldOf("amount", dh.c.c).forGetter(ch.a::c),
                  bvs.a.f.optionalFieldOf("operation").forGetter(ch.a::d),
                  bua.l.optionalFieldOf("slot").forGetter(ch.a::e)
               )
               .apply($$0, ch.a::new)
      );

      public boolean a(cyn.b $$0) {
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

      public Optional<js<bvp>> a() {
         return this.b;
      }

      public Optional<ale> b() {
         return this.c;
      }

      public dh.c c() {
         return this.d;
      }

      public Optional<bvs.a> d() {
         return this.e;
      }

      public Optional<bua> e() {
         return this.f;
      }
   }
}
