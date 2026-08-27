import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dry implements drz {
   public static final Codec<dry> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ht.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dry::new)
   );
   private final Optional<ht> b;
   private final boolean c;

   private dry(Optional<ht> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dry a(ht $$0, boolean $$1) {
      return new dry(Optional.of($$0), $$1);
   }

   public static dry a() {
      return new dry(Optional.empty(), false);
   }

   public Optional<ht> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
