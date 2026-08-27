import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpu implements dpv {
   public static final Codec<dpu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gw.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dpu::new)
   );
   private final Optional<gw> b;
   private final boolean c;

   private dpu(Optional<gw> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dpu a(gw $$0, boolean $$1) {
      return new dpu(Optional.of($$0), $$1);
   }

   public static dpu a() {
      return new dpu(Optional.empty(), false);
   }

   public Optional<gw> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
