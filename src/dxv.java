import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxv implements dxw {
   public static final Codec<dxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dxv::new)
   );
   private final Optional<ib> b;
   private final boolean c;

   private dxv(Optional<ib> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dxv a(ib $$0, boolean $$1) {
      return new dxv(Optional.of($$0), $$1);
   }

   public static dxv a() {
      return new dxv(Optional.empty(), false);
   }

   public Optional<ib> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
