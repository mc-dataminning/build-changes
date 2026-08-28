import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ekp implements ejv {
   public static final Codec<ekp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ejb.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               jj.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ekp::new)
   );
   private final boolean b;
   private final List<ejb.a> c;
   @Nullable
   private final jj d;

   public ekp(boolean $$0, List<ejb.a> $$1, @Nullable jj $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ekp(boolean $$0, List<ejb.a> $$1, Optional<jj> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ejb.a> b() {
      return this.c;
   }

   @Nullable
   public jj c() {
      return this.d;
   }
}
