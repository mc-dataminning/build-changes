import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dv extends dy<dv.a> {
   @Override
   public Codec<dv.a> a() {
      return dv.a.a;
   }

   public void a(arr $$0, dav<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static ap<dv.a> a(all $$0) {
      return ao.g.a(new dv.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bh> b, all c) implements dy.a {
      public static final Codec<dv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(dv.a::a), all.a.fieldOf("recipe").forGetter(dv.a::b)).apply($$0, dv.a::new)
      );

      public boolean a(dav<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public all b() {
         return this.c;
      }
   }
}
