import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dyo implements dxu {
   public static final Codec<dyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dxa.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ib.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dyo::new)
   );
   private final boolean b;
   private final List<dxa.a> c;
   @Nullable
   private final ib d;

   public dyo(boolean $$0, List<dxa.a> $$1, @Nullable ib $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dyo(boolean $$0, List<dxa.a> $$1, Optional<ib> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dxa.a> b() {
      return this.c;
   }

   @Nullable
   public ib c() {
      return this.d;
   }
}
