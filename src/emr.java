import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class emr implements elx {
   public static final Codec<emr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               eld.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               iv.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, emr::new)
   );
   private final boolean b;
   private final List<eld.a> c;
   @Nullable
   private final iv d;

   public emr(boolean $$0, List<eld.a> $$1, @Nullable iv $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private emr(boolean $$0, List<eld.a> $$1, Optional<iv> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<eld.a> b() {
      return this.c;
   }

   @Nullable
   public iv c() {
      return this.d;
   }
}
