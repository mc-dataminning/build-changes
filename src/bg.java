import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bg extends dy<bg.a> {
   @Override
   public Codec<bg.a> a() {
      return bg.a.a;
   }

   public void a(aro $$0, cwb $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<cu> c) implements dy.a {
      public static final Codec<bg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(bg.a::a), cu.a.optionalFieldOf("item").forGetter(bg.a::c)).apply($$0, bg.a::new)
      );

      public static ap<bg.a> b() {
         return ao.A.a(new bg.a(Optional.empty(), Optional.empty()));
      }

      public static ap<bg.a> a(jr<cvx> $$0, dfa $$1) {
         return a(cu.a.a().a($$0, $$1.j()));
      }

      public static ap<bg.a> a(cu.a $$0) {
         return ao.A.a(new bg.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cwb $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
