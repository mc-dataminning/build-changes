import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dtw implements dtx {
   public static final Codec<dtw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hx.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dtw::new)
   );
   private final Optional<hx> b;
   private final boolean c;

   private dtw(Optional<hx> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dtw a(hx $$0, boolean $$1) {
      return new dtw(Optional.of($$0), $$1);
   }

   public static dtw a() {
      return new dtw(Optional.empty(), false);
   }

   public Optional<hx> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
