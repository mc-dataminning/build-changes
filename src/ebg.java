import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebg implements ebh {
   public static final Codec<ebg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(in.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, ebg::new)
   );
   private final Optional<in> b;
   private final boolean c;

   private ebg(Optional<in> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ebg a(in $$0, boolean $$1) {
      return new ebg(Optional.of($$0), $$1);
   }

   public static ebg a() {
      return new ebg(Optional.empty(), false);
   }

   public Optional<in> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
