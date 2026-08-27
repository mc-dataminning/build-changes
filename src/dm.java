import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dm extends dh<dm.a> {
   @Override
   public Codec<dm.a> a() {
      return dm.a.a;
   }

   public void a(aqu $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bd> b) implements dh.a {
      public static final Codec<dm.a> a = RecordCodecBuilder.create($$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dm.a::a)).apply($$0, dm.a::new));

      public static ao<dm.a> a(bs.a $$0) {
         return an.U.a(new dm.a(Optional.of(bs.a($$0))));
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
