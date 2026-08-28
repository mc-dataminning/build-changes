import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eft implements efu {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(je.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eft::new)
   );
   private final Optional<je> b;
   private final boolean c;

   private eft(Optional<je> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eft a(je $$0, boolean $$1) {
      return new eft(Optional.of($$0), $$1);
   }

   public static eft a() {
      return new eft(Optional.empty(), false);
   }

   public Optional<je> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
