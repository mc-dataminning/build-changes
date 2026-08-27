import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqk implements dpq {
   public static final Codec<dqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dow.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               gu.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dqk::new)
   );
   private final boolean b;
   private final List<dow.a> c;
   @Nullable
   private final gu d;

   public dqk(boolean $$0, List<dow.a> $$1, @Nullable gu $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dqk(boolean $$0, List<dow.a> $$1, Optional<gu> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dow.a> b() {
      return this.c;
   }

   @Nullable
   public gu c() {
      return this.d;
   }
}
