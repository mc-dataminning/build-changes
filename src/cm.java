import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cm(cm.a c) implements ds<cxk> {
   public static final Codec<cm> a = cm.a.a.xmap(cm::new, cm::b);

   @Override
   public kl<cxk> a() {
      return km.T;
   }

   public boolean a(cur $$0, cxk $$1) {
      return this.c.a($$1);
   }

   public cm.a b() {
      return this.c;
   }

   public static record a(Optional<cxk.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<cxk> {
      public static final Codec<cm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cxk.a.g.optionalFieldOf("shape").forGetter(cm.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(cm.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(cm.a::c)
               )
               .apply($$0, cm.a::new)
      );

      public boolean a(cxk $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<cxk.a> a() {
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
