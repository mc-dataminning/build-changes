import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eh extends dy<eh.a> {
   @Override
   public Codec<eh.a> a() {
      return eh.a.a;
   }

   public void a(ary $$0, cho $$1) {
      ewi $$2 = bw.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<eh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(eh.a::a), bw.b.optionalFieldOf("entity").forGetter(eh.a::c)).apply($$0, eh.a::new)
      );

      public static ap<eh.a> b() {
         return ao.y.a(new eh.a(Optional.empty(), Optional.empty()));
      }

      public static ap<eh.a> a(bw.a $$0) {
         return ao.y.a(new eh.a(Optional.empty(), Optional.of(bw.a($$0))));
      }

      public boolean a(ewi $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
