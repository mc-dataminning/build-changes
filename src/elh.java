import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elh implements eli {
   public static final Codec<elh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iu.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, elh::new)
   );
   private final Optional<iu> b;
   private final boolean c;

   private elh(Optional<iu> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static elh a(iu $$0, boolean $$1) {
      return new elh(Optional.of($$0), $$1);
   }

   public static elh a() {
      return new elh(Optional.empty(), false);
   }

   public Optional<iu> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
