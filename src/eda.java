import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eda implements edb {
   public static final Codec<eda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iz.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eda::new)
   );
   private final Optional<iz> b;
   private final boolean c;

   private eda(Optional<iz> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eda a(iz $$0, boolean $$1) {
      return new eda(Optional.of($$0), $$1);
   }

   public static eda a() {
      return new eda(Optional.empty(), false);
   }

   public Optional<iz> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
