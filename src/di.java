import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class di extends dy<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(arr $$0, alk<eul> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bh> b, alk<eul> c) implements dy.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(di.a::a), alk.a(ma.bd).fieldOf("loot_table").forGetter(di.a::b)).apply($$0, di.a::new)
      );

      public static ap<di.a> a(alk<eul> $$0) {
         return ao.Q.a(new di.a(Optional.empty(), $$0));
      }

      public boolean b(alk<eul> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public alk<eul> b() {
         return this.c;
      }
   }
}
