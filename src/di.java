import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class di extends dy<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(asi $$0, aly<ewm> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bh> b, aly<ewm> c) implements dy.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(di.a::a), aly.a(mb.bf).fieldOf("loot_table").forGetter(di.a::b)).apply($$0, di.a::new)
      );

      public static ap<di.a> a(aly<ewm> $$0) {
         return ao.Q.a(new di.a(Optional.empty(), $$0));
      }

      public boolean b(aly<ewm> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public aly<ewm> b() {
         return this.c;
      }
   }
}
