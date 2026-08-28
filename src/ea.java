import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ea extends dv<ea.a> {
   @Override
   public Codec<ea.a> a() {
      return ea.a.a;
   }

   public void a(arh $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bg> b) implements dv.a {
      public static final Codec<ea.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ea.a::a)).apply($$0, ea.a::new));

      public static ao<ea.a> a(bv.a $$0) {
         return an.U.a(new ea.a(Optional.of(bv.a($$0))));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
