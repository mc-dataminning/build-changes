import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dwc implements dwd {
   public static final Codec<dwc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dwc::new)
   );
   private final Optional<hz> b;
   private final boolean c;

   private dwc(Optional<hz> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dwc a(hz $$0, boolean $$1) {
      return new dwc(Optional.of($$0), $$1);
   }

   public static dwc a() {
      return new dwc(Optional.empty(), false);
   }

   public Optional<hz> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
