import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends dv<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(arh $$0, czv<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static ao<dt.a> a(alb $$0) {
      return an.g.a(new dt.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bg> b, alb c) implements dv.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dt.a::a), alb.a.fieldOf("recipe").forGetter(dt.a::b)).apply($$0, dt.a::new)
      );

      public boolean a(czv<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public alb b() {
         return this.c;
      }
   }
}
