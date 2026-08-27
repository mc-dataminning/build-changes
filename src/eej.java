import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eej implements eek {
   public static final Codec<eej> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ir.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eej::new)
   );
   private final Optional<ir> b;
   private final boolean c;

   private eej(Optional<ir> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eej a(ir $$0, boolean $$1) {
      return new eej(Optional.of($$0), $$1);
   }

   public static eej a() {
      return new eej(Optional.empty(), false);
   }

   public Optional<ir> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
