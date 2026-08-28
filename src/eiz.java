import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eiz implements eja {
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eiz::new)
   );
   private final Optional<jh> b;
   private final boolean c;

   private eiz(Optional<jh> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eiz a(jh $$0, boolean $$1) {
      return new eiz(Optional.of($$0), $$1);
   }

   public static eiz a() {
      return new eiz(Optional.empty(), false);
   }

   public Optional<jh> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
