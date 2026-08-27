import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxt implements dxu {
   public static final Codec<dxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dxt::new)
   );
   private final Optional<ib> b;
   private final boolean c;

   private dxt(Optional<ib> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dxt a(ib $$0, boolean $$1) {
      return new dxt(Optional.of($$0), $$1);
   }

   public static dxt a() {
      return new dxt(Optional.empty(), false);
   }

   public Optional<ib> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
