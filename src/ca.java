import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ca extends dx<ca.a> {
   @Override
   public Codec<ca.a> a() {
      return ca.a.a;
   }

   public void a(arn $$0, cvx $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<ct> c) implements dx.a {
      public static final Codec<ca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ca.a::a), ct.a.optionalFieldOf("item").forGetter(ca.a::b)).apply($$0, ca.a::new)
      );

      public static ao<ca.a> a(ct.a $$0) {
         return an.k.a(new ca.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cvx $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<ct> b() {
         return this.c;
      }
   }
}
