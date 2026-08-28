import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eed implements eee {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eed::new)
   );
   private final Optional<jd> b;
   private final boolean c;

   private eed(Optional<jd> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eed a(jd $$0, boolean $$1) {
      return new eed(Optional.of($$0), $$1);
   }

   public static eed a() {
      return new eed(Optional.empty(), false);
   }

   public Optional<jd> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
