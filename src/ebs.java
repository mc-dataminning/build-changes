import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ebs implements eay {
   public static final Codec<ebs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               eae.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               im.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ebs::new)
   );
   private final boolean b;
   private final List<eae.a> c;
   @Nullable
   private final im d;

   public ebs(boolean $$0, List<eae.a> $$1, @Nullable im $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ebs(boolean $$0, List<eae.a> $$1, Optional<im> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<eae.a> b() {
      return this.c;
   }

   @Nullable
   public im c() {
      return this.d;
   }
}
