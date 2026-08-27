import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dsd implements dse {
   public static final Codec<dsd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hx.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dsd::new)
   );
   private final Optional<hx> b;
   private final boolean c;

   private dsd(Optional<hx> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dsd a(hx $$0, boolean $$1) {
      return new dsd(Optional.of($$0), $$1);
   }

   public static dsd a() {
      return new dsd(Optional.empty(), false);
   }

   public Optional<hx> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
