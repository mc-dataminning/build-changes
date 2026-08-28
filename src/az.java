import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends dy<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(aro $$0, jq<cxy> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<jq<cxy>> c) implements dy.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(az.a::a), cxy.a.optionalFieldOf("potion").forGetter(az.a::c)).apply($$0, az.a::new)
      );

      public static ap<az.a> b() {
         return ao.l.a(new az.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(jq<cxy> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
