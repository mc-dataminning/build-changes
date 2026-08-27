import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpp implements dpq {
   public static final Codec<dpp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gu.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dpp::new)
   );
   private final Optional<gu> b;
   private final boolean c;

   private dpp(Optional<gu> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dpp a(gu $$0, boolean $$1) {
      return new dpp(Optional.of($$0), $$1);
   }

   public static dpp a() {
      return new dpp(Optional.empty(), false);
   }

   public Optional<gu> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
