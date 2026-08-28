import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eb extends dw<eb.a> {
   @Override
   public Codec<eb.a> a() {
      return eb.a.a;
   }

   public void a(ark $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bg> b) implements dw.a {
      public static final Codec<eb.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(eb.a::a)).apply($$0, eb.a::new));

      public static ao<eb.a> a(bv.a $$0) {
         return an.U.a(new eb.a(Optional.of(bv.a($$0))));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
