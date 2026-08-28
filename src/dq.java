import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends dk<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(arr $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bj> b) implements dk.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create($$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(dq.a::a)).apply($$0, dq.a::new));

      public static ar<dq.a> a(by.a $$0) {
         return aq.U.a(new dq.a(Optional.of(by.a($$0))));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
