import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dtf implements dtg {
   public static final Codec<dtf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hv.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dtf::new)
   );
   private final Optional<hv> b;
   private final boolean c;

   private dtf(Optional<hv> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dtf a(hv $$0, boolean $$1) {
      return new dtf(Optional.of($$0), $$1);
   }

   public static dtf a() {
      return new dtf(Optional.empty(), false);
   }

   public Optional<hv> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
