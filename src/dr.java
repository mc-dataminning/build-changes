import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends dl<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(asc $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bj> b) implements dl.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(dr.a::a)).apply($$0, dr.a::new));

      public static ar<dr.a> a(bz.a $$0) {
         return aq.U.a(new dr.a(Optional.of(bz.a($$0))));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
