import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class di extends dl<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(asc $$0, dfg<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static ar<di.a> a(alq<dfb<?>> $$0) {
      return aq.g.a(new di.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bj> b, alq<dfb<?>> c) implements dl.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(di.a::a), dfb.b.fieldOf("recipe").forGetter(di.a::b)).apply($$0, di.a::new)
      );

      public boolean a(dfg<?> $$0) {
         return this.c == $$0.a();
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public alq<dfb<?>> b() {
         return this.c;
      }
   }
}
