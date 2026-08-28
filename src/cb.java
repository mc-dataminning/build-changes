import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cb extends dy<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(ary $$0, cxg $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<cu> c) implements dy.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(cb.a::a), cu.a.optionalFieldOf("item").forGetter(cb.a::b)).apply($$0, cb.a::new)
      );

      public static ap<cb.a> a(cu.a $$0) {
         return ao.k.a(new cb.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cxg $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }
   }
}
