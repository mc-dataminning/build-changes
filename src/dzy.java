import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dzy implements dzz {
   public static final Codec<dzy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dzy::new)
   );
   private final Optional<ib> b;
   private final boolean c;

   private dzy(Optional<ib> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dzy a(ib $$0, boolean $$1) {
      return new dzy(Optional.of($$0), $$1);
   }

   public static dzy a() {
      return new dzy(Optional.empty(), false);
   }

   public Optional<ib> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
