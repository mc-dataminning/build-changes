import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eis implements eit {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eis::new)
   );
   private final Optional<jh> b;
   private final boolean c;

   private eis(Optional<jh> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eis a(jh $$0, boolean $$1) {
      return new eis(Optional.of($$0), $$1);
   }

   public static eis a() {
      return new eis(Optional.empty(), false);
   }

   public Optional<jh> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
