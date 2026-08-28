import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edo implements edp {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ja.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, edo::new)
   );
   private final Optional<ja> b;
   private final boolean c;

   private edo(Optional<ja> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static edo a(ja $$0, boolean $$1) {
      return new edo(Optional.of($$0), $$1);
   }

   public static edo a() {
      return new edo(Optional.empty(), false);
   }

   public Optional<ja> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
