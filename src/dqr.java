import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqr implements dqs {
   public static final Codec<dqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ht.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dqr::new)
   );
   private final Optional<ht> b;
   private final boolean c;

   private dqr(Optional<ht> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dqr a(ht $$0, boolean $$1) {
      return new dqr(Optional.of($$0), $$1);
   }

   public static dqr a() {
      return new dqr(Optional.empty(), false);
   }

   public Optional<ht> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
