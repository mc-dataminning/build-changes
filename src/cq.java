import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cq(cq.a c) implements dz<czb> {
   public static final Codec<cq> a = cq.a.a.xmap(cq::new, cq::b);

   @Override
   public kt<czb> a() {
      return ku.ae;
   }

   public boolean a(cwm $$0, czb $$1) {
      return this.c.a($$1);
   }

   public cq.a b() {
      return this.c;
   }

   public static record a(Optional<czb.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<czb> {
      public static final Codec<cq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  czb.a.g.optionalFieldOf("shape").forGetter(cq.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(cq.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(cq.a::c)
               )
               .apply($$0, cq.a::new)
      );

      public boolean a(czb $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<czb.a> a() {
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
