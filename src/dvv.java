import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvv implements dvw {
   public static final Codec<dvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dvv::new)
   );
   private final Optional<hz> b;
   private final boolean c;

   private dvv(Optional<hz> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dvv a(hz $$0, boolean $$1) {
      return new dvv(Optional.of($$0), $$1);
   }

   public static dvv a() {
      return new dvv(Optional.empty(), false);
   }

   public Optional<hz> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
