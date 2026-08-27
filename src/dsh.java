import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsh implements drn {
   public static final Codec<dsh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dqt.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ht.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dsh::new)
   );
   private final boolean b;
   private final List<dqt.a> c;
   @Nullable
   private final ht d;

   public dsh(boolean $$0, List<dqt.a> $$1, @Nullable ht $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dsh(boolean $$0, List<dqt.a> $$1, Optional<ht> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dqt.a> b() {
      return this.c;
   }

   @Nullable
   public ht c() {
      return this.d;
   }
}
