import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ci(
   Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f, Optional<Boolean> g, Optional<Boolean> h
) {
   public static final Codec<ci> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("forward").forGetter(ci::a),
               Codec.BOOL.optionalFieldOf("backward").forGetter(ci::b),
               Codec.BOOL.optionalFieldOf("left").forGetter(ci::c),
               Codec.BOOL.optionalFieldOf("right").forGetter(ci::d),
               Codec.BOOL.optionalFieldOf("jump").forGetter(ci::e),
               Codec.BOOL.optionalFieldOf("sneak").forGetter(ci::f),
               Codec.BOOL.optionalFieldOf("sprint").forGetter(ci::g)
            )
            .apply($$0, ci::new)
   );

   public boolean a(cqg $$0) {
      return this.a(this.b, $$0.a())
         && this.a(this.c, $$0.b())
         && this.a(this.d, $$0.c())
         && this.a(this.e, $$0.d())
         && this.a(this.f, $$0.e())
         && this.a(this.g, $$0.f())
         && this.a(this.h, $$0.g());
   }

   private boolean a(Optional<Boolean> $$0, boolean $$1) {
      return $$0.<Boolean>map($$1x -> $$1x == $$1).orElse(true);
   }

   public Optional<Boolean> a() {
      return this.b;
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<Boolean> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public Optional<Boolean> g() {
      return this.h;
   }
}
