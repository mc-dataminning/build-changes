import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edh implements edi {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ja.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, edh::new)
   );
   private final Optional<ja> b;
   private final boolean c;

   private edh(Optional<ja> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static edh a(ja $$0, boolean $$1) {
      return new edh(Optional.of($$0), $$1);
   }

   public static edh a() {
      return new edh(Optional.empty(), false);
   }

   public Optional<ja> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
