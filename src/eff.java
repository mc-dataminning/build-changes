import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eff implements efg {
   public static final Codec<eff> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(je.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eff::new)
   );
   private final Optional<je> b;
   private final boolean c;

   private eff(Optional<je> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eff a(je $$0, boolean $$1) {
      return new eff(Optional.of($$0), $$1);
   }

   public static eff a() {
      return new eff(Optional.empty(), false);
   }

   public Optional<je> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
