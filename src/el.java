import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class el extends dx<el.a> {
   @Override
   public Codec<el.a> a() {
      return el.a.a;
   }

   public void a(arn $$0, cvx $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<ct> c) implements dx.a {
      public static final Codec<el.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(el.a::a), ct.a.optionalFieldOf("item").forGetter(el.a::b)).apply($$0, el.a::new)
      );

      public static ao<el.a> a(bv.a $$0, ct.a $$1) {
         return an.W.a(new el.a(Optional.of(bv.a($$0)), Optional.of($$1.b())));
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
