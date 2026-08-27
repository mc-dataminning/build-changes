import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class duf implements dug {
   public static final Codec<duf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hx.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, duf::new)
   );
   private final Optional<hx> b;
   private final boolean c;

   private duf(Optional<hx> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static duf a(hx $$0, boolean $$1) {
      return new duf(Optional.of($$0), $$1);
   }

   public static duf a() {
      return new duf(Optional.empty(), false);
   }

   public Optional<hx> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
