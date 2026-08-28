import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cr(cr.a c) implements ea<czc> {
   public static final Codec<cr> a = cr.a.a.xmap(cr::new, cr::b);

   @Override
   public ku<czc> a() {
      return kv.ae;
   }

   public boolean a(cwn $$0, czc $$1) {
      return this.c.a($$1);
   }

   public cr.a b() {
      return this.c;
   }

   public static record a(Optional<czc.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<czc> {
      public static final Codec<cr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  czc.a.g.optionalFieldOf("shape").forGetter(cr.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(cr.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(cr.a::c)
               )
               .apply($$0, cr.a::new)
      );

      public boolean a(czc $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<czc.a> a() {
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
