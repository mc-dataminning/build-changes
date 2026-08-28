import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class egi implements egj {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, egi::new)
   );
   private final Optional<jg> b;
   private final boolean c;

   private egi(Optional<jg> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static egi a(jg $$0, boolean $$1) {
      return new egi(Optional.of($$0), $$1);
   }

   public static egi a() {
      return new egi(Optional.empty(), false);
   }

   public Optional<jg> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
