import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dtx implements dty {
   public static final Codec<dtx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hx.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dtx::new)
   );
   private final Optional<hx> b;
   private final boolean c;

   private dtx(Optional<hx> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dtx a(hx $$0, boolean $$1) {
      return new dtx(Optional.of($$0), $$1);
   }

   public static dtx a() {
      return new dtx(Optional.empty(), false);
   }

   public Optional<hx> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
