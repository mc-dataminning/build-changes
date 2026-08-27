import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eax implements eay {
   public static final Codec<eax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(im.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eax::new)
   );
   private final Optional<im> b;
   private final boolean c;

   private eax(Optional<im> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eax a(im $$0, boolean $$1) {
      return new eax(Optional.of($$0), $$1);
   }

   public static eax a() {
      return new eax(Optional.empty(), false);
   }

   public Optional<im> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
