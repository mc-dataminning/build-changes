import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class du extends dx<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(arn $$0, dal<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static ao<du.a> a(alh $$0) {
      return an.g.a(new du.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bg> b, alh c) implements dx.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(du.a::a), alh.a.fieldOf("recipe").forGetter(du.a::b)).apply($$0, du.a::new)
      );

      public boolean a(dal<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public alh b() {
         return this.c;
      }
   }
}
