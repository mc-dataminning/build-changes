import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dwx implements dwy {
   public static final Codec<dwx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dwx::new)
   );
   private final Optional<ib> b;
   private final boolean c;

   private dwx(Optional<ib> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dwx a(ib $$0, boolean $$1) {
      return new dwx(Optional.of($$0), $$1);
   }

   public static dwx a() {
      return new dwx(Optional.empty(), false);
   }

   public Optional<ib> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
