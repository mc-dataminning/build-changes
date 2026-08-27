import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqp implements dpv {
   public static final Codec<dqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dpb.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               gw.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dqp::new)
   );
   private final boolean b;
   private final List<dpb.a> c;
   @Nullable
   private final gw d;

   public dqp(boolean $$0, List<dpb.a> $$1, @Nullable gw $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dqp(boolean $$0, List<dpb.a> $$1, Optional<gw> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dpb.a> b() {
      return this.c;
   }

   @Nullable
   public gw c() {
      return this.d;
   }
}
