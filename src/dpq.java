import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpq implements dpr {
   public static final Codec<dpq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gu.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dpq::new)
   );
   private final Optional<gu> b;
   private final boolean c;

   private dpq(Optional<gu> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dpq a(gu $$0, boolean $$1) {
      return new dpq(Optional.of($$0), $$1);
   }

   public static dpq a() {
      return new dpq(Optional.empty(), false);
   }

   public Optional<gu> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
