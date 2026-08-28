import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dr<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(arc $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bf> b) implements dr.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dw.a::a)).apply($$0, dw.a::new));

      public static an<dw.a> a(bu.a $$0) {
         return am.U.a(new dw.a(Optional.of(bu.a($$0))));
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
