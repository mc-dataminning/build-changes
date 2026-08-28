import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emz implements enb {
   public static final Codec<emz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, emz::new)
   );
   private final Optional<iw> b;
   private final boolean c;

   private emz(Optional<iw> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static emz a(iw $$0, boolean $$1) {
      return new emz(Optional.of($$0), $$1);
   }

   public static emz a() {
      return new emz(Optional.empty(), false);
   }

   public Optional<iw> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
