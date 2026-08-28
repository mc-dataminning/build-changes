import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dx extends dy<dx.a> {
   @Override
   public Codec<dx.a> a() {
      return dx.a.a;
   }

   public void a(arq $$0, cwm $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<cu> c) implements dy.a {
      public static final Codec<dx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(dx.a::a), cu.a.optionalFieldOf("item").forGetter(dx.a::b)).apply($$0, dx.a::new)
      );

      public static ap<dx.a> a(Optional<cu> $$0) {
         return ao.G.a(new dx.a(Optional.empty(), $$0));
      }

      public static ap<dx.a> a(jr<cwi> $$0, dfl $$1) {
         return ao.G.a(new dx.a(Optional.empty(), Optional.of(cu.a.a().a($$0, $$1).b())));
      }

      public boolean a(cwm $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
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
