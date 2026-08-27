import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class da extends cx<da.a> {
   @Override
   public Codec<da.a> a() {
      return da.a.a;
   }

   public void a(apb $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bc> b) implements cx.a {
      public static final Codec<da.a> a = RecordCodecBuilder.create($$0 -> $$0.group(avu.a(br.b, "player").forGetter(da.a::a)).apply($$0, da.a::new));

      public static an<da.a> a(br.a $$0) {
         return am.U.a(new da.a(Optional.of(br.a($$0))));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
