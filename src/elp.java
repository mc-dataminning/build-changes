import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elp implements elq {
   public static final Codec<elp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iu.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, elp::new)
   );
   private final Optional<iu> b;
   private final boolean c;

   private elp(Optional<iu> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static elp a(iu $$0, boolean $$1) {
      return new elp(Optional.of($$0), $$1);
   }

   public static elp a() {
      return new elp(Optional.empty(), false);
   }

   public Optional<iu> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
