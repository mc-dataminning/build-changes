import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cp(cp.a c) implements dy<cyk> {
   public static final Codec<cp> a = cp.a.a.xmap(cp::new, cp::b);

   @Override
   public ks<cyk> a() {
      return kt.ad;
   }

   public boolean a(cvx $$0, cyk $$1) {
      return this.c.a($$1);
   }

   public cp.a b() {
      return this.c;
   }

   public static record a(Optional<cyk.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<cyk> {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyk.a.g.optionalFieldOf("shape").forGetter(cp.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(cp.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(cp.a::c)
               )
               .apply($$0, cp.a::new)
      );

      public boolean a(cyk $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<cyk.a> a() {
         return this.b;
      }

      public Optional<Boolean> b() {
         return this.c;
      }

      public Optional<Boolean> c() {
         return this.d;
      }
   }
}
