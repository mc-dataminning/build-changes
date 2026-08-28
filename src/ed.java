import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ed extends dy<ed.a> {
   @Override
   public Codec<ed.a> a() {
      return ed.a.a;
   }

   public void a(arq $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bh> b) implements dy.a {
      public static final Codec<ed.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(ed.a::a)).apply($$0, ed.a::new));

      public static ap<ed.a> a(bw.a $$0) {
         return ao.U.a(new ed.a(Optional.of(bw.a($$0))));
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
